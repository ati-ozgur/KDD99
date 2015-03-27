SELECT classifierName,COUNT(*),AVG(trainingDurationSeconds),AVG(trainingDurationMinutes),AVG(usedMemoryGb) FROM ML_TRAIN_RESULTS_SUMMARY
GROUP BY classifierName
ORDER BY AVG(trainingDurationSeconds) DESC
