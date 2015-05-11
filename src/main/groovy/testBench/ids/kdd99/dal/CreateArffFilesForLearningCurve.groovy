package testBench.ids.kdd99.dal

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.datasetHelpers.*;


int startSize = 1024;
int finishSize = 537497;

for(int i=startSize; i<finishSize; i = i*2 )
{
    println(i);
}


return;

sqlFileName ="Kdd99TrainSubsetWithReplacementTemplate.sql"

String sqlFileNameCombined = "${sqlFileName}.arff"


String sql = new File(Resources.SQL_DatasetPreperationsScripts + sqlFileName).text

ArffFileFromDatabase m = new ArffFileFromDatabase(sql,sqlFileNameCombined);

CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(m)
