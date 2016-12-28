package examples;


import groovy.sql.Sql






println "Hello from groovy"





def sqlEngine = Sql.newInstance(Finals.JDBC_URL)


String sqlToExecute = "SELECT count(*) FROM sqlite_master WHERE type='table' AND name='ML_TRAIN_RESULTS';"



sqlEngine.execute sqlToExecute

sqlEngine.close()


