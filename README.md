KDD99
=====

This repository is aimed for Intrusion Detection Systems (IDS) researchers.
This project plans to create a reproducible test bench for Intrusion Detection Benchmark Dataset,KDD99.
Most of the IDS papers use KDD99 dataset but most of the papers are not comparable to each other. 
We would like to create a reproducible test bench by creating a script that does following steps.

1. Download KDD99 dataset files from internet
2. Unzip dataset files
3. Create and sqlite database and import these files
4. Use this database for creating necessary input files for machine learning algorithms.
5. Following tools will be supported.
    a. Weka, the most used toolbox in this domain
    b. R (planned)
    c. Python (planned)
6. 


This projects uses following technologies mainly.
 * Java
 * Gradle


All other necessary components (weka,...) are downloaded from maven repositories.


Start with following command

    gradle clean generate createChecksumForKddDatasetFiles tableImportKddTrainDataFromCommandLine


