package testBench.ids.kdd99


import java.util.List;

import weka.core.Instances;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


Instances data = null;

ClassifiersAndArguments.classifierList.each() {
	classifierAndOption-> 

	System.gc();

	String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";

	String classifierName = classifierAndOption.Classifier
	String options = classifierAndOption.Options


	data = MyUtilsForWekaInstanceHelper.getInstanceFromFile(Finals.ARFF_SAVE_FOLDER + datasetName + ".arff");

	Date trainingStartTime = DateHelper.getNow();
	ModelFilesHelper.saveModel(data,datasetName,classifierName,options);


	RuntimeInformation inf = RuntimeInformationHelper.getRuntimeInformation();


	Date trainingFinishTime = DateHelper.getNow();

	MlTrainResultsDal.Ekle(
	    datasetName
	    ,classifierName
	    ,options
	    ,trainingStartTime
	    ,trainingFinishTime
	    ,inf)

}; 






