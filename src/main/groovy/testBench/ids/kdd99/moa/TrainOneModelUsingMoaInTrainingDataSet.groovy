package testBench.ids.kdd99.moa;



import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;
import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;



import moa.options.*;
import weka.core.*;
import moa.core.*;
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
    classifierName =  ClassifierNameHelperMoa.getLongName(shortClassifierName)

    if(args.length > 2 && args[2] == "classifierOptions")
    {
        options = args[3];
    }
}

if(firstArg == "classifierFullString")
{
    String classifierFullString = args[1]
    int firstSpace = classifierFullString.indexOf(" ");
    if (firstSpace > 0)
    {
        classifierName = classifierFullString.substring(0,firstSpace);
        options = classifierFullString.substring(firstSpace,classifierFullString.length())
    }
    else
    {
        classifierName = classifierFullString;
    }

    println classifierName
    println options
}


String datasetName = DataSetFiles.KddcupTrainingDatasetForBinaryFileName;

String datasetFullFileName = DataSetFiles.KddcupTrainingDatasetForBinaryFullFileName;

String modelName = classifierName
String modelFullFileName = Finals.MODELS_SAVE_FOLDER + modelName + ".moa";
println(modelFullFileName);


                // create standard options
FlagOption suppressStatusOutputOption = new FlagOption("suppressStatusOutput", 'S' as char,"Suppress the task status output that is normally send to stderr.");
FlagOption suppressResultOutputOption = new FlagOption("suppressResultOutput", 'R' as char,"Suppress the task result output that is normally send to stdout.");
IntOption statusUpdateFrequencyOption = new IntOption("statusUpdateFrequency",'F' as char, "How many milliseconds to wait between status updates.", 1000, 0, Integer.MAX_VALUE);



moa.options.Option[] extraOptions = [ suppressStatusOutputOption, suppressResultOutputOption, statusUpdateFrequencyOption];

String cliString = "LearnModel -l ( $classifierName $options ) -s (ArffFileStream -f $datasetFullFileName -c -1) -m 5000000  -O $modelFullFileName"

println(cliString)

System.gc();

// parse options
Date trainingStartTime = DateHelper.getNow();

Task task = (Task) ClassOption.cliStringToObject(cliString, Task.class, extraOptions);
Classifier result =  task.doTask();;





println(result)
println(result.getClass())

Measurement[] measurements = result.getModelMeasurements();

int trainingInstances = 0;

for(Measurement m: measurements) {
    if(m.getName().equals("model training instances"))
    {
        trainingInstances = m.getValue();
    }
}


long modelSize = ModelFilesHelper.getModelFileSize(modelFullFileName);


RuntimeInformation runtimeInformation = RuntimeInformationHelper.getRuntimeInformation();


Date trainingFinishTime = DateHelper.getNow();


MlTrainResults trainResults = new MlTrainResults(runtimeInformation);

trainResults.datasetName = datasetName;
trainResults.classifierName = classifierName;
trainResults.classifierOptions = options;
trainResults.trainingStartTime = trainingStartTime;
trainResults.trainingFinishTime = trainingFinishTime;
trainResults.modelSize = modelSize;
trainResults.ModelName = modelFullFileName;
trainResults.NumberOfInstances = trainingInstances;



MlTrainResultsDal.Ekle(trainResults);
