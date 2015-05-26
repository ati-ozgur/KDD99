if(!exists("Constants$DATASET_FILENAME", mode="function")) source("Constants.R")

suppressWarnings(suppressMessages(library(dplyr)))
suppressWarnings(suppressMessages(library(stargazer)))



if(!exists("Constants$DATASET_FILENAME", mode="function")) source("Constants.R")
if(!exists("dbIDS", mode="function")) dbIDS <- src_sqlite(Constants$DATASET_FILENAME, create = F)

sqlText <- paste(readLines(ClassifierTestOnTrainingSoftwareMetricsWekaFileName), collapse="\n")

tbl<- tbl(dbIDS, sql(sqlText))
df  <- as.data.frame(tbl , n=-1)


stargazer(
  df
  ,suppress.errors=TRUE
  ,align = TRUE
  , summary=FALSE
  , title="Classifiers Test on Training Software Metrics Weka"
  ,font.size="small"
  ,initial.zero=TRUE
  ,rownames=FALSE
  , out="table-ClassifiersTestOnTrainingSoftwareMetricsWeka.tex"
  , out.header=TRUE
)


