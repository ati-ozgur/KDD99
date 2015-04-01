package testBench.ids.kdd99


import java.util.List;

import weka.core.Instances;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


List<String> modelFileNames = ModelFilesHelper.getModelFileNames()

for(String modelFileName: modelFileNames)
{
    println(modelFileName)
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




