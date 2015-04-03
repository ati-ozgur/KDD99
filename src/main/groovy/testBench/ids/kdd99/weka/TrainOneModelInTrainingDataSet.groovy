package testBench.ids.kdd99.weka


import java.util.List;

import weka.core.Instances;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;



String options = ""
String classifierName = ""

println args

firstArg = args[0];

if(firstArg == "classifierName")
{
    shortClassifierName = args[1];
    if (classifierName == null)
    {
        println "$shortClassifierName is not found"
        return;
    }
    classifierName =  ClassifierNameHelper.getLongName(shortClassifierName)

    if(args.length > 2 && args[2] == "classifierOptions")
    {
        options = args[3];
    }
}

if(firstArg == "classifierFullString")
{
    String classifierFullString = args[1]
    int firstSpace = classifierFullString.indexOf(" ");
    classifierName = classifierFullString.substring(0,firstSpace);
    options = classifierFullString.substring(firstSpace,classifierFullString.length())

    println classifierName
    println options
}





System.gc();
String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";
data = MyUtilsForWekaInstanceHelper.getInstanceFromFile(Finals.ARFF_SAVE_FOLDER + datasetName + ".arff");
Date trainingStartTime = DateHelper.getNow();
long modelSize = ModelFilesHelper.saveModel(data,datasetName,classifierName,options);


RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();


Date trainingFinishTime = DateHelper.getNow();

MlTrainResultsDal.Ekle(
    datasetName
    ,classifierName
    ,options
    ,trainingStartTime
    ,trainingFinishTime
    ,runtimeInformation
    ,modelSize)






