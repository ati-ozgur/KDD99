Constants <- new.env()

Constants$FOLDER_MAIN <- "../../../"

Constants$tableFontSize <- "scriptsize"
#The font can be one of the following: "tiny", "scriptsize", "footnotesize", "small", 
# "normalsize", "large", "Large", "LARGE", "huge", "Huge"



Constants$FOLDER_DATASET <- paste (Constants$FOLDER_MAIN,"Datasets/", sep = "" )
Constants$FOLDER_RESOURCES <- paste (Constants$FOLDER_MAIN,"src/main/SQL/", sep = "" )
Constants$FOLDER_LATEX_TABLE_SQL <- paste(Constants$FOLDER_RESOURCES,"latexTableSql/",sep = "")

Constants$DATASET_FILENAME <- paste(Constants$FOLDER_DATASET,"test1.sqlite",sep = "")


# WEKA

fileName <- paste(Constants$FOLDER_LATEX_TABLE_SQL,"ClassifierTrainingInformationHardwareMetricsWeka.sql",sep = "")
Constants$ClassifierTrainingInformationHardwareMetricsWeka <- paste(readLines(fileName), collapse="\n")

fileName <- paste(Constants$FOLDER_LATEX_TABLE_SQL,"ClassifierTestOnTrainingSoftwareMetricsWeka.sql",sep = "")
Constants$ClassifierTestOnTrainingSoftwareMetricsWeka <- paste(readLines(fileName), collapse="\n")

fileName <- paste(Constants$FOLDER_LATEX_TABLE_SQL,"ClassifierTestOnTestSoftwareMetricsWeka.sql",sep = "")
Constants$ClassifierTestOnTestSoftwareMetricsWeka <-  paste(readLines(fileName), collapse="\n")


#MOA

fileName <- paste(Constants$FOLDER_LATEX_TABLE_SQL,"ClassifierTrainingInformationHardwareMetricsMoa.sql",sep = "")
Constants$ClassifierTrainingHardwareMetricsMoa <-  paste(readLines(fileName), collapse="\n")

fileName <- paste(Constants$FOLDER_LATEX_TABLE_SQL,"ClassifierTestOnTrainingSoftwareMetricsMoa.sql",sep = "")
Constants$ClassifierTestOnTrainingSoftwareMetricsMoa <-  paste(readLines(fileName), collapse="\n")

fileName <- paste(Constants$FOLDER_LATEX_TABLE_SQL,"ClassifierTestOnTestSoftwareMetricsMoa.sql",sep = "")
Constants$ClassifierTestOnTestSoftwareMetricsMoa <- paste(readLines(fileName), collapse="\n")

rm("fileName")


Constants$LearningCurvesNoDuplicateSubsetWithReplacementJ48 <- paste(Constants$FOLDER_LATEX_TABLE_SQL,"LearningCurvesNoDuplicateSubsetWithReplacementJ48.sql",sep = "")

Constants$LearningCurvesNoDuplicateSubsetWithReplacementRandomForests<- paste(Constants$FOLDER_LATEX_TABLE_SQL,"LearningCurvesNoDuplicateSubsetWithReplacementRandomForests.sql",sep = "")

Constants$LearningCurvesNoDuplicateSubsetWithReplacementNaiveBayes<- paste(Constants$FOLDER_LATEX_TABLE_SQL,"LearningCurvesNoDuplicateSubsetWithReplacementNaiveBayes.sql",sep = "")

Constants$LearningCurvesNoDuplicateSubsetWithReplacementOneR<- paste(Constants$FOLDER_LATEX_TABLE_SQL,"LearningCurvesNoDuplicateSubsetWithReplacementOneR.sql",sep = "")

Constants$LearningCurvesNoDuplicateSubsetWithReplacementAdaboostM1<- paste(Constants$FOLDER_LATEX_TABLE_SQL,"LearningCurvesNoDuplicateSubsetWithReplacementAdaboostM1.sql",sep = "")
