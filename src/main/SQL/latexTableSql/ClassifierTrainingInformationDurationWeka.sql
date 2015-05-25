SELECT 
COALESCE(CN.ClassifierShortName,S.classifierName) AS "ClassifierName"
,ROUND(AVG(S.trainingDurationSeconds))  AS "TrainingDuration"
,ROUND(AVG(S.usedMemoryMb))  AS "UsedMemory"
,ROUND(MAX(S.ModelSize/1024)) AS  "ModelSize"
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