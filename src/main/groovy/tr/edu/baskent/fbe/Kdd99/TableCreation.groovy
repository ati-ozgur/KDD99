package tr.edu.baskent.fbe.Kdd99;

import groovy.sql.Sql









def sqlEngine = Sql.newInstance(Constants.JDBC_URL)


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

//sqlEngine.execute sqlCreateTable




