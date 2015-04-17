package testBench.ids.kdd99.moa


import java.util.List;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


import weka.classifiers.*;
import weka.core.Instances;

import moa.options.*;
import weka.core.*;
import moa.tasks.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.streams.*



println args

firstArg = args[0];
String modelFileName

if(firstArg == "modelFileName")
{
    modelFileName = args[1];

}


if (modelFileName == null)
{
    println "$modelFileName is not found"
    return;
}







Date testStartTime = DateHelper.getNow();

RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();

String datasetName = DataSetFiles.KddcupTestDatasetForBinaryFileName;


EvaluationInformation evaluationInformation = EvaluateModelHelperMoa.evaluateModelBinary(modelFileName,datasetName);

println(evaluationInformation);


Date testFinishTime = DateHelper.getNow();




MlTestResultsDal.Ekle(

      evaluationInformation.ClassifierName 
    ,  evaluationInformation.getDatasetType() 
    ,  evaluationInformation.DatasetName
    ,  evaluationInformation.InstancesProcessed
    ,  evaluationInformation.ModelFileName 
    ,  evaluationInformation.confusionMatrix()
    ,  testStartTime  
    ,  testFinishTime  
    , runtimeInformation
);

