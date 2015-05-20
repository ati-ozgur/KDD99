INSERT INTO KDD_TRAIN_DATA
(
  duration ,
  protocol_type ,
  service ,
  flag ,
  src_bytes ,
  dst_bytes ,
  land ,
  wrong_fragment ,
  urgent ,
  hot ,
  num_failed_logins ,
  logged_in ,
  num_compromised ,
  root_shell ,
  su_attempted ,
  num_root ,
  num_file_creations ,
  num_shells ,
  num_access_files ,
  num_outbound_cmds ,
  is_host_login ,
  is_guest_login ,
  count ,
  srv_count ,
  serror_rate ,
  srv_serror_rate ,
  rerror_rate ,
  srv_rerror_rate ,
  same_srv_rate ,
  diff_srv_rate ,
  srv_diff_host_rate ,
  dst_host_count ,
  dst_host_srv_count ,
  dst_host_same_srv_rate ,
  dst_host_diff_srv_rate ,
  dst_host_same_src_port_rate ,
  dst_host_srv_diff_host_rate ,
  dst_host_serror_rate ,
  dst_host_srv_serror_rate ,
  dst_host_rerror_rate ,
  dst_host_srv_rerror_rate ,
  class_attribute 

)
SELECT 
  duration ,
  protocol_type ,
  service ,
  flag ,
  src_bytes ,
  dst_bytes ,
  land ,
  wrong_fragment ,
  urgent ,
  hot ,
  num_failed_logins ,
  logged_in ,
  num_compromised ,
  root_shell ,
  su_attempted ,
  num_root ,
  num_file_creations ,
  num_shells ,
  num_access_files ,
  num_outbound_cmds ,
  is_host_login ,
  is_guest_login ,
  count ,
  srv_count ,
  serror_rate ,
  srv_serror_rate ,
  rerror_rate ,
  srv_rerror_rate ,
  same_srv_rate ,
  diff_srv_rate ,
  srv_diff_host_rate ,
  dst_host_count ,
  dst_host_srv_count ,
  dst_host_same_srv_rate ,
  dst_host_diff_srv_rate ,
  dst_host_same_src_port_rate ,
  dst_host_srv_diff_host_rate ,
  dst_host_serror_rate ,
  dst_host_srv_serror_rate ,
  dst_host_rerror_rate ,
  dst_host_srv_rerror_rate ,
  class_attribute 
FROM tempKDD_TRAIN_DATA;

DROP TABLE tempKDD_TRAIN_DATA;


INSERT INTO TEST_CORRECTED
(
  duration ,
  protocol_type ,
  service ,
  flag ,
  src_bytes ,
  dst_bytes ,
  land ,
  wrong_fragment ,
  urgent ,
  hot ,
  num_failed_logins ,
  logged_in ,
  num_compromised ,
  root_shell ,
  su_attempted ,
  num_root ,
  num_file_creations ,
  num_shells ,
  num_access_files ,
  num_outbound_cmds ,
  is_host_login ,
  is_guest_login ,
  count ,
  srv_count ,
  serror_rate ,
  srv_serror_rate ,
  rerror_rate ,
  srv_rerror_rate ,
  same_srv_rate ,
  diff_srv_rate ,
  srv_diff_host_rate ,
  dst_host_count ,
  dst_host_srv_count ,
  dst_host_same_srv_rate ,
  dst_host_diff_srv_rate ,
  dst_host_same_src_port_rate ,
  dst_host_srv_diff_host_rate ,
  dst_host_serror_rate ,
  dst_host_srv_serror_rate ,
  dst_host_rerror_rate ,
  dst_host_srv_rerror_rate ,
  class_attribute 

)
SELECT 
  duration ,
  protocol_type ,
  service ,
  flag ,
  src_bytes ,
  dst_bytes ,
  land ,
  wrong_fragment ,
  urgent ,
  hot ,
  num_failed_logins ,
  logged_in ,
  num_compromised ,
  root_shell ,
  su_attempted ,
  num_root ,
  num_file_creations ,
  num_shells ,
  num_access_files ,
  num_outbound_cmds ,
  is_host_login ,
  is_guest_login ,
  count ,
  srv_count ,
  serror_rate ,
  srv_serror_rate ,
  rerror_rate ,
  srv_rerror_rate ,
  same_srv_rate ,
  diff_srv_rate ,
  srv_diff_host_rate ,
  dst_host_count ,
  dst_host_srv_count ,
  dst_host_same_srv_rate ,
  dst_host_diff_srv_rate ,
  dst_host_same_src_port_rate ,
  dst_host_srv_diff_host_rate ,
  dst_host_serror_rate ,
  dst_host_srv_serror_rate ,
  dst_host_rerror_rate ,
  dst_host_srv_rerror_rate ,
  class_attribute 
FROM tempTEST_CORRECTED;

