
CREATE TABLE "main"."ML_TRAIN_RESULTS2" ( 
    id                INTEGER  PRIMARY KEY AUTOINCREMENT,
    datasetName       TEXT,
    classifierName       TEXT,
    options       TEXT,
    trainingStartTime DATETIME ,
    trainingFinishTime DATETIME ,
    trainingDuration INTEGER ,
    freeMemory LONG ,
    totalMemory INTEGER ,
    maxMemory INTEGER ,
    usedMemory INTEGER,
    LocalMachineHostName TEXT,
    JavaVersion TEXT,
    OsArchitecture TEXT,
    UserName TEXT,
    JavaVmName TEXT,
    OsName TEXT,
    OsVersion TEXT,
    AvailableProcessors INTEGER,
    ModelSize LONG,
    ModelName TEXT,
    NumberOfInstances INTEGER
);

INSERT INTO ML_TRAIN_RESULTS2 SELECT T.*,classifierName + '-' + options,0 FROM ML_TRAIN_RESULTS T;

DROP TABLE "main"."ML_TRAIN_RESULTS";

CREATE TABLE "main"."ML_TRAIN_RESULTS" ( 
    id                INTEGER  PRIMARY KEY AUTOINCREMENT,
    datasetName       TEXT,
    classifierName       TEXT,
    options       TEXT,
    trainingStartTime DATETIME ,
    trainingFinishTime DATETIME ,
    trainingDuration INTEGER ,
    freeMemory LONG ,
    totalMemory INTEGER ,
    maxMemory INTEGER ,
    usedMemory INTEGER,
    LocalMachineHostName TEXT,
    JavaVersion TEXT,
    OsArchitecture TEXT,
    UserName TEXT,
    JavaVmName TEXT,
    OsName TEXT,
    OsVersion TEXT,
    AvailableProcessors INTEGER,
    ModelSize LONG,
    ModelName TEXT,
    NumberOfInstances INTEGER
);

INSERT INTO ML_TRAIN_RESULTS SELECT T.* FROM ML_TRAIN_RESULTS2 T;
DROP TABLE "main"."ML_TRAIN_RESULTS2";
