package testBench.ids.kdd99.etl;

import groovy.sql.Sql









def sqlEngine = Sql.newInstance(Finals.JDBC_URL)




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




