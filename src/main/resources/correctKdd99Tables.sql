update KDD_TRAIN_DATA SET class_attribute = 'normal' where class_attribute = 'normal.';

ALTER TABLE KDD_TRAIN_DATA ADD COLUMN binary_class;


update KDD_TRAIN_DATA SET binary_class = 'normal' where class_attribute = 'normal';

update KDD_TRAIN_DATA SET binary_class = 'attack' where binary_class IS NULL;

SELECT COUNT(*) FROM KDD_TRAIN_DATA WHERE binary_class = 'normal';




