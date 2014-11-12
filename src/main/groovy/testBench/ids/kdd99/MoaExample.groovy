package testBench.ids.kdd99;


import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;

import weka.core.Instance;
import weka.core.Instances;


import moa.streams.generators.*;


int numInstances=10000;

Classifier learner = new HoeffdingTree ( ) ;
RandomRBFGenerator stream = new RandomRBFGenerator ( ) ;
stream.prepareForUse();

 learner.setModelContext(stream.getHeader()) ;
 learner.prepareForUse() ;

 int numberSamplesCorrect=0;
 int numberSamples=0;
 boolean isTesting = true ;
 while( stream . hasMoreInstances () && numberSamples < numInstances){
     Instance trainInst = stream.nextInstance() ;
     if ( isTesting ){
         if ( learner.correctlyClassifies(trainInst )){
             numberSamplesCorrect++;
         }
     }
     numberSamples++;
     learner.trainOnInstance(trainInst) ;
 }



 double accuracy = 100.0*(double) numberSamplesCorrect / (double) numberSamples ;
 
 println (numberSamples+ " instances processed with " + accuracy+ "% accuracy" )


