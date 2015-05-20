package testBench.ids.kdd99.dal

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;



final int MAX_ROW = Finals.KDD_TRAIN_DATA_COUNT;

def listOfSize = [1024
,2048
,4096
,8192
,16384
,32768
,65536
,131072
,262144
,524288
,524288 * 2
,524288 * 3
,524288 * 4
,524288 * 5
,524288 * 6
,524288 * 7
,524288 * 8
,524288 * 9
,MAX_ROW

]

String templateName ="Kdd99TrainSubsetWithReplacement"; 

listOfSize.each{ i -> 

    println(i);
    sqlFileName ="${templateName}Template.sql"
    String sql = new File(Resources.SQL_DatasetPreperationsScripts + sqlFileName).text
    sql = sql.replace(":rowCount","" +i);
    //println(sql);

    String fileNameCombined = "${templateName}.arff"
    CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(sql,fileNameCombined)
}





