package examples;


import groovy.sql.Sql
import testBench.ids.kdd99.*;






println "Hello from groovy"





def sqlEngine = Sql.newInstance(Finals.JDBC_URL)


String sqlCreateTable = new File(Resources.SQL_kdd99TableCreation).text

//println sqlCreateTable
//sqlEngine.execute sqlCreateTable

String sqlImport = new File(Resources.SQL_Import).text
println sqlImport

sqlEngine.execute sqlImport

sqlEngine.close()


