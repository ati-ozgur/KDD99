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



List<String> modelFileNames = ModelFilesHelper.getModelFileNamesWeka()

Instances trainDataset = DataSetHelper.getTrainDatasetFull();

for(String modelFileName: modelFileNames)
{

    String[] argList = new String[2];
    argList[0] = "modelFileName";
    argList[1] = modelFileName;

    TestOneModelUsingWekaInTrainingDataSet.main(argList)

}


