package testBench.ids.kdd99.weka


import java.util.List;

import weka.core.*;
import weka.classifiers.*;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;
import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;



String options = ""
String classifierName = ""


println "args"
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
    classifierName =  ClassifierNameHelperWeka.getLongName(shortClassifierName)

    if(args.length > 2 && args[2] == "classifierOptions")
    {
        options = args[3];
    }
}
if(firstArg == "classifierFullName")
{
    classifierName = args[1];


    if(args.length > 2 && args[2] == "classifierOptions")
    {
        options = args[3];
    }
}
if(firstArg == "classifierFullString")
{
    String classifierFullString = args[1]
    int firstSpace = classifierFullString.indexOf(" ");
    if(firstSpace > 0)
    {
        classifierName = classifierFullString.substring(0,firstSpace);
        options = classifierFullString.substring(firstSpace,classifierFullString.length())
    }
    else
    {
        classifierName = classifierFullString
    }


}

if (classifierName == null)
{
    println "$classifierName is not found"
    return;
}



println classifierName
println options




System.gc();
def data = DataSetHelper.getTrainDatasetFull();


Date trainingStartTime = DateHelper.getNow();

Classifier classifier = ModelFilesHelper.buildModel(data,classifierName,options)


long modelSize = ModelFilesHelper.saveModelOnly(classifier,data);
String modelFullFileName = ModelFilesHelper.getModelFullFileNameWeka(classifier,data);


RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();


Date trainingFinishTime = DateHelper.getNow();



MlTrainResults trainResults = new MlTrainResults(runtimeInformation);

trainResults.datasetName = data.relationName();
trainResults.classifierName = classifierName;
trainResults.classifierOptions = options;
trainResults.trainingStartTime = trainingStartTime;
trainResults.trainingFinishTime = trainingFinishTime;
trainResults.modelSize = modelSize;
trainResults.ModelName = modelFullFileName;
trainResults.NumberOfInstances =     data.numInstances();



MlTrainResultsDal.Ekle(trainResults);







