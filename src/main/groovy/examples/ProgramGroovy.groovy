package examples;


import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.helpers.*;
import java.util.Date;


// weka.core.SystemInfo.main(null);



def exampleMlTrainResults()
{
    Date d1 = DateHelper.getNow();
    final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
    long t=d1.getTime();
    Date d2=new Date(t + (10 * ONE_MINUTE_IN_MILLIS));

    RuntimeInformation inf = RuntimeInformationHelper.getRuntimeInformation();
    MlTrainResultsDal.Ekle(
        DataSetFiles.KddcupTestDatasetForBinaryFullFileName
        ,"weka.classifiers.bayes.NaiveBayes"
        ,""
        ,d1
        ,d2
        ,inf
        )
}


exampleMlTrainResults()


