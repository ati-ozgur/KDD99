library(dplyr)
library(ggplot2)

dbIDS <- src_sqlite("../../../Datasets/test1.sqlite", create = F)

train_results <- tbl(dbIDS, sql("SELECT * FROM ML_TRAIN_RESULTS"))
df.train_results <- as.data.frame(train_results, n=-1)


train_results_summary <- tbl(dbIDS, sql("SELECT * FROM ML_TRAIN_RESULTS_SUMMARY"))
df.train_results_summary <- as.data.frame(train_results_summary, n=-1)



sqlSummary1 <- "SELECT classifierName,COUNT(*) NumberOfRuns,avg(usedMemoryMb) AvgUsedMemoryMb FROM ML_TRAIN_RESULTS_SUMMARY GROUP BY classifierName"


tblSummary1  <- tbl(dbIDS, sql(sqlSummary1))







df.summary.average.memory <- as.data.frame(tblSummary1, n=-1)


ggplot(df.summary.average.memory, aes(classifierName, AvgUsedMemoryMb)) + geom_bar(stat="identity")