SET PATH=%PATH%;.\tools
REM IF EXIST Datasets/ TYPE myfile.txt

call gradlew SQLiteControlTablesExists
if %ERRORLEVEL% == 0 goto :next
echo "Errors encountered during execution.  Exited with status: %errorlevel%"
goto :endofscript

:next
echo "Doing Backup"
gradlew gradlew backupFull


:endofscript
gradlew clean
START startFreshWithoutClean.cmd
echo "Script complete"
