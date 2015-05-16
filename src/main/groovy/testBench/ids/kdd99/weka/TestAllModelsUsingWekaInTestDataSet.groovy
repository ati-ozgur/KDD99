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

println("All Trained Model Count: " + modelFileNames.size());

println(modelFileNames)

//Instances trainDataset = DataSetHelper.getTrainDatasetFull();

for(int i=0;i< modelFileNames.size();i++)
{
    String modelFileName = modelFileNames.get(i);
    String[] argList = new String[2];
    argList[0] = "modelFileName";
    argList[1] = modelFileName;

    println("Testing Model number $i and name $modelFileName in full Training Dataset ")

    TestOneModelUsingWekaInTestDataSet.main(argList)

}


