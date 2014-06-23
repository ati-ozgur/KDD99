package kdd99;

import groovy.sql.Sql






println "Hello from groovy"





def sql = Sql.newInstance(Constants.JDBC_URL)

sql.execute '''
 create table PROJECT (
     id integer not null,
     name varchar(50),
     url varchar(100)
 )
'''


