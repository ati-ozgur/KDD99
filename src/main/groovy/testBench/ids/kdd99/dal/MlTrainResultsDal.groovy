package testBench.ids.kdd99.dal;

import groovy.sql.Sql
import java.util.Date

import testBench.ids.kdd99.*




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
    ) 
VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?);"""



    public static void Ekle(String datasetName
        ,String classifierName
        ,String options
        ,String trainingStartTime
        ,String trainingFinishTime
        ,Long freeMemory
        ,Long totalMemory
        ,Long maxMemory
        ,Long usedMemory)
        {
            Date trainingStartTimeAsDate = DateHelper.getDateFromFormattedString(trainingStartTime)
            Date trainingFinishTimeAsDate = DateHelper.getDateFromFormattedString(trainingFinishTime)
            Ekle( datasetName
                , classifierName
                , options
                , trainingStartTimeAsDate
                , trainingFinishTimeAsDate
                , freeMemory
                , totalMemory
                , maxMemory
                , usedMemory)
        }

    public static void Ekle(String datasetName
        ,String classifierName
        ,String options
        ,Date trainingStartTime
        ,Date trainingFinishTime
        ,RuntimeInformation runtimeInformation
        )
        {
            // insert as seconds
            int trainingDuration = (trainingFinishTime.getTime() - trainingStartTime.getTime())/1000;

            def sqlEngine = Sql.newInstance(Finals.JDBC_URL);
            String trainingStartTimeAsString = DateHelper.getFormattedStringFromDate(trainingStartTime);
            String trainingFinishTimeAsString = DateHelper.getFormattedStringFromDate(trainingFinishTime);

            def params = [
            datasetName
            ,classifierName
            ,options
            ,trainingStartTimeAsString
            ,trainingFinishTimeAsString
            ,trainingDuration
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
            ];

            sqlEngine.execute(SQL_INSERT, params)
            sqlEngine.close()

        }

}














