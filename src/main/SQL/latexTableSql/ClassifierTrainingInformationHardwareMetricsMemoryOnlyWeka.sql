SELECT 
COALESCE(CN.ClassifierShortName,S.classifierName) AS "Classifier Name"
--,ROUND(AVG(S.trainingDurationSeconds)) || 's (' || ROUND(AVG(S.trainingDurationMinutes),3) || 'm)' AS "Training Duration"
,ROUND(AVG(S.maxMemoryMb)) || 'Mb (' || ROUND(AVG(S.maxMemoryGb),3) || 'Gb)' AS "Max Memory"
,ROUND(AVG(S.totalMemoryMb)) || 'Mb (' || ROUND(AVG(S.totalMemoryGb),3) || 'Gb)' AS "Total Memory"
,ROUND(AVG(S.freeMemoryMb)) || 'Mb (' || ROUND(AVG(S.freeMemoryGb),3) || 'Gb)' AS "Free Memory"
,ROUND(AVG(S.usedMemoryMb)) || 'Mb (' || ROUND(AVG(S.usedMemoryGb),3) || 'Gb)' AS "Used Memory"
--,ROUND(MAX(S.ModelSize/1024))  || 'kb (' ||  ROUND(MAX(S.modelSizeMb)) || 'Mb)'AS  "Model Size"
FROM ML_TRAIN_RESULTS_SUMMARY S
LEFT JOIN LT_CLASSIFIER_NAMES CN
ON CN.ClassifierFullName = S.classifierName
WHERE 
s.datasetName LIKE '%Kdd99TrainingDatasetForBinary%4898431'
AND
S.classifierName LIKE 'weka%'
GROUP BY S.classifierName
ORDER BY CN.ClassifierShortName ASC