update KDD_TRAIN_DATA SET class_attribute = 'normal' where class_attribute = 'normal.';

ALTER TABLE KDD_TRAIN_DATA ADD COLUMN binary_class text default 'attack';

update KDD_TRAIN_DATA SET binary_class = 'normal' where class_attribute = 'normal';