DROP TABLE tempTEST_CORRECTED;


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



CREATE TABLE KDD_TRAIN_DATA_NODUP(
  id integer primary key autoincrement,
  duration REAL,
  protocol_type TEXT,
  service TEXT,
  flag TEXT,
  src_bytes REAL,
  dst_bytes REAL,
  land TEXT,
  wrong_fragment REAL,
  urgent REAL,
  hot REAL,
  num_failed_logins REAL,
  logged_in TEXT,
  num_compromised REAL,
  root_shell REAL,
  su_attempted REAL,
  num_root REAL,
  num_file_creations REAL,
  num_shells REAL,
  num_access_files REAL,
  num_outbound_cmds REAL,
  is_host_login TEXT,
  is_guest_login TEXT,
  count REAL,
  srv_count REAL,
  serror_rate REAL,
  srv_serror_rate REAL,
  rerror_rate REAL,
  srv_rerror_rate REAL,
  same_srv_rate REAL,
  diff_srv_rate REAL,
  srv_diff_host_rate REAL,
  dst_host_count REAL,
  dst_host_srv_count REAL,
  dst_host_same_srv_rate REAL,
  dst_host_diff_srv_rate REAL,
  dst_host_same_src_port_rate REAL,
  dst_host_srv_diff_host_rate REAL,
  dst_host_serror_rate REAL,
  dst_host_srv_serror_rate REAL,
  dst_host_rerror_rate REAL,
  dst_host_srv_rerror_rate REAL,
  class_attribute TEXT,
  class_attribute_binary TEXT,
  class_attribute_five TEXT
);



INSERT INTO KDD_TRAIN_DATA_NODUP
(
  duration ,
  protocol_type ,
  service ,
  flag ,
  src_bytes ,
  dst_bytes ,
  land ,
  wrong_fragment ,
  urgent ,
  hot ,
  num_failed_logins ,
  logged_in ,
  num_compromised ,
  root_shell ,
  su_attempted ,
  num_root ,
  num_file_creations ,
  num_shells ,
  num_access_files ,
  num_outbound_cmds ,
  is_host_login ,
  is_guest_login ,
  count ,
  srv_count ,
  serror_rate ,
  srv_serror_rate ,
  rerror_rate ,
  srv_rerror_rate ,
  same_srv_rate ,
  diff_srv_rate ,
  srv_diff_host_rate ,
  dst_host_count ,
  dst_host_srv_count ,
  dst_host_same_srv_rate ,
  dst_host_diff_srv_rate ,
  dst_host_same_src_port_rate ,
  dst_host_srv_diff_host_rate ,
  dst_host_serror_rate ,
  dst_host_srv_serror_rate ,
  dst_host_rerror_rate ,
  dst_host_srv_rerror_rate ,
  class_attribute ,
  class_attribute_binary ,
  class_attribute_five 

)
SELECT 
DISTINCT
  duration ,
  protocol_type ,
  service ,
  flag ,
  src_bytes ,
  dst_bytes ,
  land ,
  wrong_fragment ,
  urgent ,
  hot ,
  num_failed_logins ,
  logged_in ,
  num_compromised ,
  root_shell ,
  su_attempted ,
  num_root ,
  num_file_creations ,
  num_shells ,
  num_access_files ,
  num_outbound_cmds ,
  is_host_login ,
  is_guest_login ,
  count ,
  srv_count ,
  serror_rate ,
  srv_serror_rate ,
  rerror_rate ,
  srv_rerror_rate ,
  same_srv_rate ,
  diff_srv_rate ,
  srv_diff_host_rate ,
  dst_host_count ,
  dst_host_srv_count ,
  dst_host_same_srv_rate ,
  dst_host_diff_srv_rate ,
  dst_host_same_src_port_rate ,
  dst_host_srv_diff_host_rate ,
  dst_host_serror_rate ,
  dst_host_srv_serror_rate ,
  dst_host_rerror_rate ,
  dst_host_srv_rerror_rate ,
  class_attribute ,
  class_attribute_binary ,
  class_attribute_five 
FROM KDD_TRAIN_DATA;

CREATE INDEX idx_KDD_TRAIN_DATA_NODUP_class_attr_five ON KDD_TRAIN_DATA_NODUP ( 
    class_attribute_five,
    id
);

CREATE INDEX idx_KDD_TRAIN_DATA_NODUP_class_attr_bin ON KDD_TRAIN_DATA_NODUP ( 
    class_attribute_binary,
    id

);

CREATE INDEX idx_KDD_TRAIN_DATA_NODUP_class_attr ON KDD_TRAIN_DATA_NODUP ( 
    class_attribute,
    id

);


CREATE INDEX idx_KDD_TRAIN_DATA_NODUP_ID ON KDD_TRAIN_DATA_NODUP ( 
    id
);






