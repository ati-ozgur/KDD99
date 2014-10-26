update KDD_TRAIN_DATA SET class_attribute = 'normal' where class_attribute = 'normal.';

ALTER TABLE KDD_TRAIN_DATA ADD COLUMN class_attribute_binary text default 'attack';

update KDD_TRAIN_DATA SET class_attribute_binary = 'normal' where class_attribute = 'normal';


update TEST_CORRECTED SET class_attribute = 'normal' where class_attribute = 'normal.';

ALTER TABLE TEST_CORRECTED ADD COLUMN class_attribute_binary text default 'attack';

update TEST_CORRECTED SET class_attribute_binary = 'normal' where class_attribute = 'normal';
