package testBench.ids.kdd99.dal

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;


if (args == null || args.length == 0)
{
        println "sqlFileName is not found"
        return;

}


firstArg = args[0];

if(firstArg == "sqlFileName")
{
    sqlFileName = args[1];
    if (sqlFileName == null)
    {
        println "sqlFileName is not found"
        return;
    }
}


sqlFileName ="${sqlFileName}.sql"

String sqlFileNameCombined = "${sqlFileName}.arff"


String sql = new File(Resources.SQL_DatasetPreperationsScripts + sqlFileName).text


CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(sql,sqlFileNameCombined)
