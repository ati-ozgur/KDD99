package testBench.ids.kdd99.dal;


import groovy.sql.Sql
import testBench.ids.kdd99.*;
import testBench.ids.kdd99.helpers.*;




println "CreateSubsetDataWithReplacementKdd99TrainDataNoDup.groovy"


final int MAX_ROW = Finals.KDD_TRAIN_DATA_NODUP_COUNT / 2;

def sqlEngine = Sql.newInstance(Finals.JDBC_URL);


int i=0;

def SQL_INSERT = "INSERT INTO SUBSET_IDS_WITH_REPLACEMENT(val) VALUES(?)"

while(true)
{
    int rndNumber = RandomNumbersHelpers.randIntKddTrainDataNoDuplicate();
    sqlEngine.execute(SQL_INSERT, rndNumber)
    i++;
    if(i > MAX_ROW)
    {

        break;
    }


}
sqlEngine.close()