package testBench.ids.kdd99.helpers;



import testBench.ids.kdd99.*;
import testBench.ids.kdd99.helpers.*;

import weka.core.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.core.*;
import moa.streams.*;
import moa.tasks.*;

public class EvaluateModelHelperMoa
{


    public static EvaluationInformation evaluateModelBinary(
         String modelName = "moa.classifiers.bayes.NaiveBayes.moa"
        ,  String datasetName = DataSetFiles.KddcupTestDatasetForBinaryFileName
        , int maxInstances=5 * 1000 * 1000

    )
    {



        String datasetNameFullFileName = Finals.ARFF_SAVE_FOLDER + datasetName + ".arff";

        String modelFullFileName = Finals.MODELS_SAVE_FOLDER + modelName;




        Classifier model = SerializeUtils.readFromFile(new File(modelFullFileName))
        int classIndex = -1;
        ArffFileStream stream = new ArffFileStream(datasetNameFullFileName, classIndex)



        long instancesProcessed = 0;




        long tp = 0;
        int fp = 0;
        long tn = 0;
        int fn= 0;


        while (stream.hasMoreInstances()
                && ((maxInstances < 0) || (instancesProcessed < maxInstances))) {
            instancesProcessed++;
            Instance testInst = (Instance) stream.nextInstance().copy();
            int trueClass = (int) testInst.classValue();
            if(trueClass == Finals.CLASS_ATT_NORMAL)
            {
                if( model.correctlyClassifies(testInst))
                {
                    tn++;
                }
                else
                {
                    fp++;            
                }
            }
            if(trueClass == Finals.CLASS_ATT_ATTACK)
            {
                if( model.correctlyClassifies(testInst))
                {
                    tp++;
                }
                else
                {
                    fn++;            
                }
            }
        }
        EvaluationInformation cf = new EvaluationInformation();
        cf.TruePositive = tp;
        cf.FalsePositive = fp;
        cf.TrueNegative = tn;
        cf.FalseNegative = fn;
        cf.InstancesProcessed = instancesProcessed;

        cf.ClassifierName = model.getClass().getName();
        cf.DatasetName = datasetName;



        cf.ModelFileName = modelName;
        return cf;
    }

}

public class EvaluationInformation
{
        public String getDatasetType()
        {
            if (DatasetName.contains("Test") || DatasetName.contains("test") )
            {
                return "Test";
            }
            else
            {
                return "Train";
            }

        }
        public String DatasetName;
        public String ModelFileName;
        public String ClassifierName;

        public long TruePositive = 0;
        public long FalsePositive = 0;
        public long TrueNegative = 0;
        public long FalseNegative = 0;
        public long InstancesProcessed;

        public double[][] confusionMatrix()
        {
            double[][] _confusionMatrix = new double[2][2];
            _confusionMatrix[0][0] = TruePositive;
            _confusionMatrix[0][1] = FalsePositive;
            _confusionMatrix[1][0] = TrueNegative;
            _confusionMatrix[1][1] = FalseNegative;
            return _confusionMatrix;

        }

 

        public String toString()
        {
            StringBuilder sb = new StringBuilder();
            sb.append("DatasetType : " + getDatasetType() + "\n" )
            sb.append("ClassifierName : $ClassifierName \n" )
            sb.append("instancesProcessed : $InstancesProcessed \n" )
            sb.append("true positive : $TruePositive\n" )
            sb.append("true negative : $TrueNegative\n" )
            sb.append("false positive : $FalsePositive\n" )
            sb.append("false negative : $FalseNegative\n" )

        }

}