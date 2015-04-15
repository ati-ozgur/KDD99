package testBench.ids.kdd99

import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.datasetHelpers.*;


//weka.core.SystemInfo.main(null);


sqlFileList = ['createFullKdd99TrainingDatasetForBinary','createFullKdd99TestDatasetForBinary']

sqlFileList.each() {
	fileName-> 
print " ${fileName}" 
createArffFileFromSqlFileName(fileName)
}; 






def createArffFileFromSqlFileName(String fileName)
{
	String sqlFileName ="${fileName}.sql"

	String fileNameCombined = "${fileName}.arff"

	println sqlFileName
	println fileNameCombined


	String sql = new File(Resources.SQL_KDD99ETLScripts + sqlFileName).text



	ArffFileFromDatabase m = new ArffFileFromDatabase(sql,fileNameCombined);

	CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(m)

}


