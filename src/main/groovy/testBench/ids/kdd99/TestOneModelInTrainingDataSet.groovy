package testBench.ids.kdd99


import java.util.List;

import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instances;

String modelFileName = "weka.classifiers.trees.J48combined_createFullKdd99TrainingDatasetForBinary.model"


Instances trainDataset = DataSetHelper.getTrainDatasetFull();


Classifier cls = ModelFilesHelper.loadModel(modelFileName);
Evaluation evaluation = new Evaluation(trainDataset);
evaluation.evaluateModel(cls, trainDataset);









Date testStartTime = DateHelper.getNow();

RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();

Date testFinishTime = DateHelper.getNow();


String datasetType = "Train"
String datasetName = trainDataset.relationName(); 

String classifierName = ClassifierNameHelper.getShortName(cls.getClass().getName());

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

