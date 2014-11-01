TODO
=====

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
* mustRunAfter

4. Training phase output should be written to sqlite table for easy reporting
5. repeat Training of models to see if memory changes.
I have used training phase all of them together, may be garbage collector did not kick in.


6. testing phase results should be written to database table. 
Different test results should be written.

Following draft schema

ID ModelName DateOfRun         Accuracy ... F1
1     MLP        2014-xx-xx 




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




Read following also
  * http://stackoverflow.com/questions/21612729/understanding-gradle-task-dependency-dependson
  * 
