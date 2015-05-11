package testBench.ids.kdd99.dal

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.datasetHelpers.*;


int startSize = 1024;
int finishSize = 1074993;


String templateName ="Kdd99TrainSubsetWithReplacement"; 

for(int i=startSize; i<finishSize; i = i*2 )
{
    println(i);
    sqlFileName ="${templateName}Template.sql"
    String sql = new File(Resources.SQL_DatasetPreperationsScripts + sqlFileName).text
    sql = sql.replace(":rowCount","" +i);
    //println(sql);

    String fileNameCombined = "${templateName}.arff"
    ArffFileFromDatabase m = new ArffFileFromDatabase(sql,fileNameCombined);
    CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(m)

}



