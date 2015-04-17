package testBench.ids.kdd99.reports;


import testBench.ids.kdd99.*;

import groovy.sql.*;
import java.sql.*;


def sqlEngine = Sql.newInstance(Finals.JDBC_URL)



def sql = "SELECT * FROM ML_TRAIN_RESULTS";



sqlEngine.eachRow(sql) { row ->
    println row
    int columnCount = row.getMetaData().columnCount;
    //println columnCount

    (0..columnCount-1).each{ i ->
        println row.getMetaData().getColumnName(i+1) + ":" + row[i]
    }
}
 
