source("Constants.R")
suppressWarnings(suppressMessages(library(dplyr)))
suppressWarnings(suppressMessages(library(stargazer)))


sqlText <- singleString <- paste(readLines(ClassifierTrainingHardwareMetricsFileName), collapse="\n")


dbIDS <- src_sqlite(DATASET_FILENAME, create = F)

tbl.ClassifierTrainingHardwareMetricsFileName <- tbl(dbIDS, sql(sqlText))
df.ClassifierTrainingHardwareMetricsFileName  <- as.data.frame(tbl.ClassifierTrainingHardwareMetricsFileName , n=-1)


stargazer(
          df.ClassifierTrainingHardwareMetricsFileName
          ,suppress.errors=TRUE
          ,align = TRUE
          , summary=FALSE
          , title="Classifiers Training Hardware Metrics"
          ,font.size="small"
          ,initial.zero=TRUE
          ,rownames=FALSE
          , out="table-ClassifiersTrainingHardwareMetrics.tex"
          , out.header=TRUE
          )
