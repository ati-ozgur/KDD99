package examples;



import testBench.ids.kdd99.*;

import weka.core.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.streams.*;

int numInstances=5 * 1000 * 1000;



String datasetNameFullFileName = DataSetFiles.KddcupTrainingDatasetForBinaryArff;



Classifier classifer = new HoeffdingTree ( ) ;
int classIndex = -1;

ArffFileStream stream = new ArffFileStream(datasetNameFullFileName, classIndex)

stream.prepareForUse();

 classifer.setModelContext(stream.getHeader()) ;
 classifer.prepareForUse() ;

 int numberSamplesCorrect=0;
 int numberSamples=0;
 boolean isTesting = true ;
 while( stream.hasMoreInstances () && numberSamples < numInstances){
     Instance trainInst = stream.nextInstance() ;
     if ( isTesting ){
         if ( classifer.correctlyClassifies(trainInst )){
             numberSamplesCorrect++;
         }
     }
     numberSamples++;
     classifer.trainOnInstance(trainInst) ;
 }



 double accuracy = 100.0*(double) numberSamplesCorrect / (double) numberSamples ;
 
 println (numberSamples+ " instances processed with " + accuracy+ "% accuracy" )


