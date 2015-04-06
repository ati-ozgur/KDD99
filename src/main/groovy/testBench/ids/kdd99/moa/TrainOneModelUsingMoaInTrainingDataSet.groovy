package testBench.ids.kdd99.moa;



import testBench.ids.kdd99.*;

import moa.options.*;
import weka.core.*;
import moa.tasks.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.streams.*;

int numInstances=5 * 1000 * 1000;


String options = ""
String classifierName = ""

println args

firstArg = args[0];

if(firstArg == "classifierName")
{
    shortClassifierName = args[1];
    if (shortClassifierName == null)
    {
        println "$shortClassifierName is not found"
        return;
    }
    classifierName =  ClassifierNameHelper.getLongName(shortClassifierName)

    if(args.length > 2 && args[2] == "classifierOptions")
    {
        options = args[3];
    }
}

if(firstArg == "classifierFullString")
{
    String classifierFullString = args[1]
    int firstSpace = classifierFullString.indexOf(" ");
    classifierName = classifierFullString.substring(0,firstSpace);
    options = classifierFullString.substring(firstSpace,classifierFullString.length())

    println classifierName
    println options
}



String datasetName = "combined_createFullKdd99TrainingDatasetForBinary";
String datasetFullFileName = Finals.ARFF_SAVE_FOLDER + datasetName + ".arff";

println(datasetFullFileName);

String modelName = classifierName
String modelFullFileName = Finals.MODELS_SAVE_FOLDER + modelName + ".moa";
println(modelFullFileName);


                // create standard options
FlagOption suppressStatusOutputOption = new FlagOption("suppressStatusOutput", 'S' as char,"Suppress the task status output that is normally send to stderr.");
FlagOption suppressResultOutputOption = new FlagOption("suppressResultOutput", 'R' as char,"Suppress the task result output that is normally send to stdout.");
IntOption statusUpdateFrequencyOption = new IntOption("statusUpdateFrequency",'F' as char, "How many milliseconds to wait between status updates.", 1000, 0, Integer.MAX_VALUE);



moa.options.Option[] extraOptions = [ suppressStatusOutputOption, suppressResultOutputOption, statusUpdateFrequencyOption];

String cliString = "LearnModel -l $classifierName $options -s (ArffFileStream -f $datasetFullFileName -c -1) -m 5000000  -O $modelFullFileName"

println(cliString)

// parse options
Task task = (Task) ClassOption.cliStringToObject(cliString, Task.class, extraOptions);
Object result =  task.doTask();;

println(result)
println(result.getClass())