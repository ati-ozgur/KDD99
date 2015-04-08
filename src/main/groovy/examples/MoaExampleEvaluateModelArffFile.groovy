package examples;



import testBench.ids.kdd99.*;

import weka.core.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.core.*;
import moa.streams.*;
import moa.tasks.*;

int maxInstances=5 * 1000 * 1000;



String datasetName = "combined_createFullKdd99TestDatasetForBinary";
String datasetNameFullFileName = Finals.ARFF_SAVE_FOLDER + datasetName + ".arff";

println(datasetNameFullFileName);


String modelName = "moa.classifiers.bayes.NaiveBayes.moa"
String modelFullFileName = Finals.MODELS_SAVE_FOLDER + modelName;
println(datasetNameFullFileName);



EvaluateModel task = new EvaluateModel();

Classifier model = SerializeUtils.readFromFile(new File(modelFullFileName))

int classIndex = -1;
ArffFileStream stream = new ArffFileStream(datasetNameFullFileName, classIndex)


task.modelOption.setCurrentObject(model);
task.streamOption.setCurrentObject(stream);
//task.evaluatorOption.setCurrentObject(evaluator);
task.maxInstancesOption.setValue(maxInstances);

long instancesProcessed = 0;


final int NORMAL = 0;
final int ATTACK = 1;

long tp = 0;
int fp = 0;
long tn = 0;
int fn= 0;


while (stream.hasMoreInstances()
        && ((maxInstances < 0) || (instancesProcessed < maxInstances))) {
    instancesProcessed++;
    Instance testInst = (Instance) stream.nextInstance().copy();
    int trueClass = (int) testInst.classValue();
    if(trueClass == NORMAL)
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
    if(trueClass == ATTACK)
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

println("instancesProcessed : $instancesProcessed")
println("true positive : $tp")
println("true negative : $tn")
println("false positive : $fp")
println("false negative : $fn")




//task.doTask()

