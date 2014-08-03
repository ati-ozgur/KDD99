package kdd99;

import groovy.sql.Sql









def sqlEngine = Sql.newInstance(Constants.JDBC_URL)


String sqlCreateTable = new File(Resources.SQL_kdd99TableCreation).text

println sqlCreateTable

String[] sqlCreateTableList = sqlCreateTable.split(";")

for(String sql in sqlCreateTableList) {
    println "---------------------"
    println sql

}

//sqlEngine.execute sqlCreateTable




