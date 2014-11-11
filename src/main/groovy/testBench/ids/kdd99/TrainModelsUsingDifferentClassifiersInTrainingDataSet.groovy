package testBench.ids.kdd99

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import weka.core.Instances;

import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;



Instances data = null;

new File("Datasets/SavedOutputs").mkdir();

ClassifiersAndArguments.classifierList.each() {
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


