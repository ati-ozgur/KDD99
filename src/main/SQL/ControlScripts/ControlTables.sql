select count(*) from KDD_TRAIN_DATA;
select class_attribute_binary,count(*) from KDD_TRAIN_DATA GROUP BY class_attribute_binary;
select class_attribute_five,count(*) from KDD_TRAIN_DATA GROUP BY class_attribute_five;


select count(*) from TEST_CORRECTED;
select class_attribute_binary,count(*) from TEST_CORRECTED GROUP BY class_attribute_binary;
select class_attribute_five,count(*) from TEST_CORRECTED GROUP BY class_attribute_five;
