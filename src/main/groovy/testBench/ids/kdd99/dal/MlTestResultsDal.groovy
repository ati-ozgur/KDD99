package testBench.ids.kdd99.dal;

import groovy.sql.Sql
import java.util.Date

import testBench.ids.kdd99.*




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
    , DetectionRate 
    , TruePositiveRate 
    , TrueNegativeRate 
    , FalsePositiveRate 
    , Precision 
    , F1Rate 
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
    );
VALUES   (  ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? )"""


    private static void EklePrivate(
     String classifierName 
    , String datasetType 
    , String datasetName 
    , long numberOfInstances 
    , String classifierModelFileName 
    , double DetectionRate 
    , double TruePositiveRate 
    , double TrueNegativeRate 
    , double FalsePositiveRate 
    , double Precision 
    , double F1Rate 
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
        ,  DetectionRate 
        ,  TruePositiveRate 
        ,  TrueNegativeRate 
        ,  FalsePositiveRate 
        ,  Precision 
        ,  F1Rate 
        ,  testStartTime  
        ,  testFinishTime  
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
    , double DetectionRate 
    , double TruePositiveRate 
    , double TrueNegativeRate 
    , double FalsePositiveRate 
    , double Precision 
    , double F1Rate 
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
        ,  DetectionRate 
        ,  TruePositiveRate 
        ,  TrueNegativeRate 
        ,  FalsePositiveRate 
        ,  Precision 
        ,  F1Rate 
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
     double DetectionRate = 0;
     double TruePositiveRate = 0;
     double TrueNegativeRate = 0;
     double FalsePositiveRate = 0;
     double Precision = 0;
     double F1Rate = 0;
    

        EklePrivate(
      classifierName 
    ,  datasetType 
    ,  datasetName 
    ,  numberOfInstances 
    ,  classifierModelFileName 
    ,  DetectionRate 
    ,  TruePositiveRate 
    ,  TrueNegativeRate 
    ,  FalsePositiveRate 
    ,  Precision 
    ,  F1Rate 
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





}














