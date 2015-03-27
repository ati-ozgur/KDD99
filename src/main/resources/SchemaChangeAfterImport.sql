update KDD_TRAIN_DATA SET class_attribute = TRIM(class_attribute,'.');

ALTER TABLE KDD_TRAIN_DATA ADD COLUMN class_attribute_binary text default 'attack';

update KDD_TRAIN_DATA SET class_attribute_binary = 'normal' where class_attribute = 'normal';


ALTER TABLE KDD_TRAIN_DATA ADD COLUMN class_attribute_five text default 'DOS';



update KDD_TRAIN_DATA SET class_attribute_five = 'U2R'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'U2R');

update KDD_TRAIN_DATA SET class_attribute_five = 'R2L'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'R2L');

update KDD_TRAIN_DATA SET class_attribute_five = 'PROBE'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'PROBE');


update KDD_TRAIN_DATA SET class_attribute_five = 'normal'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'normal');









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



ALTER TABLE TEST_CORRECTED ADD COLUMN class_attribute_five text default 'DOS';


update TEST_CORRECTED SET class_attribute_five = 'U2R'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'U2R');

update TEST_CORRECTED SET class_attribute_five = 'R2L'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'R2L');

update TEST_CORRECTED SET class_attribute_five = 'PROBE'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'PROBE');


update TEST_CORRECTED SET class_attribute_five = 'normal'
	WHERE class_attribute IN (SELECT L.class_attribute FROM LT_CLASS_ATTRIBUTE L WHERE L.class_attribute_five = 'normal');


CREATE INDEX idx_TEST_class_attr ON TEST_CORRECTED ( 
    class_attribute 
);


CREATE INDEX idx_TEST_class_attr_binary ON TEST_CORRECTED ( 
    class_attribute_binary 
);

CREATE INDEX idx_TEST_class_attr_five ON TEST_CORRECTED ( 
    class_attribute_five 
);

