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


    public static ConfusionMatrix evaluateModelBinary(
          String datasetName = "combined_createFullKdd99TestDatasetForBinary"
        , String modelName = "moa.classifiers.bayes.NaiveBayes.moa"
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
        ConfusionMatrix cf = new ConfusionMatrix();
        cf.TruePositive = tp;
        cf.FalsePositive = fp;
        cf.TrueNegative = tn;
        cf.FalseNegative = fn;
        cf.InstancesProcessed = instancesProcessed;
        return cf;
    }

}

public class ConfusionMatrix
{
       public long TruePositive = 0;
       public long FalsePositive = 0;
       public long TrueNegative = 0;
       public long FalseNegative = 0;
       public long InstancesProcessed;



       public String toString()
       {
            StringBuilder sb = new StringBuilder();
            sb.append("instancesProcessed : $InstancesProcessed \n" )
            sb.append("true positive : $TruePositive\n" )
            sb.append("true negative : $TrueNegative\n" )
            sb.append("false positive : $FalsePositive\n" )
            sb.append("false negative : $FalseNegative\n" )

       }

}