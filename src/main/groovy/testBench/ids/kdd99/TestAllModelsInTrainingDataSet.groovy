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
    Evaluation evaluation = new Evaluation(trainDataset);
    evaluation.evaluateModel(cls, trainDataset);
    println("evaluation")
    println(evaluation)

    println("correct");
    println(evaluation.correct());

    println("incorrect");
    println(evaluation.incorrect());

    println("kappa");
    println(evaluation.kappa());


    println("errorRate");
    println(evaluation.errorRate());
    println(1 - evaluation.errorRate());


    println("falseNegativeRate 0 ");
    println(evaluation.falseNegativeRate(0));
    println("falseNegativeRate 1 ");
    println(evaluation.falseNegativeRate(1));

    println("falsePositiveRate 0 ");
    println(evaluation.falsePositiveRate(0));
    println("falsePositiveRate 1 ");
    println(evaluation.falsePositiveRate(1));

    println("fMeasure 0 ");
    println(evaluation.fMeasure(0));
    println("fMeasure 1 ");
    println(evaluation.fMeasure(1));



    println(evaluation.toSummaryString("\nResults\n======\n", false));
    println("\n");
    println(evaluation.toClassDetailsString());
    println("\n");
    println(evaluation.toMatrixString());
    println("\n");

    println(evaluation.toMatrixString());
    println("\n");
    println(evaluation.toSummaryString());
    println("\n");

    println(evaluation.confusionMatrix());
    break;

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




