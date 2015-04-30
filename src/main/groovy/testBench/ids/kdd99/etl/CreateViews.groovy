package testBench.ids.kdd99.etl;

import groovy.sql.Sql

import testBench.ids.kdd99.*;




def sqlEngine = Sql.newInstance(Finals.JDBC_URL)



String sqlCreateView = new File(Resources.SQL_kdd99ViewCreation).text

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



