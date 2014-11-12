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

	String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";

	String classifierName = classifierAndOption.Classifier
	String options = classifierAndOption.Options


	data = MyUtilsForWekaInstanceHelper.getInstanceFromFile(Finals.ARFF_SAVE_FOLDER + datasetName + ".arff");

	Date trainingStartTime = DateHelper.getNow();
	ModelFilesHelper.saveModels(data,datasetName,classifierName,options);

	long freeMemory = Runtime.getRuntime().freeMemory();	
	long totalMemory = Runtime.getRuntime().totalMemory();
	long maxMemory = Runtime.getRuntime().maxMemory();
	long usedMemory = totalMemory - freeMemory;

	Date trainingFinishTime = DateHelper.getNow();

	MlTrainResultsDal.Ekle(
	    datasetName
	    ,classifierName
	    ,options
	    ,trainingStartTime
	    ,trainingFinishTime
	    ,freeMemory
	    ,totalMemory
	    ,maxMemory
	    ,usedMemory)

}; 






