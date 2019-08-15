package testBench.ids.kdd99;


public class Finals {

    public static final String MODELS_SAVE_FOLDER = "Datasets/SavedModels/";
    public static final String ARFF_SAVE_FOLDER = "Datasets/SavedArff/";
    public static final String EVALUATION_RESULTS_SAVE_FOLDER = "Datasets/SavedEvaluations/";
    
    
    public static final String DATE_FORMAT_WITH_HOUR = "yyyyMMdd-HHmm";

    public static final String DATABASE_URL = "Datasets/test1.sqlite";
    public static final String JDBC_URL = "jdbc:sqlite:" + DATABASE_URL;
    public static final String RESOURCES = "build/resources/main/";
    public static final String DATASET_FILES = "Datasets/";
    

    public static final String MODEL_ARFF_BINARY = Finals.RESOURCES + "ModelKddCupBinary.arff";
    public static final String MODEL_ARFF_5CLASSES = Finals.RESOURCES + "ModelKddCup5Classes.arff";
    public static final String MODEL_ARFF_ALL_CLASSES = Finals.RESOURCES + "ModelKddCupAllClasses.arff";

    public static final int CLASS_ATT_NORMAL = 0;
    public static final int CLASS_ATT_ATTACK = 1;    
 
    public static final String EXT_WEKA_MODEL = ".weka";
    public static final String EXT_MOA_MODEL = ".moa";

    public static final int KDD_TRAIN_DATA_NODUP_COUNT = 1074992;
    public static final int KDD_TRAIN_DATA_COUNT = 4898431;
    public static final int TEST_CORRECTED_COUNT = 311029;




}




