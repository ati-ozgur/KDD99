package testBench.ids.kdd99.dal;

import groovy.sql.Sql
import java.util.Date

import testBench.ids.kdd99.*

import testBench.ids.kdd99.helpers.*;


public class MlTrainResultsDal
{

private static final String SQL_INSERT = """
INSERT INTO ML_TRAIN_RESULTS 
(datasetName
,classifierName
,options
,trainingStartTime
,trainingFinishTime
,trainingDuration
,freeMemory
,totalMemory
,maxMemory
,usedMemory
,LocalMachineHostName
,JavaVersion
,OsArchitecture
,UserName
,JavaVmName
,OsName
,OsVersion
,AvailableProcessors
,ModelSize
,ModelName 
,NumberOfInstances

    ) 
VALUES 
( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?,?);"""




    public static void Ekle(MlTrainResults trainResults)
        {
            // insert as seconds
            def sqlEngine = Sql.newInstance(Finals.JDBC_URL);

            def params = [
            trainResults.datasetName
            ,trainResults.classifierName
            ,trainResults.classifierOptions
            ,trainResults.getTrainingStartTimeAsString()
            ,trainResults.getTrainingFinishTimeAsString()
            ,trainResults.getTrainingDuration()
            ,trainResults.freeMemory
            ,trainResults.totalMemory
            ,trainResults.maxMemory
            ,trainResults.usedMemory
            ,trainResults.localMachineHostName
            ,trainResults.javaVersion
            ,trainResults.osArchitecture
            ,trainResults.userName
            ,trainResults.javaVmName
            ,trainResults.osName
            ,trainResults.osVersion
            ,trainResults.availableProcessors
            ,trainResults.modelSize
            ,trainResults.modelName
            ,trainResults.numberOfInstances
            ];

            sqlEngine.execute(SQL_INSERT, params)
            sqlEngine.close()

        }

}














