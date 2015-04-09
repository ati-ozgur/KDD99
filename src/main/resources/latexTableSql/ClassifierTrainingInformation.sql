SELECT S.classifierName
,AVG(S.trainingDurationMinutes) AS trainingDurationMinutes
,AVG(S.usedMemoryMb) AS usedMemoryMb
,AVG(S.usedMemoryGb) AS usedMemoryGb
,MAX(S.ModelSize) ModelSize
,MAX(S.modelSizeMb) ModelSizeMb

FROM ML_TRAIN_RESULTS_SUMMARY S
WHERE S.classifierName LIKE 'weka%'
GROUP BY S.classifierName
