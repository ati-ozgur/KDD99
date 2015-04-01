package testBench.ids.kdd99


import java.util.List;

import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instances;



List<String> modelFileNames = ModelFilesHelper.getModelFileNames()

Instances trainDataset = DataSetHelper.getTrainDatasetFull();

for(String modelFileName: modelFileNames)
{
    println(modelFileName)
    Classifier cls = ModelFilesHelper.loadModel(modelFileName);
    Evaluation eval = new Evaluation(trainDataset);
    eval.evaluateModel(cls, trainDataset);
    println(eval)

    println(eval.toMatrixString())
}







Date testStartTime = DateHelper.getNow();



RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();


Date trainingFinishTime = DateHelper.getNow();
/*
MlTrainResultsDal.Ekle(
    datasetName
    ,classifierName
    ,options
    ,testStartTime
    ,trainingFinishTime
    ,runtimeInformation
    ,modelSize)

*/




