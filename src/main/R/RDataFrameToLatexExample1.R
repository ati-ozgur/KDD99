
source("LoadDataFromSqlite.R")
library(Hmisc)
latex(df.summary.average.memory)


library(stargazer)
stargazer(df.summary.average.memory)
