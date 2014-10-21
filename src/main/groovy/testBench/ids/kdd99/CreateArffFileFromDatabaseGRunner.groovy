package testBench.ids.kdd99

import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.datasetHelpers.*;

println "Hello from groovy"

//weka.core.SystemInfo.main(null);

String fileName = "createFullKdd99DatasetForBinary"

String sqlFileName ="${fileName}.sql"

String fileNameCombined = "${fileName}.arff"

println sqlFileName
println fileNameCombined


String sql = new File(Resources.SQL_MAIN_FOLDER + sqlFileName).text



ArffFileFromDatabase m = new ArffFileFromDatabase(sql,fileNameCombined);

CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(m)
