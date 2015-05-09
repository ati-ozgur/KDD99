package testBench.ids.kdd99

import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.datasetHelpers.*;



firstArg = args[0];

if(firstArg == "sqlFileName")
{
    sqlFileName = args[1];
    if (sqlFileName == null)
    {
        println "$sqlFileName is not found"
        return;
    }
}


sqlFileName ="${sqlFileName}.sql"

String sqlFileNameCombined = "${sqlFileName}.arff"


String sql = new File(Resources.SQL_KDD99ETLScripts + sqlFileName).text

ArffFileFromDatabase m = new ArffFileFromDatabase(sql,sqlFileNameCombined);

CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(m)
