SELECT 
COALESCE(CN.ClassifierShortName,S.classifierName) AS "Classifier Name"
,ROUND(AVG(S.trainingDurationSeconds)) || 's (' || ROUND(AVG(S.trainingDurationMinutes),3) || 'm)' AS "Training Duration"
,ROUND(AVG(S.usedMemoryMb)) || 'Mb (' || ROUND(AVG(S.usedMemoryGb),3) || 'Gb)' AS "Used Memory"
,ROUND(MAX(S.ModelSize/1024))  || 'kb (' ||  ROUND(MAX(S.modelSizeMb)) || 'Mb)'AS  "Model Size"
FROM ML_TRAIN_RESULTS_SUMMARY S
LEFT JOIN LT_CLASSIFIER_NAMES CN
ON CN.ClassifierFullName = S.classifierName
WHERE 
s.datasetName LIKE '%Kdd99TrainingDatasetForBinary%4898431'
AND
S.classifierName LIKE 'weka%'
GROUP BY S.classifierName
ORDER BY 
S.trainingDurationSeconds DESC,
CN.ClassifierShortName ASC
