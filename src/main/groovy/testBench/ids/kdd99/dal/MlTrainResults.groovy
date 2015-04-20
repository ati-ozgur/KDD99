package testBench.ids.kdd99.dal;


import testBench.ids.kdd99.*

import testBench.ids.kdd99.helpers.*;


public class MlTrainResults
{

    int id;
    String datasetName;
    String classifierName;
    String classifierOptions;
    Date trainingStartTime;
    Date trainingFinishTime;
    long freeMemory;
    int totalMemory;
    int maxMemory;
    int usedMemory;
    String LocalMachineHostName;
    String JavaVersion;
    String OsArchitecture;
    String UserName;
    String JavaVmName;
    String OsName;
    String OsVersion;
    int AvailableProcessors;
    long ModelSize;
    String ModelName;
    int NumberOfInstances;


    public MlTrainResults()
    {


    }

    public int getTrainingDuration()
    {
        int t= (trainingFinishTime.getTime() - trainingStartTime.getTime())/1000;
        return t;
    }

    public String getTrainingStartTimeAsString()
    {
        return DateHelper.getFormattedStringFromDate(trainingStartTime);
    }
    public String getTrainingFinishTimeAsString()
    {
        return DateHelper.getFormattedStringFromDate(trainingFinishTime);
    }


    public MlTrainResults(RuntimeInformation runtimeInformation)
    {
        freeMemory = runtimeInformation.FreeMemory;
        totalMemory = runtimeInformation.TotalMemory;
        maxMemory = runtimeInformation.MaxMemory;
        usedMemory = runtimeInformation.UsedMemory;
        localMachineHostName = runtimeInformation.LocalMachineHostName;
        javaVersion= runtimeInformation.JavaVersion;
        osArchitecture= runtimeInformation.OsArchitecture;
        userName= runtimeInformation.UserName;
        javaVmName= runtimeInformation.JavaVmName;
        osName= runtimeInformation.OsName;
        osVersion= runtimeInformation.OsVersion;
        availableProcessors= runtimeInformation.AvailableProcessors;
    }


}
