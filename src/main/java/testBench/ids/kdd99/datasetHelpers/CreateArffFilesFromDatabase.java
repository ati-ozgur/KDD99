package testBench.ids.kdd99.datasetHelpers;


import java.util.ArrayList;

import testBench.ids.kdd99.Finals;
import testBench.ids.kdd99.modelHelpers.ArffFileFromDatabase;
import weka.core.Instances;

public class CreateArffFilesFromDatabase {

    
    
    public static void createArffFileFromDatabaseQuery(ArffFileFromDatabase model) {
    
        createArffFileFromDatabaseQuery(model.getSql(),model.getFilenameForCombined());
    }
    
    
    public static void createArffFileFromDatabaseQuery(String sql,
            String fileName) {

        Instances SampleInstance = MyUtilsForWekaInstanceHelper.getKddCupSampleInstancesBinary();

        String filenameForDatabase = "fromDatabase_" + fileName;
        String filenameForCombined = "combined_" + fileName;
        Instances data2 = InstancesFromDatabase.getInstanceDataFromDatabase(sql);
        //MyUtilsForWekaInstanceHelper.saveInstancesToFile(data2, Finals.ARFF_SAVE_FOLDER + filenameForDatabase);


        MyUtilsForWekaInstanceHelper.combineInstances(SampleInstance, Finals.ARFF_SAVE_FOLDER +  filenameForCombined,data2);
    }
    
}
