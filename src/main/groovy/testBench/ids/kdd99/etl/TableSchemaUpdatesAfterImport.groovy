package testBench.ids.kdd99.etl;

import groovy.sql.Sql

import testBench.ids.kdd99.*;


def sqlEngine = Sql.newInstance(Finals.JDBC_URL)


String sqlToBeExecuted = new File(Resources.SQL_SchemaChangeAfterImport).text

// sqlEngine.execute.sqlToBeExecuted
String[] sqlToBeExecutedList = sqlToBeExecuted.split(";")


println "Starting to execute SQL Schema Update Commands"

for(String sql in sqlToBeExecutedList) {
    boolean containsData = sql?.trim()
    if (containsData)
    {
        println "Following SQL Command will be executed"
        println sql
        sqlEngine.execute sql
        println "--------------------- Table Schema Update Sql Executed ---------------------"
    }

}

//sqlEngine.execute sqlToBeExecuted




