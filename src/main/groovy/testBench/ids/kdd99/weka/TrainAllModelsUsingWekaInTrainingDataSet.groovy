package testBench.ids.kdd99.weka


import java.util.List;

import weka.core.Instances;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.weka.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;

classifierListName = "fast"

if(args.length > 0)
{
	firstArg = args[0];

	if(firstArg == "classifierListName")
	{
	    classifierListName = args[1];
	}

}

println(args)

def classifierList = ClassifiersAndArgumentsWeka.getClassifierList(classifierListName)

println(classifierList)

String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";
Instances data = MyUtilsForWekaInstanceHelper.getInstanceFromFile(Finals.ARFF_SAVE_FOLDER + datasetName + ".arff");

classifierList.each() {
	classifierAndOption-> 

	System.gc();


	String classifierName = classifierAndOption.Classifier
	String options = classifierAndOption.Options



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






