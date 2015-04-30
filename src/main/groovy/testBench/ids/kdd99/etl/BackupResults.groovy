package testBench.ids.kdd99.etl;

import groovy.sql.Sql

import testBench.ids.kdd99.*;

import org.sqlite.SQLiteJDBCLoader;



println(String.format("running in %s mode", SQLiteJDBCLoader.isNativeMode() ? "native" : "pure-java"));


def sqlEngine = Sql.newInstance(Finals.JDBC_URL)


String backupSql = """backup table ML_TRAIN_RESULTS to ML_TRAIN_RESULTS.db
"""



sqlEngine.execute backupSql
println "--------------------- Backup Finished ---------------------"





