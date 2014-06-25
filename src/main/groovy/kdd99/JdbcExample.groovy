package kdd99;

import groovy.sql.Sql






println "Hello from groovy"





def sqlEngine = Sql.newInstance(Constants.JDBC_URL)


String sqlCreateTable = new File(Resources.SQL_kdd99TableCreation).text

println sqlCreateTable
//sqlEngine.execute sqlCreateTable

