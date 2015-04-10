SELECT 
CN.ClassifierShortName
, ROUND(AVG(S.trainingDurationSeconds),3) || 'm' AS trainingDurationSecond
, ROUND(AVG(S.trainingDurationMinutes),3) || 'm' AS trainingDurationMinutes
,AVG(S.usedMemoryMb) AS usedMemoryMb
,AVG(S.usedMemoryGb) AS usedMemoryGb
,MAX(S.ModelSize) ModelSize
,MAX(S.modelSizeMb) ModelSizeMb

FROM ML_TRAIN_RESULTS_SUMMARY S
LEFT JOIN LT_CLASSIFIER_NAMES CN
ON CN.ClassifierFullName = S.classifierName
WHERE S.classifierName LIKE 'weka%'
GROUP BY S.classifierName
