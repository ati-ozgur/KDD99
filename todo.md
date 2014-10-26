TODO
=====

1. I would like to skip already run tasks (Like downloadKddDatasetFiles). Investigate following gradle features
   * Task Output property???
   * SkipTask OnlyIf (read 15.8. Skipping tasks)
2. Interesting query result. A lot of R2L attacks in corrected. Look for this.
sqlite> select class_attribute_five,count(*) from TEST_CORRECTED GROUP BY class_attribute_five;
DOS|231455
PROBE|4166
R2L|14570
U2R|245
normal|60593

3. 
