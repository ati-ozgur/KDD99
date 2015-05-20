package testBench.ids.kdd99.dal;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.helpers.*;
import java.util.*;



println "CreateSubsetDataWithoutReplacementKdd99TrainData.groovy"



final int MAX_ROW = Finals.KDD_TRAIN_DATA_COUNT;



def liste = []
liste.addAll(1..MAX_ROW);


int seed = RandomNumbersHelpers.getSeed()

Random rnd = new Random(seed);

Collections.shuffle(liste,rnd)

int i=0;

def fos = new FileOutputStream("Datasets/RandomNumbersWithoutReplacement_Seed" + RandomNumbersHelpers.getSeed() + ".txt")

while(i < liste.size())
{
    int rndNumber = liste.get(i);
    fos << "" + rndNumber + "\n";
    i++;
    if (i % 100 == 0)
    {
        println(i)
    }



}
