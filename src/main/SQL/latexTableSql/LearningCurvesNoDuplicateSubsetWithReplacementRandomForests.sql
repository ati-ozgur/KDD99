SELECT 
TrainingDatasetSize
,AVG(accuracy) AS accuracy
 FROM
(
SELECT 
--classifiermodelFileName
CAST( replace(substr(classifiermodelFileName,instr(classifiermodelFileName,'arff-') + 5),'.weka','')  as int)  AS TrainingDatasetSize
,accuracy

 FROM ML_TEST_RESULTS_SUMMARY
WHERE classifiermodelFileName LIKE '%RandomForest%Kdd99TrainSubsetWithReplacement%'
)
GROUP BY TrainingDatasetSize
ORDER BY TrainingDatasetSize ASC
