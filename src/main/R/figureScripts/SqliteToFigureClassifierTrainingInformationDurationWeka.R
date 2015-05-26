SqliteToLatexClassifierTrainingHardwareMetricsWeka

if(!exists("Constants$DATASET_FILENAME", mode="function")) source("Constants.R")

suppressWarnings(suppressMessages(library(ggplot2)))
suppressWarnings(suppressMessages(library(dplyr)))
suppressWarnings(suppressMessages(library(stargazer)))


if(!exists("dbIDS", mode="function")) dbIDS <- src_sqlite(Constants$DATASET_FILENAME, create = F)

sqlText <- paste(readLines(ClassifierTrainingHardwareMetricsWekaFileName), collapse="\n")

tbl.ClassifierTrainingHardwareMetricsWeka <- tbl(dbIDS, sql(sqlText))
df.ClassifierTrainingHardwareMetricsWeka  <- as.data.frame(tbl.ClassifierTrainingHardwareMetricsWeka , n=-1)
