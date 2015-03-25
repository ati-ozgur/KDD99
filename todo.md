TODO
=====

0. execTrainModelsUsingDifferentClassifiersInTrainingDataSet task should get parameter to decide which classifier group will be run, [fast,slow,all,trees,...]


1. I would like to skip already run tasks (Like downloadKddDatasetFiles). Investigate following gradle features
   * SkipTask OnlyIf (read 15.8. Skipping tasks)
   * Task Output property??? (Read 15.9.1. Declaring a task's inputs and outputs)

2. Interesting query result. A lot of R2L attacks in corrected. Look for this.
sqlite> select class_attribute_five,count(*) from TEST_CORRECTED GROUP BY class_attribute_five;
DOS|231455
PROBE|4166
R2L|14570
U2R|245
normal|60593

3. Combined Task in Gradle
DependsOn does not fix any order. Solution
* Dependencies between tasks
* mustRunAfter. It is not enough. This propert does not guarantee that task will run. You need to specify both tasks in command line, after that they are ordered.

4. A lot of sqlite code starts to emerge. Put these code to DAL package

5. testing phase results should be written to database table. 
Different test results should be written.

Following draft schema

ID ModelName DateOfRun         Accuracy ... F1
1     MLP        2014-xx-xx 


6. repeat Training of models to see if memory changes.
I have used training phase all of them together, may be garbage collector did not kick in. 
Garbage Collector 





8. gradle execInstallWekaPackages gives following error.

java.io.IOException: Unable to create temporary file
    at java.io.File$TempDirectory.generateFile(File.java:1891)
    at java.io.File.createTempFile(File.java:1979)
    at java.io.File.createTempFile(File.java:2032)
    at org.pentaho.packageManagement.DefaultPackageManager.downloadArchive(DefaultPackageManager.java:125)
    at org.pentaho.packageManagement.DefaultPackageManager.installPackageFromURL(DefaultPackageManager.java:691)
    at org.pentaho.packageManagement.DefaultPackageManager.installPackageFromRepository(DefaultPackageManager.java:676)
    at weka.core.WekaPackageManager.installPackageFromRepository(WekaPackageManager.java:1816)
    at weka.gui.PackageManager$InstallTask.doInBackground(PackageManager.java:1330)
    at weka.gui.PackageManager$InstallTask.doInBackground(PackageManager.java:1)
    at javax.swing.SwingWorker$1.call(SwingWorker.java:296)
    at java.util.concurrent.FutureTask.run(FutureTask.java:262)
    at javax.swing.SwingWorker.run(SwingWorker.java:335)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
    at java.lang.Thread.run(Thread.java:724)
    





7. Using MOA from Scala
http://moa.cms.waikato.ac.nz/2014/08/09/using-moa-with-scala-and-its-interactive-shell/
http://moa.cms.waikato.ac.nz/2014/08/16/using-moas-api-with-scala/

8. Using MOA from R

http://bnosac.be/index.php/blog/32-rmoa-massive-online-data-stream-classifications-with-r-a-moa
https://github.com/jwijffels/RMOA

9. MOA Streams Framework
http://www.jwall.org/streams/

10. Yahoo SAMOA
https://github.com/yahoo/samoa/wiki/Getting%20Started
http://melmeric.files.wordpress.com/2013/04/samoa-a-platform-for-mining-big-data-streams.pdf

11. MOA videos
- http://videolectures.net/wapa2010_bifet_maof/
- http://videolectures.net/wapa2011_bifet_sentiment/
- http://videolectures.net/wapa2011_bifet_moa/

12. MOA Links
- http://www.cs.waikato.ac.nz/~abifet/MOA/API/index.html
- 



Read following also
  * http://stackoverflow.com/questions/21612729/understanding-gradle-task-dependency-dependson
  * 


13. Package classifier installation
Exception in thread "main" java.lang.RuntimeException: java.lang.ClassNotFoundException: weka.classifiers.functions.RBFNetwork
14. sqlite3.exe does not exist
    Windows OK
    I should test this part in Linux and MacOS.

    