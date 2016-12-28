package examples;


import groovy.sql.Sql
import testBench.ids.kdd99.*;





println "Hello from groovy"





def sqlEngine = Sql.newInstance(Finals.JDBC_URL)


String sqlToExecute = "SELECT count(*) AS TABLE_COUNT FROM sqlite_master WHERE type='table' AND name='ML_TRAIN_RESULTS';"



def row = sqlEngine.firstRow(sqlToExecute)
def cnt = row["TABLE_COUNT"]
println cnt
sqlEngine.close()

if(cnt > 0)
{
    println("Table exists")
}
else
{
    println("Table NOT exists")
}
return cnt

