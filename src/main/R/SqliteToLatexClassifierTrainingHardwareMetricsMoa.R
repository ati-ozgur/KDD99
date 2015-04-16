if(!exists("DATASET_FILENAME", mode="function")) source("Constants.R")

if(!exists("dbIDS", mode="function")) dbIDS <- src_sqlite(DATASET_FILENAME, create = F)

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

