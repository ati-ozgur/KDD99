SET PATH=%PATH%;.\tools
REM IF EXIST Datasets/ TYPE myfile.txt

call gradlew SQLiteControlTablesExists  >nul 2>&1
if %ERRORLEVEL% == 0 goto :next
echo "Errors encountered during execution.  Exited with status: %errorlevel%"
goto :endofscript

:next
echo "Doing Backup"
call gradlew gradlew backupFull


:endofscript
call gradlew clean & call startFreshWithoutClean.cmd
echo "Script complete"
