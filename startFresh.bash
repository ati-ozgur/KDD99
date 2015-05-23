#!/bin/bash
./gradlew backupFull
./gradlew clean 
source startFreshWithoutClean.bash
