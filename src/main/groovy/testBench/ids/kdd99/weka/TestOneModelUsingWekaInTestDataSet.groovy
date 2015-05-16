package testBench.ids.kdd99.weka


import java.util.List;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;
import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instances;




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


Instances testDataset = DataSetHelper.getTestDatasetFull();


Classifier cls = ModelFilesHelper.loadModel(modelFileName);
Evaluation evaluation = new Evaluation(testDataset);
evaluation.evaluateModel(cls, testDataset);



println(evaluation.toMatrixString());
println("\n");
println(evaluation.toSummaryString());
println("\n");

println(evaluation.confusionMatrix());





Date testStartTime = DateHelper.getNow();

RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();

Date testFinishTime = DateHelper.getNow();


String datasetType = "Test"
String datasetName = testDataset.relationName(); 

String classifierName = cls.getClass().getName();

println classifierName;

MlTestResultsDal.Ekle(

      classifierName 
    ,  datasetType 
    ,  datasetName 
    ,  (long) evaluation.numInstances() 
    ,  modelFileName 
    ,  evaluation.confusionMatrix()
    ,  testStartTime  
    ,  testFinishTime  
    , runtimeInformation
);

