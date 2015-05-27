if(!exists("Constants$DATASET_FILENAME", mode="function")) source("Constants.R")

suppressWarnings(suppressMessages(library(dplyr)))
suppressWarnings(suppressMessages(library(stargazer)))



if(!exists("Constants$DATASET_FILENAME", mode="function")) source("Constants.R")
if(!exists("dbIDS", mode="function")) dbIDS <- src_sqlite(Constants$DATASET_FILENAME, create = F)

sqlText <- Constants$ClassifierTestOnTestSoftwareMetricsWeka

tbl<- tbl(dbIDS, sql(sqlText))
df  <- as.data.frame(tbl , n=-1)


stargazer(
  df
  , suppress.errors=TRUE
  , align = TRUE
  , summary=FALSE
  , title="Classifiers Test on Test Software Metrics Weka"
  , font.size=Constants$tableFontSize
  , initial.zero=TRUE
  , rownames=FALSE
  , out="table-ClassifiersTestOnTestSoftwareMetricsWeka.tex"
  , out.header=TRUE
  , single.row = TRUE
  )


