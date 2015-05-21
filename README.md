KDD99
=====

This repository is aimed for Intrusion Detection Systems (IDS) researchers.
This project plans to create a reproducible test bench for Intrusion Detection Benchmark Dataset,KDD99.
Most of the IDS papers use KDD99 dataset but most of the papers are not comparable to each other. 
We would like to create a reproducible test bench by creating a script that does following steps.

1. Download KDD99 dataset files from internet
2. Unzip dataset files
3. Create and sqlite database and import these files
4. Use this database for creating necessary dataset files for machine learning algorithms.
5. Following tools will be supported.
    a. Weka, the most used toolbox in this domain
    b. R (planned)
    c. Python (planned)


This projects uses following technologies mainly.
 * JVM
 * Gradle
 * Groovy
 * sqlite
 * weka
 * moa


Except for JVM and sqlite, all other necessary components (weka,groovy,moa...) are downloaded from maven repositories.


1. Open command line
2. Control **java* is available
3. Control **sqlite3** is available



Following command will give you available commands

    gradlew tasks


Start with following command in Windows

    startFresh.cmd

Start with following command in other Unix/Linux/MacOs

    startFresh.bash



