update KDD_TRAIN_DATA SET class_attribute = TRIM(class_attribute,'.');

ALTER TABLE KDD_TRAIN_DATA ADD COLUMN class_attribute_binary text default 'attack';

update KDD_TRAIN_DATA SET class_attribute_binary = 'normal' where class_attribute = 'normal';


ALTER TABLE KDD_TRAIN_DATA ADD COLUMN class_attribute_five text;

update KDD_TRAIN_DATA SET class_attribute_five =
(SELECT L.class_attribute_five FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute = class_attribute);


CREATE INDEX idx_TRAIN_DATA_class_attr ON KDD_TRAIN_DATA ( 
    class_attribute 
);

CREATE INDEX idx_TRAIN_DATA_class_attr_bin ON KDD_TRAIN_DATA ( 
    class_attribute_binary 
);

CREATE INDEX idx_TRAIN_DATA_class_attr_five ON KDD_TRAIN_DATA ( 
    class_attribute_five 
);



update TEST_CORRECTED SET class_attribute = TRIM(class_attribute,'.');


ALTER TABLE TEST_CORRECTED ADD COLUMN class_attribute_binary text default 'attack';

update TEST_CORRECTED SET class_attribute_binary = 'normal' where class_attribute = 'normal';

ALTER TABLE TEST_CORRECTED ADD COLUMN class_attribute_five text;


update TEST_CORRECTED SET class_attribute_five =
(SELECT L.class_attribute_five FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute = class_attribute);


CREATE INDEX idx_TEST_class_attr ON TEST_CORRECTED ( 
    class_attribute 
);


CREATE INDEX idx_TEST_class_attr_binary ON TEST_CORRECTED ( 
    class_attribute_binary 
);

CREATE INDEX idx_TEST_class_attr_five ON TEST_CORRECTED ( 
    class_attribute_five 
);

