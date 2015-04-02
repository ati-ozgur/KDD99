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

    String[] argList = new String[2];
    argList[0] = "modelFileName";
    argList[1] = modelFileName;

    TestOneModelInTrainingDataSet.main(argList)

}


