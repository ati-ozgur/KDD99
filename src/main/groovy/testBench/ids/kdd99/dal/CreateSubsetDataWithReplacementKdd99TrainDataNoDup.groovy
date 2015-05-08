package testBench.ids.kdd99.dal;



import testBench.ids.kdd99.*;
import testBench.ids.kdd99.helpers.*;




println "CreateSubsetDataWithReplacementKdd99TrainDataNoDup.groovy"


final int MAX_ROW = 10;//Finals.KDD_TRAIN_DATA_NODUP_COUNT / 2;



int i=0;

print("[")
while(true)
{
    int rndNumber = RandomNumbersHelpers.randIntKddTrainDataNoDuplicate();
    print("" + rndNumber + ",")
    i++;

    if(i > MAX_ROW)
    {
        break;
    }


}

print("]")
