package examples;

import groovy.sql.Sql







def insertSql1 = "INSERT INTO KDD_TRAIN_DATA VALUES(0.0,'tcp','http','SF',215.0,45076.0,'0',0.0,0.0,0.0,0.0,'1',0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,'0','0',1.0,1.0,0.0,0.0,0.0,0.0,1.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,'normal.');"


def insertSqlWithParams =  """
INSERT INTO KDD_TRAIN_DATA(
    duration   ,
    protocol_type  ,
    service  ,
    flag  ,
    src_bytes   ,
    dst_bytes   ,
    land  ,
    wrong_fragment   ,
    urgent   ,
    hot   ,
    num_failed_logins   ,
    logged_in  ,
    num_compromised   ,
    root_shell   ,
    su_attempted   ,
    num_root   ,
    num_file_creations   ,
    num_shells   ,
    num_access_files   ,
    num_outbound_cmds   ,
    is_host_login  ,
    is_guest_login  ,
    count   ,
    srv_count   ,
    serror_rate   ,
    srv_serror_rate   ,
    rerror_rate   ,
    srv_rerror_rate   ,
    same_srv_rate   ,
    diff_srv_rate   ,
    srv_diff_host_rate   ,
    dst_host_count   ,
    dst_host_srv_count   ,
    dst_host_same_srv_rate   ,
    dst_host_diff_srv_rate   ,
    dst_host_same_src_port_rate   ,
    dst_host_srv_diff_host_rate   ,
    dst_host_serror_rate   ,
    dst_host_srv_serror_rate   ,
    dst_host_rerror_rate   ,
    dst_host_srv_rerror_rate   ,
    class_attribute 
    )
    VALUES(
?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?
    )
""";

def sqlEngine = Sql.newInstance(Constants.JDBC_URL)


def exampleDataFull = new File(DataSetFiles.KddcupTrainData)

def start = System.currentTimeMillis()


int lineNumber = 1;
exampleDataFull.eachLine
{ line->
    //println line
    if (lineNumber % 1000 == 1)
    {
        println "lineNumber    " + lineNumber
        def now = System.currentTimeMillis()
        println "Insertion took ${now-start} ms"
    }
    lineNumber++
    String[] lineData = line.split(",")
    sqlEngine.execute ( insertSqlWithParams, lineData)
}






