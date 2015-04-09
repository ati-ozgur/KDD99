package testBench.ids.kdd99.weka


import java.util.List;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


import weka.classifiers.*;
import weka.core.Instances;

import moa.options.*;
import weka.core.*;
import moa.tasks.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.streams.*



println args

firstArg = args[0];
String modelFileName

if(firstArg == "modelFileName")
{
    modelFileName = args[1];

}


if (modelFileName == null)
{
    println "$modelFileName is not found"
    return;
}




int numInstances=5 * 1000 * 1000;



String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";
String datasetNameFullFileName = Finals.ARFF_SAVE_FOLDER + datasetName + ".arff";

println(datasetNameFullFileName);



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
 

Instances trainDataset = DataSetHelper.getTrainDatasetFull();


Classifier cls = ModelFilesHelper.loadModel(modelFileName);
Evaluation evaluation = new Evaluation(trainDataset);
evaluation.evaluateModel(cls, trainDataset);



println(evaluation.toMatrixString());
println("\n");
println(evaluation.toSummaryString());
println("\n");

println(evaluation.confusionMatrix());





Date testStartTime = DateHelper.getNow();

RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();

Date testFinishTime = DateHelper.getNow();


String datasetType = "Train"

String classifierName = cls.getClass().getName();

println classifierName;

MlTestResultsDal.Ekle(

      classifierName 
    ,  datasetType 
    ,  trainDataset.relationName()
    ,  (long) evaluation.numInstances() 
    ,  modelFileName 
    ,  evaluation.confusionMatrix()
    ,  testStartTime  
    ,  testFinishTime  
    , runtimeInformation
);

