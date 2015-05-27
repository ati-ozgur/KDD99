package testBench.ids.kdd99.dal;

import groovy.sql.Sql
import java.util.Date

import testBench.ids.kdd99.*

import testBench.ids.kdd99.helpers.*;


public class MlTestResultsDal
{



private static final String SQL_INSERT = """
INSERT INTO ML_TEST_RESULTS 
  (
    
     classifierName 
    , datasetType 
    , datasetName
    , numberOfInstances 
    , classifierModelFileName 
    , TruePositive 
    , FalsePositive 
    , TrueNegative 
    , FalseNegative 
    , testStartTime  
    , testFinishTime  
    , testDuration  
    , freeMemory  
    , totalMemory  
    , maxMemory  
    , usedMemory 
    , LocalMachineHostName 
    , JavaVersion 
    , OsArchitecture 
    , UserName 
    , JavaVmName 
    , OsName 
    , OsVersion 
    , AvailableProcessors 
    )
VALUES   (  ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,   ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )"""


    private static void EklePrivate(
     String classifierName 
    , String datasetType 
    , String datasetName 
    , long numberOfInstances 
    , String classifierModelFileName 
    , double TruePositive 
    , double FalsePositive 
    , double TrueNegative 
    , double FalseNegative     
    , Date testStartTime  
    , Date testFinishTime  
    , long freeMemory  
    , long totalMemory  
    , long maxMemory  
    , long usedMemory 
    , String LocalMachineHostName 
    , String JavaVersion 
    , String OsArchitecture 
    , String UserName 
    , String JavaVmName 
    , String OsName 
    , String OsVersion 
    , int AvailableProcessors 

        )

    {
            int testDuration = (testFinishTime.getTime() - testStartTime.getTime())/1000;

            def sqlEngine = Sql.newInstance(Finals.JDBC_URL);
            String testStartTimeAsString = DateHelper.getFormattedStringFromDate(testStartTime);
            String testFinishTimeAsString = DateHelper.getFormattedStringFromDate(testFinishTime);

            def params = [
            
           classifierName 
        ,  datasetType 
        ,  datasetName 
        ,  numberOfInstances 
        ,  classifierModelFileName 
        ,  TruePositive 
        ,  FalsePositive 
        ,  TrueNegative 
        ,  FalseNegative  
        ,  testStartTimeAsString  
        ,  testFinishTimeAsString  
        ,  testDuration  
        ,  freeMemory  
        ,  totalMemory  
        ,  maxMemory  
        ,  usedMemory 
        ,  LocalMachineHostName 
        ,  JavaVersion 
        ,  OsArchitecture 
        ,  UserName 
        ,  JavaVmName 
        ,  OsName 
        ,  OsVersion 
        ,  AvailableProcessors 

            ];

            sqlEngine.execute(SQL_INSERT, params)
            sqlEngine.close()

    }

    private static void EklePrivate(
     String classifierName 
    , String datasetType 
    , String datasetName 
    , long numberOfInstances 
    , String classifierModelFileName 
    , double TruePositive 
    , double FalsePositive 
    , double TrueNegative 
    , double FalseNegative 
    , Date testStartTime  
    , Date testFinishTime  
    ,RuntimeInformation runtimeInformation

        )
    {
            EklePrivate(
          classifierName 
        ,  datasetType 
        ,  datasetName 
        ,  numberOfInstances 
        ,  classifierModelFileName 
        ,  TruePositive 
        ,  FalsePositive 
        ,  TrueNegative 
        ,  FalseNegative  
        ,  testStartTime  
        ,  testFinishTime  
        ,runtimeInformation.FreeMemory
        ,runtimeInformation.TotalMemory
        ,runtimeInformation.MaxMemory
        ,runtimeInformation.UsedMemory
        ,runtimeInformation.LocalMachineHostName
        ,runtimeInformation.JavaVersion
        ,runtimeInformation.OsArchitecture
        ,runtimeInformation.UserName
        ,runtimeInformation.JavaVmName
        ,runtimeInformation.OsName
        ,runtimeInformation.OsVersion
        ,runtimeInformation.AvailableProcessors

                )
    }

    public static void Ekle(
     String classifierName 
    , String datasetType 
    , String datasetName 
    , long numberOfInstances 
    , String classifierModelFileName 
    , double[][] confusionMatrix
    , Date testStartTime  
    , Date testFinishTime  
    , RuntimeInformation runtimeInformation

        )
    {


    double TruePositive = confusionMatrix[0][0];

    double FalsePositive  = confusionMatrix[0][1];
    double TrueNegative  = confusionMatrix[1][0];
    double FalseNegative   = confusionMatrix[1][1];

    println(confusionMatrix)
    println("TruePositive: " + TruePositive)
    println("TrueNegative: " + TrueNegative)
    println("FalsePositive: " + FalsePositive)
    println("FalseNegative: " + FalseNegative)



        EklePrivate(
       classifierName 
    ,  datasetType 
    ,  datasetName 
    ,  numberOfInstances 
    ,  classifierModelFileName 
    ,  TruePositive 
    ,  FalsePositive 
    ,  TrueNegative 
    ,  FalseNegative  
    ,  testStartTime  
    ,  testFinishTime  
    ,  runtimeInformation.FreeMemory
    ,  runtimeInformation.TotalMemory
    ,  runtimeInformation.MaxMemory
    ,  runtimeInformation.UsedMemory
    ,  runtimeInformation.LocalMachineHostName
    ,  runtimeInformation.JavaVersion
    ,  runtimeInformation.OsArchitecture
    ,  runtimeInformation.UserName
    ,  runtimeInformation.JavaVmName
    ,  runtimeInformation.OsName
    ,  runtimeInformation.OsVersion
    ,  runtimeInformation.AvailableProcessors

            )
    }





}














