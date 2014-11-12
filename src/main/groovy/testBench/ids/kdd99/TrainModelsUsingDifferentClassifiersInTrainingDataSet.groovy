package testBench.ids.kdd99


import java.util.List;

import weka.core.Instances;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


Instances data = null;

new File("Datasets/SavedOutputs").mkdir();
int kb = 1024;
int mb = kb*1024;
int gb = mb*1024;

ClassifiersAndArguments.classifierList.each() {
	classifierAndOption-> 

	String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";

	String classifierName = classifierAndOption.Classifier
	String options = classifierAndOption.Options


	StringBuilder oneTrainRun = new StringBuilder();
	data = MyUtilsForWekaInstanceHelper.getInstanceFromFile(Finals.ARFF_SAVE_FOLDER + datasetName + ".arff");

	Date trainingStartTime = DateHelper.getNow();
	oneTrainRun.append("---------------------------------------------------------------------------------------Start\n");
	oneTrainRun.append(String.format("Training Start at %s for dataset %s\n", DateHelper.getNowAsFormatted(), datasetName)) ;
	oneTrainRun.append(String.format("Training Start at %s for model %s\n", DateHelper.getNowAsFormatted(), classifierName)) ;

	ModelFilesHelper.saveModels(data,datasetName,classifierName,options);

	long freeMemory = Runtime.getRuntime().freeMemory();	
	long totalMemory = Runtime.getRuntime().totalMemory();
	long maxMemory = Runtime.getRuntime().maxMemory();
	long usedMemory = totalMemory - freeMemory;


	oneTrainRun.append(String.format("freeMemory %s as bytes \n" , freeMemory));
	oneTrainRun.append(String.format("freeMemory %s as kilo bytes \n" , freeMemory/kb));
	oneTrainRun.append(String.format("freeMemory %s as mega bytes \n" , freeMemory/mb));
	oneTrainRun.append(String.format("freeMemory %s as giga bytes \n" , freeMemory/gb));

	oneTrainRun.append(String.format("totalMemory %s as bytes \n" , totalMemory));
	oneTrainRun.append(String.format("totalMemory %s as kilo bytes \n" , totalMemory/kb));
	oneTrainRun.append(String.format("totalMemory %s as mega bytes \n" , totalMemory/mb));
	oneTrainRun.append(String.format("totalMemory %s as giga bytes \n" , totalMemory/gb));

	oneTrainRun.append(String.format("maxMemory %s as bytes \n" , maxMemory));
	oneTrainRun.append(String.format("maxMemory %s as kilo bytes \n" , maxMemory/kb));
	oneTrainRun.append(String.format("maxMemory %s as mega bytes \n" , maxMemory/mb));
	oneTrainRun.append(String.format("maxMemory %s as giga bytes \n" , maxMemory/gb));


	oneTrainRun.append(String.format("usedMemory %s as bytes \n" , usedMemory));
	oneTrainRun.append(String.format("usedMemory %s as kilo bytes \n" , usedMemory/kb));
	oneTrainRun.append(String.format("usedMemory %s as mega bytes \n" , usedMemory/mb));
	oneTrainRun.append(String.format("usedMemory %s as giga bytes \n" , usedMemory/gb));
	
	oneTrainRun.append(String.format("Training Finish at %s for dataset %s \n", DateHelper.getNowAsFormatted(), datasetName) );
	oneTrainRun.append(String.format("Training Finish at %s for Model %s  \n", DateHelper.getNowAsFormatted(), classifierName) );
	oneTrainRun.append("---------------------------------------------------------------------------------------Finish\n");

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

	String fileName = "Datasets/SavedOutputs/${datasetName}-${classifierName}.txt";
	String output = oneTrainRun.toString()
	File f = new File(fileName)

	f.withWriter{ it << output }

}; 






