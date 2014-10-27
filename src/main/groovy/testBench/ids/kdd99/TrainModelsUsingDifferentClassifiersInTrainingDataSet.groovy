package testBench.ids.kdd99

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import weka.core.Instances;

import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;

template = [ Classifier:"",Options:""]


j48_1 = [ Classifier:"weka.classifiers.trees.J48", Options:" -C 0.25 -M 2"]
j48_2 = [ Classifier:"weka.classifiers.trees.J48", Options:" -U"]
j48_3 = [ Classifier:"weka.classifiers.trees.J48", Options:" -S"]

SMO_1 = [ Classifier:"weka.classifiers.functions.SMO",Options:""]
SMO_2 = [ Classifier:"weka.classifiers.functions.SMO",Options:"-C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -C 250007 -E 1.0\""]

bayes1 = [Classifier:"weka.classifiers.bayes.BayesNet",Options:" -D -Q weka.classifiers.bayes.net.search.local.K2 -- -P 1 -S BAYES -E weka.classifiers.bayes.net.estimate.SimpleEstimator -- -A 0.5"]

naiveBayes1 = [ Classifier:"weka.classifiers.bayes.NaiveBayes",Options:""]


Logistic1 = [ Classifier:"weka.classifiers.functions.Logistic",Options:"-R 1.0E-8 -M -1"]
MultilayerPerceptron1 = [ Classifier:"weka.classifiers.functions.MultilayerPerceptron",Options:" -L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H 3"]

RBFNetwork1 = [ Classifier:"weka.classifiers.functions.RBFNetwork",Options:" -B 2 -S 1 -R 1.0E-8 -M -1 -W 0.1"]
RBFClassifier1 = [ Classifier:"weka.classifiers.functions.RBFClassifier",Options:" -N 2 -R 0.01 -L 1.0E-6 -C 2 -P 1 -E 1 -S 1"]
SGD1 = [ Classifier:"weka.classifiers.functions.SGD",Options:" -F 0 -L 0.01 -R 1.0E-4 -E 500"]
SimpleLogistic1 = [ Classifier:"weka.classifiers.functions.SimpleLogistic",Options:" -I 0 -M 500 -H 50 -W 0.0"]


AdaBoostM1_1 = [ Classifier:"weka.classifiers.meta.AdaBoostM1",Options:" -P 100 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump"]
		
		
DecisionTable = [ Classifier:"weka.classifiers.rules.DecisionTable",Options:" -X 1 -S \"weka.attributeSelection.BestFirst -D 1 -N 5\""]
OneR = [ Classifier:"weka.classifiers.rules.OneR",Options:"-B 6"]
ZeroR = [ Classifier:"weka.classifiers.rules.ZeroR",Options:""]
		
JRip  = [ Classifier:"weka.classifiers.rules.JRip",Options:" -F 3 -N 2.0 -O 2 -S 1"]
PART  = [ Classifier:"weka.classifiers.rules.PART",Options:"-M 2 -C 0.25 -Q 1"]

RandomForest  = [ Classifier:"weka.classifiers.trees.RandomForest",Options:" -I 10 -K 0 -S 1 -num-slots 1"]
DecisionStump  = [ Classifier:"weka.classifiers.trees.DecisionStump",Options:"weka.classifiers.trees.LMT" ,"-I -1 -M 15 -W 0.0"]
LMT  = [ Classifier:"",Options:""]
RandomTree  = [ Classifier:"weka.classifiers.trees.RandomTree",Options:" -K 0 -M 1.0 -S 1"]
REPTree  = [ Classifier:"weka.classifiers.trees.REPTree",Options:"-M 2 -V 0.001 -N 3 -S 1 -L -1 -I 0.0"]
IBk  = [ Classifier:"weka.classifiers.lazy.IBk",Options:"-K 1 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\""]



classifierList = [
j48_1 ,
j48_2 ,
j48_3 ,
SMO_1 ,
SMO_2 ,
bayes1 ,
naiveBayes1 ,
Logistic1 ,
MultilayerPerceptron1 ,
RBFNetwork1 ,
RBFClassifier1 ,
SGD1 ,
SimpleLogistic1 ,
AdaBoostM1_1 ,
DecisionTable ,
OneR ,
ZeroR ,
JRip  ,
PART  ,
RandomForest  ,
DecisionStump  ,
LMT  ,
RandomTree  ,
REPTree  ,
IBk  
]

Instances data = null;

classifierList.each() {
	classifierAndOption-> 

	String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";

	String classifierName = classifierAndOption.Classifier
	String options = classifierAndOption.Options


	StringBuilder oneTrainRun = new StringBuilder();
	data = MyUtilsForWekaInstanceHelper.getInstanceFromFile(Finals.ARFF_SAVE_FOLDER + datasetName + ".arff");

	oneTrainRun.append("---------------------------------------------------------------------------------------Start\n");
	oneTrainRun.append(String.format("Training Start at %s for dataset %s\n", getNowAsFormatted(), datasetName)) ;
	oneTrainRun.append(String.format("Training Start at %s for model %s\n", getNowAsFormatted(), classifierName)) ;
	ModelFilesHelper.saveModels(data,datasetName,classifierName,options);
	oneTrainRun.append(String.format("freeMemory %s \n" , Runtime.getRuntime().freeMemory()));
	oneTrainRun.append(String.format("totalMemory %s \n" , Runtime.getRuntime().totalMemory()));
	oneTrainRun.append(String.format("maxMemory %s \n " , Runtime.getRuntime().maxMemory()));
	
	oneTrainRun.append(String.format("Training Finish at %s for dataset %s \n", getNowAsFormatted(), datasetName) );
	oneTrainRun.append(String.format("Training Finish at %s for Model %s  \n", getNowAsFormatted(), classifierName) );
	oneTrainRun.append("---------------------------------------------------------------------------------------Finish\n");




	String fileName = "Datasets/SavedOutputs/${datasetName}-${classifierName}.txt";
	String output = oneTrainRun.toString()
	File f = new File(fileName)

	f.withWriter{ it << output }

}; 



private static String getNowAsFormatted() {
	Calendar c = Calendar.getInstance();
	Date d = c.getTime();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	return sdf.format(d);
	
}


