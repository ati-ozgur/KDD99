SELECT 
CN.ClassifierShortName
,ROUND(AVG(S.trainingDurationSeconds)) || 's (' || ROUND(AVG(S.trainingDurationMinutes),3) || 'm)' AS trainingDuration
,ROUND(AVG(S.usedMemoryMb)) || 'Mb (' || ROUND(AVG(S.usedMemoryGb),3) || 'Gb)' AS usedMemory
,MAX(S.ModelSize)  || 'Mb (' ||  MAX(S.modelSizeMb) || 'Gb)'AS  ModelSize
FROM ML_TRAIN_RESULTS_SUMMARY S
LEFT JOIN LT_CLASSIFIER_NAMES CN
ON CN.ClassifierFullName = S.classifierName
WHERE S.classifierName LIKE 'moa%'
GROUP BY S.classifierName
ORDER BY CN.ClassifierFullName ASC
