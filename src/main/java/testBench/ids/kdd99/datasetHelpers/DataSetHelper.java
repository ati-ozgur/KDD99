package testBench.ids.kdd99.datasetHelpers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.ConverterUtils.DataSource;

import testBench.ids.kdd99.*;

public class DataSetHelper {


    public static Instances getTrainDatasetFull()
    {
    	String fileNameTrainDataSet = DataSetFiles.KddcupTrainDataArff;
    	return MyUtilsForWekaInstanceHelper.getInstanceFromFile(fileNameTrainDataSet);
        
    }

}
