package testBench.ids.kdd99;

import groovy.sql.Sql









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



String sqlCreateView = new File(Resources.SQL_kdd99TableCreation).text

// println sqlCreateView
// sqlEngine.execute.sqlCreateView
String[] sqlCreateViewList = sqlCreateView.split(";")

for(String sql in sqlCreateViewList) {
    boolean containsData = sql?.trim()
    if (containsData)
    {
        sqlEngine.execute sql
        println "--------------------- View Creation Sql Executed ---------------------"
    }

}


String sqlInserts = new File(Resources.SQL_kdd99LtTableInserts).text

String[] sqlInsertsTableList = sqlInserts.split(";")

//println sqlInserts
for(String sql in sqlInsertsTableList) {
    boolean containsData = sql?.trim()
    if (containsData)
    {
        sqlEngine.execute sql
    }

}

println "--------------------- Table Insert Sql Executed ---------------------"

//sqlEngine.execute sqlCreateTable




