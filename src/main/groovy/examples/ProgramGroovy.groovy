package examples;


import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.helpers.*;
import java.util.Date;

import testBench.ids.kdd99.*;


// weka.core.SystemInfo.main(null);



def exampleMlTrainResults()
{
    Date d1 = DateHelper.getNow();
    final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
    long t=d1.getTime();
    Date d2=new Date(t + (10 * ONE_MINUTE_IN_MILLIS));

    RuntimeInformation inf = RuntimeInformationHelper.getRuntimeInformation();
    MlTrainResults tr = new MlTrainResults(inf);

    tr.datasetName = DataSetFiles.KddcupTrainingDatasetForBinaryFileName;
    tr.classifierName = "weka.classifiers.bayes.NaiveBayes";
    tr.classifierOptions = "";
    tr.trainingStartTime = d1;
    tr.trainingFinishTime = d2;
    tr.modelSize = 9999;
    tr.ModelName = "deneme.wekaModel";
    tr.NumberOfInstances = 1234;





    MlTrainResultsDal.Ekle(tr);
}


exampleMlTrainResults()


