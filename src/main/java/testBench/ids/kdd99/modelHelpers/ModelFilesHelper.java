package testBench.ids.kdd99.modelHelpers;

import java.io.File;
import java.util.*;

import testBench.ids.kdd99.*;


import weka.classifiers.*;
import weka.core.Instances;
import weka.core.SerializationHelper;
import weka.core.Utils;

import testBench.ids.kdd99.*;


public class ModelFilesHelper {

	static{
		createModelSaveFolder();
	}


	private static void createModelSaveFolder()
	{
		File modelSaveFolder = new File(Finals.MODELS_SAVE_FOLDER);
		if (!modelSaveFolder.exists())
		{
		modelSaveFolder.mkdirs();
		}

	}


	public static List<String>  getModelFileNamesWeka() {
		final 	File folder = new File(Finals.MODELS_SAVE_FOLDER);
		return  ModelFilesHelper.getModelFileNamesWeka(folder);
	}
	
	public static List<String>  getModelFileNamesWeka(final File folder) {
		
		List<String> listOfFileNames = new ArrayList<String>();
		
		String fileName;
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	continue;
	        } else {
	        	fileName = fileEntry.getName();
	        	if (fileName.endsWith(".weka"))
	        	{
	        		
		        	listOfFileNames.add(fileName);
	        	}
	        }
	    }
	    return listOfFileNames;
	}
	
	
	

	

	public static Classifier loadModel(String modelFileName)
	{
		try
		{
			Classifier cls = (Classifier) weka.core.SerializationHelper
				.read(Finals.MODELS_SAVE_FOLDER + modelFileName);
			return cls;

		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
			
		}
	}

	public static long getModelFileSize( String pModelFullFileName) {
		try {
			String modelFullFileName = pModelFullFileName;

			long fileLength = new File(modelFullFileName).length();

			return fileLength;

		} 
		catch (Exception ex) {
			throw new RuntimeException(ex);
			
		}
	}

	public static AbstractClassifier buildModel(
			Instances data
			, String classifierFullName
			, String optionString)
	{
		AbstractClassifier classifier = null;
	try {

		classifier = (AbstractClassifier) Class.forName(classifierFullName).newInstance();
		if(optionString != null || !optionString.equals("") )
		{
			classifier.setOptions(Utils.splitOptions(optionString));
		}
		classifier.buildClassifier(data);
	} catch (Exception e) {
		throw new RuntimeException(e);
	 }
		return classifier;

	}

	private static String ArrayToString(String[] arr)
	{
		StringBuilder sb = new StringBuilder();
		for(String s: arr)
		{
			sb.append(s.trim());
		}
		return sb.toString();

	}

	private static String replaceUnwantedCharacters(String str)
	{
		str = str.replace("\"","");
		str = str.replace(" ","_");
		return str;

	}

	private static String getModelFullFileNameWeka(AbstractClassifier classifier)
	{
		String classifierFullName = classifier.getClass().getName();
		String optionString = replaceUnwantedCharacters(ArrayToString(classifier.getOptions()));


		String modelFullFileName = Finals.MODELS_SAVE_FOLDER + classifierFullName
		+ optionString  + Finals.EXT_WEKA_MODEL;

		return modelFullFileName;
	}


	public static long saveModelOnly(
			AbstractClassifier classifier
			) {
		try {

			String modelFullFileName = getModelFullFileNameWeka(classifier);

			SerializationHelper.write(modelFullFileName, classifier);

			long fileLength = new File(modelFullFileName).length();

			System.out.println("Model ( " +modelFullFileName + ")Saved, file length is : " + fileLength );

			return fileLength;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
			
		}
	}
	


	
}
