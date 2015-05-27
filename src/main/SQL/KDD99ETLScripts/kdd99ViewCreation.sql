DROP VIEW IF EXISTS ML_TRAIN_RESULTS_SUMMARY;

CREATE VIEW ML_TRAIN_RESULTS_SUMMARY AS
SELECT M.datasetName,
      M.classifierName,
      M.options,
      M.trainingStartTime,
      M.trainingFinishTime,
      M.trainingDuration  AS trainingDurationSeconds,
      M.trainingDuration / 60  AS trainingDurationMinutes,
      M.trainingDuration / (60*60)  AS trainingDurationHours,
      M.freeMemory,
      M.freeMemory  / 1024 as freeMemoryKb,
      round(M.freeMemory *1.0 /( 1024 * 1024 ),2)  AS freeMemoryMb,
      round(M.freeMemory*1.0/( 1024 * 1024 * 1024 ),2)  AS freeMemoryGb,
      M.totalMemory,
      M.totalMemory  / 1024 as totalMemoryKb,
      round(M.totalMemory *1.0 /( 1024 * 1024 ),2)  AS totalMemoryMb,
      round(M.totalMemory*1.0/( 1024 * 1024 * 1024 ),2)  AS totalMemoryGb,
      M.maxMemory,
      M.maxMemory  / 1024 as maxMemoryKb,
      round(M.maxMemory *1.0 /( 1024 * 1024 ),2)  AS maxMemoryMb,
      round(M.maxMemory*1.0/( 1024 * 1024 * 1024 ),2)  AS maxMemoryGb,

      M.usedMemory  AS usedMemory,
      M.usedMemory  / 1024 AS usedMemoryKb,
      round(M.usedMemory *1.0 /( 1024 * 1024 ),2)  AS usedMemoryMb,
      round(M.usedMemory*1.0/( 1024 * 1024 * 1024 ),2)  AS usedMemoryGb,
      M.ModelSize,
      round(M.ModelSize *1.0 /( 1024  ),2)  AS ModelSizeKb,
      round(M.ModelSize *1.0 /( 1024 * 1024 ),2)  AS ModelSizeMb,
      round(M.ModelSize*1.0/( 1024 * 1024 * 1024 ),2)  AS ModelSizeGb
 FROM ML_TRAIN_RESULTS M;


DROP VIEW IF EXISTS ML_TEST_RESULTS_SUMMARY;


CREATE VIEW ML_TEST_RESULTS_SUMMARY AS
SELECT 
id
, classifierName 
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
, TruePositive  / ( TruePositive  + FalseNegative ) AS "tprate"
, TrueNegative  / (TrueNegative + FalsePositive ) AS "tnrate"
, FalsePositive / ( FalsePositive + TrueNegative  ) AS "fprate"
, TruePositive  / ( TruePositive  + FalsePositive ) AS "positive_predictive_value"
, TrueNegative  / ( TrueNegative  + FalseNegative ) AS "negative_predictive_value"
, FalsePositive / (  TruePositive + FalsePositive ) AS "false_discovery_rate "
, (TruePositive + TrueNegative) / NumberOfInstances   AS "accuracy"
, 2 * TruePositive / ( 2 * TruePositive  + FalsePositive + FalseNegative ) AS "F1_score"
 FROM ML_TEST_RESULTS;


DROP VIEW IF EXISTS ML_TEST_RESULTS_SUMMARY_FULL_NAMES;

CREATE VIEW ML_TEST_RESULTS_SUMMARY_FULL_NAMES AS

SELECT 
 T.*
, T.tprate AS "tprate hitrate recall sensitivity"
, T.tnrate AS "tnrate specificity"
, T.fprate AS "fprate fall-out  false_positive_rate false_alarm_rate"
, T.positive_predictive_value AS "precision  positive_predictive_value"
FROM ML_TEST_RESULTS_SUMMARY T;
