if(!exists("DATASET_FILENAME", mode="function")) source("Constants.R")


suppressWarnings(suppressMessages(library(dplyr)))
suppressWarnings(suppressMessages(library(stargazer)))


sqlTextWeka <- paste(readLines(ClassifierTrainingHardwareMetricsWekaFileName), collapse="\n")


dbIDS <- src_sqlite(DATASET_FILENAME, create = F)

tbl.ClassifierTrainingHardwareMetricsWeka <- tbl(dbIDS, sql(sqlTextWeka))
df.ClassifierTrainingHardwareMetricsWeka  <- as.data.frame(tbl.ClassifierTrainingHardwareMetricsWeka , n=-1)


stargazer(
          df.ClassifierTrainingHardwareMetricsWeka
          ,suppress.errors=TRUE
          ,align = TRUE
          , summary=FALSE
          , title="Classifiers Training Hardware Metrics Weka"
          ,font.size="small"
          ,initial.zero=TRUE
          ,rownames=FALSE
          , out="table-ClassifiersTrainingHardwareMetricsWeka.tex"
          , out.header=TRUE
          )

sqlTextMoa <- paste(readLines(ClassifierTrainingHardwareMetricsMoaFileName), collapse="\n")


tbl.ClassifierTrainingHardwareMetricsMoa <- tbl(dbIDS, sql(sqlTextMoa))
df.ClassifierTrainingHardwareMetricsMoa  <- as.data.frame(tbl.ClassifierTrainingHardwareMetricsMoa , n=-1)


stargazer(
  df.ClassifierTrainingHardwareMetricsMoa
  ,suppress.errors=TRUE
  ,align = TRUE
  , summary=FALSE
  , title="Classifiers Training Hardware Metrics Moa"
  ,font.size="small"
  ,initial.zero=TRUE
  ,rownames=FALSE
  , out="table-ClassifiersTrainingHardwareMetricsMoa.tex"
  , out.header=TRUE
)

