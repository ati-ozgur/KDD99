package testBench.ids.kdd99;

import groovy.sql.Sql



def sqlEngine = Sql.newInstance(Finals.JDBC_URL)


String sqlToBeExecuted = new File(Resources.SQL_kdd99TableCreation).text

// println sqlToBeExecuted
// sqlEngine.execute.sqlToBeExecuted
String[] sqlToBeExecutedList = sqlToBeExecuted.split(";")

for(String sql in sqlToBeExecutedList) {
    boolean containsData = sql?.trim()
    if (containsData)
    {
        sqlEngine.execute sql
        println "--------------------- Table Schema Update Sql Executed ---------------------"
    }

}

//sqlEngine.execute sqlToBeExecuted




