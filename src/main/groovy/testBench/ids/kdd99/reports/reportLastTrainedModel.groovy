package testBench.ids.kdd99.reports;


import testBench.ids.kdd99.*;

import groovy.sql.Sql



def sqlEngine = Sql.newInstance(Finals.JDBC_URL)



def sql = "SELECT * FROM ML_TRAIN_RESULTS";

sqlEngine.eachRow(sql) { row ->
     println row
 }
