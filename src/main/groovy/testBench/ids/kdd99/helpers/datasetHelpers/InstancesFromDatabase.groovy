package testBench.ids.kdd99.helpers.datasetHelpers;

import weka.core.Instances;
import weka.experiment.DatabaseUtils;
import weka.experiment.InstanceQuery;

public class InstancesFromDatabase {


    public static Instances getInstanceDataFromDatabase(String pSql,
            String pInstanceRelationName) {
        Instances data = null;
    
        try {
            DatabaseUtils utils = new DatabaseUtils();

            InstanceQuery query = new InstanceQuery();
            
            query.setQuery(pSql);
            
            data = query.retrieveInstances();
            data.setRelationName(pInstanceRelationName);

            
            if (data.classIndex() == -1)
            {
                 data.setClassIndex(data.numAttributes() - 1);
            }
        } 
            
            catch (Exception e) {
            throw new RuntimeException(e);
        }
        return data;
    }



    public static Instances getInstanceDataFromDatabase(String pSql) {
        return getInstanceDataFromDatabase(pSql, "KDD99SimpleRelation");
    }

}

