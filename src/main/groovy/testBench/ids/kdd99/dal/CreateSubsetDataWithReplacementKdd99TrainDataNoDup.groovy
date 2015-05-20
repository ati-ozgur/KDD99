package testBench.ids.kdd99.dal;


import testBench.ids.kdd99.*;
import testBench.ids.kdd99.helpers.*;




println "CreateSubsetDataWithReplacementKdd99TrainDataNoDup.groovy"


final int MAX_ROW = Finals.KDD_TRAIN_DATA_NODUP_COUNT;



int i=0;


def fos = new FileOutputStream("Datasets/RandomNumbers_Seed" + RandomNumbersHelpers.getSeed() + ".txt")

while(true)
{
    int rndNumber = RandomNumbersHelpers.randIntKddTrainDataNoDuplicate();
    fos << "" + rndNumber + "\n";
    i++;
    if (i % 100 == 0)
    {
        println(i)
    }
    if(i > MAX_ROW)
    {

        break;
    }


}
