source("Constants.R")
library(dplyr,suppressPackageStartupMessagesß)

sqlText <- singleString <- paste(readLines(ClassifierTrainingHardwareMetricsFileName), collapse="\n")


dbIDS <- src_sqlite(DATASET_FILENAME, create = F)

tbl.ClassifierTrainingHardwareMetricsFileName <- tbl(dbIDS, sql(sqlText))
df.ClassifierTrainingHardwareMetricsFileName  <- as.data.frame(tbl.ClassifierTrainingHardwareMetricsFileName , n=-1)


library(stargazer)
stargazer(df.ClassifierTrainingHardwareMetricsFileName,suppress.errors=TRUE,align = TRUE, summary=FALSE, title="Classifiers Training Hardware Metrics", digits=2,font.size="small",initial.zero=TRUE,rownames=FALSE, out="table-ClassifiersTrainingHardwareMetrics.tex")
