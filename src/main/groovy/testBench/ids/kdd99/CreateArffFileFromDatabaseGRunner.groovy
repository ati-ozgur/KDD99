package testBench.ids.kdd99


println "Hello from groovy"

//weka.core.SystemInfo.main(null);

String fileName = "createFullKdd99DatasetLimit10"

String sqlFileName ="${fileName}.sql"

String fileNameCombined = "${fileName}.arff"

println sqlFileName
println fileNameCombined


String sql = new File(Resources.SQL_MAIN_FOLDER + sqlFileName).text



// ArffFileFromDatabase m = new ArffFileFromDatabase();
