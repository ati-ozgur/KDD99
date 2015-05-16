package testBench.ids.kdd99.helpers.datasetHelpers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;

import testBench.ids.kdd99.*;

public class MyUtilsForWekaInstanceHelper {

    public static Instances getInstanceFromFile(String pFileName)
    {
        Instances data = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pFileName));
            data = new Instances(reader);
            reader.close();
            // setting class attribute
            data.setClassIndex(data.numAttributes() - 1);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        } 
        return data;
        
    }

    public static Instances getKddCupSampleInstancesBinary() {
        Instances data = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Finals.MODEL_ARFF_BINARY));
            data = new Instances(reader);
            reader.close();
            // setting class attribute
            data.setClassIndex(data.numAttributes() - 1);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        } 
        return data;
    
    }
    public static void saveInstancesToFile(Instances dataset) {
        saveInstancesToFile(dataset,dataset.relationName());
    }
    
    public static void saveInstancesToFile(Instances dataset, String filename) {

        dataset.setRelationName(filename);

        ArffSaver saver = new ArffSaver();
            saver.setInstances(dataset);
            try {
                saver.setFile(new File(filename));
                saver.writeBatch();
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
    }

    public static void saveInstancesToFile(String contents,String filename) {
        
         FileWriter fstream;
         BufferedWriter out = null;
        try {
            fstream = new FileWriter(filename);
          out= new BufferedWriter(fstream);
          out.write(contents);

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        finally
        {
          if(out!= null)
          {
              try
              {
                  out.close();            
              }
                catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
        
          }
        }
    }
    
    public static void combineInstances(Instances instancesWhoseHeaderWillBeUsed,
            String fileName,Instances... InstancesToBeCombined) {
        DataSource headerSource = new DataSource(instancesWhoseHeaderWillBeUsed);
        int totalNumberOfInstances = 0;

        Instances headerStructure;

        FileWriter fstream;
        BufferedWriter out = null;

        try {

        for(Instances instancesToAdd:InstancesToBeCombined)
        {
            totalNumberOfInstances += instancesToAdd.numInstances();
        }
        String newFileName = fileName.replace(".arff","-" +totalNumberOfInstances + ".arff");
        
        fstream = new FileWriter(newFileName);
        out = new BufferedWriter(fstream);
        headerStructure = headerSource.getStructure();





        String relationName = new File(fileName).getName() + "-" + totalNumberOfInstances;

        String headerStructureAsString = headerStructure.toString().replaceFirst("@relation.*","@relation " + relationName);


        out.write(headerStructureAsString);

        for(Instances instancesToAdd:InstancesToBeCombined)
        {
            DataSource sourceInstanceToAdd = new DataSource(instancesToAdd);

                Instances structureInstanceToAdd;
                structureInstanceToAdd = sourceInstanceToAdd.getStructure();
                while (sourceInstanceToAdd.hasMoreElements(structureInstanceToAdd)) {
                    String elementAsString = sourceInstanceToAdd.nextElement(structureInstanceToAdd)
                            .toString();
                    out.write(elementAsString);
                    out.write("\n");
                    
                }
            
        }
        
        

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        finally
        {
          if(out!= null)
          {
              try
              {
                  out.close();            
              }
                catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

          }
        }


        
    }

    public static String arffHeaderPart(Instances dataset)
    {
        StringBuffer text = new StringBuffer();
        
        text.append(Instances.ARFF_RELATION).append(" ").
          append(weka.core.Utils.quote(dataset.relationName())).append("\n\n");
        for (int i = 0; i < dataset.numAttributes(); i++) {
          text.append(dataset.attribute(i)).append("\n");
        }
        return text.toString();
    }
    
}

