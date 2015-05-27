SELECT 
COALESCE(CN.ClassifierShortName,T.classifierName) AS "Classifier Name"
, max(T.accuracy) AS Accuracy
, max(T.tprate) AS "True Positive Rate"
, max(T.tnrate) AS "True Negative Rate"
, max(T.fprate) AS "False Negative Rate"
, max(T.F1_score)

FROM ML_TEST_RESULTS_SUMMARY T
LEFT JOIN LT_CLASSIFIER_NAMES CN
ON CN.ClassifierFullName = T.classifierName

WHERE datasetType = 'Test'
AND
T.classifierName LIKE 'weka%'
GROUP BY T.classifierName


