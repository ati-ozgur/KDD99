package testBench.ids.kdd99.etl;

import groovy.sql.Sql

import testBench.ids.kdd99.*;






def sqlEngine = Sql.newInstance(Finals.JDBC_URL)


String sqlCreateTable = new File(Resources.SQL_kdd99TableCreation).text

// println sqlCreateTable
// sqlEngine.execute.sqlCreateTable
String[] sqlCreateTableList = sqlCreateTable.split(";")

for(String sql in sqlCreateTableList) {
    boolean containsData = sql?.trim()
    if (containsData)
    {
        sqlEngine.execute sql
        println "--------------------- Table Creation Sql Executed ---------------------"
    }

}





