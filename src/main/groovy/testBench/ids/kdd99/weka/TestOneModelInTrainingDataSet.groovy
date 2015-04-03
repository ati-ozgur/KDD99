package testBench.ids.kdd99.weka


import java.util.List;

import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
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


Instances trainDataset = DataSetHelper.getTrainDatasetFull();


Classifier cls = ModelFilesHelper.loadModel(modelFileName);
Evaluation evaluation = new Evaluation(trainDataset);
evaluation.evaluateModel(cls, trainDataset);



println(evaluation.toMatrixString());
println("\n");
println(evaluation.toSummaryString());
println("\n");

println(evaluation.confusionMatrix());





Date testStartTime = DateHelper.getNow();

RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();

Date testFinishTime = DateHelper.getNow();


String datasetType = "Train"
String datasetName = trainDataset.relationName(); 

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

