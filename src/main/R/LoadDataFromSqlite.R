library(dplyr)
library(ggplot2)
my_db <- src_sqlite("../../../Datasets/test1.sqlite", create = F)

train_results <- tbl(my_db, sql("SELECT * FROM ML_TRAIN_RESULTS"))
train_results_summary <- tbl(my_db, sql("SELECT * FROM ML_TRAIN_RESULTS_SUMMARY"))


adaBoost <- filter(train_results_summary, classifierName == "weka.classifiers.meta.AdaBoostM1")



df <-  as.data.frame(train_results_summary, n=-1)
qplot(classifierName,usedMemoryMb,data = df)


dfAdaBoost <- as.data.frame(adaBoost, n=-1)
