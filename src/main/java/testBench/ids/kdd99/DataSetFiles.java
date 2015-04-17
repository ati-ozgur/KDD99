package testBench.ids.kdd99;


public class DataSetFiles
{
    public static final String KddcupExampleData = Finals.DATASET_FILES + "KddcupExampleData";
    public static final String KddcupTrainData = Finals.DATASET_FILES + "kddcup.data";

    private static final String _TrainDatasetName = "Kdd99TrainingDatasetForBinary";
    private static final String _TestDatasetName = "Kdd99TestDatasetForBinary";

    public static final String KddcupTrainingDatasetForBinaryFileName =  _TrainDatasetName+ "-4898431.arff";
    public static final String KddcupTestDatasetForBinaryFileName =  _TestDatasetName+ "-311029.arff";



    public static final String KddcupTrainingDatasetForBinaryFullFileName = Finals.DATASET_FILES + "SavedArff/" + _TrainDatasetName+ "-4898431.arff";
    public static final String KddcupTestDatasetForBinaryFullFileName = Finals.DATASET_FILES + "SavedArff/"+ _TestDatasetName +"-311029.arff";


    public static final String KddcupTrainingDatasetForBinaryFullTemplateArff = Finals.DATASET_FILES + "SavedArff/"+ _TrainDatasetName + ".arff";
    public static final String KddcupTestDatasetForBinaryFullTemplateArff = Finals.DATASET_FILES + "SavedArff/" + _TestDatasetName + ".arff";



}