if(!exists("Constants$DATASET_FILENAME", mode="function")) source("Constants.R")

suppressWarnings(suppressMessages(library(dplyr)))
suppressWarnings(suppressMessages(library(stargazer)))

if(!exists("dbIDS", mode="function")) dbIDS <- src_sqlite(Constants$DATASET_FILENAME, create = F)

sqlText <- paste(readLines(LearningCurvesNoDuplicateSubsetWithReplacementOneR), collapse="\n")

tbl.fromSql <- tbl(dbIDS, sql(sqlText))
df.fromSql  <- as.data.frame(tbl.fromSql , n=-1)


stargazer(
  df.fromSql
  ,suppress.errors=TRUE
  ,align = TRUE
  , summary=FALSE
  , title="Learning Curves OneR"
  ,font.size="small"
  ,initial.zero=TRUE
  ,rownames=FALSE
  , out="table-LearningCurvesNoDuplicateSubsetWithReplacementOneR.tex"
  , out.header=TRUE
)

