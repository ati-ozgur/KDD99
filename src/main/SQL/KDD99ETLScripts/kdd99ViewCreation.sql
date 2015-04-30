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
      M.totalMemory,
      M.maxMemory,
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
 T.*
, T.TruePositive  / ( T.TruePositive  + T.FalseNegative ) AS "tprate"
, T.TrueNegative  / (T.TrueNegative + T.FalsePositive ) AS "tnrate"
, T.FalsePositive / ( T.FalsePositive + T.TrueNegative  ) AS "fprate"
, T.TruePositive  / ( T.TruePositive  + T.FalsePositive ) AS "positive_predictive_value"
, T.TrueNegative  / ( T.TrueNegative  + T.FalseNegative ) AS "negative_predictive_value"
, T.FalsePositive / (  T.TruePositive + T.FalsePositive ) AS "false_discovery_rate "
, (T.TruePositive + T.TrueNegative) / NumberOfInstances   AS "accuracy"
, 2 * T.TruePositive / ( 2 * T.TruePositive  + T.FalsePositive + T.FalseNegative ) AS "F1_score",

FROM ML_TEST_RESULTS T

DROP VIEW IF EXISTS ML_TEST_RESULTS_SUMMARY_FULL_NAMES;

CREATE VIEW ML_TEST_RESULTS_SUMMARY_FULL_NAMES AS

SELECT 
 T.*
, T.tprate AS "tprate hitrate recall sensitivity"
, T.tnrate AS "tnrate specificity"
, T.fprate AS "fprate fall-out  false_positive_rate false_alarm_rate"
, T.positive_predictive_value AS "precision  positive_predictive_value"
FROM ML_TEST_RESULTS_SUMMARY T;
