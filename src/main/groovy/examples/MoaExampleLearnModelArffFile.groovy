package examples;



import testBench.ids.kdd99.*;

import weka.core.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.streams.*;
import moa.tasks.*;

int numInstances=5 * 1000 * 1000;



String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";
String datasetNameFullFileName = Finals.ARFF_SAVE_FOLDER + datasetName + ".arff";

println(datasetNameFullFileName);




Classifier classifer = new HoeffdingTree ( ) ;

int classIndex = -1;
ArffFileStream stream = new ArffFileStream(datasetNameFullFileName, classIndex)

stream.prepareForUse();

int numPasses = 1;
LearnModel lm =  LearnModel(classifer, stream, numInstances,numPasses)


lm.doTask()

