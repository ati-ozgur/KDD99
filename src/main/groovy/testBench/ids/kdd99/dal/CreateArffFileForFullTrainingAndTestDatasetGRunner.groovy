package testBench.ids.kdd99.dal

import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;
import testBench.ids.kdd99.*;


//weka.core.SystemInfo.main(null);

def createArffFileFromSqlFileName(String sqlFileName,String arffFileName)
{
	sqlFileName ="${sqlFileName}.sql"

	String sqlFileNameCombined = "${arffFileName}.arff"


	String sql = new File(Resources.SQL_KDD99ETLScripts + sqlFileName).text



	CreateArffFilesFromDatabase.createArffFileFromDatabaseQuery(sql,sqlFileNameCombined)

}


listSqlFiles = ['createFullKdd99TrainingDatasetForBinary'
,'createFullKdd99TrainingDatasetFor5Classes'
,'createFullKdd99TrainingDatasetForAllClasses'
,'createFullKdd99TestDatasetForBinary'
,'createFullKdd99TestDatasetFor5Classes'
,'createFullKdd99TestDatasetForAllClasses'

]

listArffFileNames = ['Kdd99TrainingDatasetForBinary'
	,'Kdd99TrainingDatasetFor5Classes'
	,'Kdd99TrainingDatasetForAllClasses'
	,'Kdd99TestDatasetForBinary'
	,'Kdd99TestDatasetFor5Classes'
	,'Kdd99TestDatasetForAllClasses'
	]


for(int i=0;i<listSqlFiles.size();i++)
{

    String sqlFileName = listSqlFiles[i];
    String arffFileName = listArffFileNames[i];
    print " ${sqlFileName}" 
    print " ${arffFileName}" 
    createArffFileFromSqlFileName(sqlFileName,arffFileName)
}









