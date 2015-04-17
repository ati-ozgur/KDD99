package examples;



import testBench.ids.kdd99.*;

import weka.core.*;

import moa.options.*;
import moa.core.*;
import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.evaluation.*;

import moa.streams.*;
import moa.tasks.*;


String datasetFullFileName = DataSetFiles.KddcupTestDatasetForBinaryFullFileName;

String modelName = "moa.classifiers.bayes.NaiveBayes"
String modelFullFileName = Finals.MODELS_SAVE_FOLDER + modelName + ".moa";
println(modelFullFileName);


                // create standard options
FlagOption suppressStatusOutputOption = new FlagOption("suppressStatusOutput", 'S' as char,"Suppress the task status output that is normally send to stderr.");
FlagOption suppressResultOutputOption = new FlagOption("suppressResultOutput", 'R' as char,"Suppress the task result output that is normally send to stdout.");
IntOption statusUpdateFrequencyOption = new IntOption("statusUpdateFrequency",'F' as char, "How many milliseconds to wait between status updates.", 1000, 0, Integer.MAX_VALUE);


moa.options.Option[] extraOptions = [ suppressStatusOutputOption, suppressResultOutputOption, statusUpdateFrequencyOption];

String cliString = "EvaluateModel -m file:" + modelFullFileName + " -s (ArffFileStream -f " + datasetFullFileName + " -c -1) "


// parse options
Task task = (Task) ClassOption.cliStringToObject(cliString, Task.class, extraOptions);
moa.evaluation.LearningEvaluation result = (moa.evaluation.LearningEvaluation ) task.doTask();;
//if (suppressStatusOutputOption.isSet()) {
    
//}

println(result.getClass())

Measurement[] list = result.getMeasurements()

list.each{
	println(it)
}