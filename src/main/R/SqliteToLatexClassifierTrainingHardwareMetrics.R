source("Constants.R")
library(dplyr)

sqlText <- singleString <- paste(readLines(ClassifierTrainingHardwareMetricsFileName), collapse="\n")


dbIDS <- src_sqlite(DATASET_FILENAME, create = F)

tbl.ClassifierTrainingHardwareMetricsFileName <- tbl(dbIDS, sql(sqlText))
df.ClassifierTrainingHardwareMetricsFileName  <- as.data.frame(tbl.ClassifierTrainingHardwareMetricsFileName , n=-1)


library(stargazer)
stargazer(df.ClassifierTrainingHardwareMetricsFileName, summary=FALSE, title="Classifiers Training Hardware Metrics", digits=1, out="table-ClassifiersTrainingHardwareMetrics.tex")
