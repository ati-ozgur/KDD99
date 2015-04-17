package examples;



import testBench.ids.kdd99.*;

import weka.core.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.streams.*;
import moa.tasks.*;

int numInstances=5 * 1000 * 1000;



String datasetFullFileName = DataSetFiles.KddcupTestDatasetForBinaryFullFileName;




Classifier classifer = new HoeffdingTree ( ) ;

int classIndex = -1;
ArffFileStream stream = new ArffFileStream(datasetNameFullFileName, classIndex)

stream.prepareForUse();

int numPasses = 1;
LearnModel lm =  LearnModel(classifer, stream, numInstances,numPasses)


lm.doTask()

