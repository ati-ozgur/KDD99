## ASAP


1. create ML_TEST_RESULTS_SUMMARY view from ML_TEST_RESULTS table. Which creates necessary columns (F1Rate, tprate,...) from confusion matrix.
There is a error in view sql. 
Control it with weka output.



2. Can I use R and stargazer in report tasks?

3. Create R code to create latex table so that training set base metrics table is reproducible

  Title: Training set base metrics
  Columns:
    a.  Classifier
    b.  Detection Rate
    c.  True Positive Rate
    d.  True Negative Rate
    e.  False Positive Rate
    d.  False Negative Rate
    d.  F1-Rate
 
  rows: Classifier names and values

4. Create R code to create latex table so that testing set base metrics table is reproducible
Training 
  Title: Test set base metrics
  Columns:
    a.  Classifier
    b.  Detection Rate
    c.  True Positive Rate
    d.  True Negative Rate
    e.  False Positive Rate
    d.  False Negative Rate
    d.  F1-Rate
 
  rows: Classifier names and values









6. MOA manual has short descriptions of classifiers.
Choose batch and stream versions to compare using that descriptions.
For example.

    OCBoost
    Online Coordinate Boosting.
    Pelossof et al. presented Online Coordinate Boosting, a new online boost-
    ing algorithm for adapting the weights of a boosted classifier, which yields a closer approximation to Freund and Schapire’s AdaBoost algorithm.



7. Gradle task which prints out Classifier list


8. Create a task which import txt file to database. Halfway done.
9. Create a task which creates arff file from sql file script. DONE
10. Create a task which creates all necessary arff files.
10. Create a task which trains from all arff files in folder and test them on KDD Test

## Later Tasks

1. I would like to skip already run tasks (Like downloadKddDatasetFiles). Investigate following gradle features
   * SkipTask OnlyIf (read 15.8. Skipping tasks)
   * Task Output property??? (Read 15.9.1. Declaring a task's inputs and outputs)

2. Interesting query result. A lot of R2L attacks in corrected. Look for this.

      sqlite> select class_attribute_five,count(*) from TEST_CORRECTED GROUP BY class_attribute_five;

      DOS,231455
      PROBE,4166
      R2L,14570
      U2R,245
      normal,60593

       sqlite> select class_attribute_five,count(*) from KDD_TRAIN_DATA GROUP BY class_attribute_five;
        DOS,3883390
        PROBE,41102
        R2L,1106
        U2R,52
        normal,972781



3. Combined Task in Gradle

DependsOn does not fix any order. Solution
* Dependencies between tasks
* mustRunAfter. It is not enough. This propert does not guarantee that task will run. You need to specify both tasks in command line, after that they are ordered.

4. A lot of sqlite code starts to emerge. Put these code to DAL package








6. Using MOA from Scala
 - http://moa.cms.waikato.ac.nz/2014/08/09/using-moa-with-scala-and-its-interactive-shell/
 - http://moa.cms.waikato.ac.nz/2014/08/16/using-moas-api-with-scala/

7. Using MOA from R

   - http://bnosac.be/index.php/blog/32-rmoa-massive-online-data-stream-classifications-with-r-a-moa
   - https://github.com/jwijffels/RMOA

8. MOA Streams Framework

   - http://www.jwall.org/streams/

9. Yahoo SAMOA
   - https://github.com/yahoo/samoa/wiki/Getting%20Started
   - http://melmeric.files.wordpress.com/2013/04/samoa-a-platform-for-mining-big-data-streams.pdf

10. MOA videos

  - http://videolectures.net/wapa2010_bifet_maof/
  - http://videolectures.net/wapa2011_bifet_sentiment/
  - http://videolectures.net/wapa2011_bifet_moa/

11. MOA Links

  - http://www.cs.waikato.ac.nz/~abifet/MOA/API/index.html
  - 

12. Read following also
    - http://stackoverflow.com/questions/21612729/understanding-gradle-task-dependency-dependson
    - 




13. sqlite3.exe does not exist
    - Windows OK.
    - Default installation of linux does not have sqlite3. I should point out this in help file.
    I should test this part in Linux and MacOS.


    