package testBench.ids.kdd99.helpers.datasetHelpers;


import java.util.ArrayList;

import testBench.ids.kdd99.Finals;
import weka.core.Instances;

public class CreateArffFilesFromDatabase {

    

    
    
    public static void createArffFileFromDatabaseQuery(String sql,
            String fileName) {
    	def f = new File(Finals.ARFF_SAVE_FOLDER);
    	if (!f.exists())
    	{
    		f.mkdir()
    	}
        Instances SampleInstance = null;
        if(fileName.contains("Binary")){
             SampleInstance = MyUtilsForWekaInstanceHelper.getKddCupSampleInstancesForBinary();
        }
        if(fileName.contains("5Classes")){
             SampleInstance = MyUtilsForWekaInstanceHelper.getKddCupSampleInstancesFor5Classes();
        }
        if(fileName.contains("AllClasses")){
             SampleInstance = MyUtilsForWekaInstanceHelper.getKddCupSampleInstancesForAllClasses();
        }

        
        
        Instances data2 = InstancesFromDatabase.getInstanceDataFromDatabase(sql);
        MyUtilsForWekaInstanceHelper.combineInstances(SampleInstance, Finals.ARFF_SAVE_FOLDER +  fileName,data2);

    }
    
}
