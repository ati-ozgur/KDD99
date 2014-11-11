package testBench.ids.kdd99.modelHelpers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import testBench.ids.kdd99.Finals;
import weka.classifiers.AbstractClassifier;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.Utils;

public class ModelFilesHelper {

	static{
		createModelSaveFolder();
	}


	public static List<String>  getModelFileNames() {
		final File folder = new File(Finals.MODELS_SAVE_FOLDER);
		return  ModelFilesHelper.getModelFileNames(folder);
	}
	
	public static List<String>  getModelFileNames(final File folder) {
		
		List<String> listOfFileNames = new ArrayList<String>();
		
		String fileName;
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	continue;
	        } else {
	        	fileName = fileEntry.getName();
	        	if (fileName.endsWith(".model"))
	        	{
	        		
		        	listOfFileNames.add(fileName);
	        	}
	        }
	    }
	    return listOfFileNames;
	}
	
	
	
	public static void saveModels(Instances data, String pModelName
			,String classifierFullName, String optionString) {
		try {
			AbstractClassifier classifier = (AbstractClassifier) Class.forName(classifierFullName).newInstance();
			saveModels(data, pModelName, classifier, optionString);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
			
		}
	}
	
	private static void createModelSaveFolder()
	{
		File modelSaveFolder = new File(Finals.MODELS_SAVE_FOLDER);
		if (!modelSaveFolder.exists())
		{
		modelSaveFolder.mkdirs();
		}

	}


	public static void saveModels(Instances data, String pModelName
			,AbstractClassifier classifier, String optionString) {
		try {

			classifier.setOptions(Utils.splitOptions(optionString));
			classifier.buildClassifier(data); // build classifier

			String modelFullFileName = Finals.MODELS_SAVE_FOLDER + classifier.getClass().getName()
					+ pModelName  + ".model";
			SerializationHelper.write(modelFullFileName, classifier);
			System.out.println("Model ( " +modelFullFileName + ")Saved");


		} 
		catch (Exception e) {
			throw new RuntimeException(e);
			
		}
	}


	
}
