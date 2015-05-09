SELECT D.duration ,
  D.protocol_type ,
  D.service ,
  D.flag ,
  D.src_bytes ,
  D.dst_bytes ,
  D.land ,
  D.wrong_fragment ,
  D.urgent ,
  D.hot ,
  D.num_failed_logins ,
  D.logged_in ,
  D.num_compromised ,
  D.root_shell ,
  D.su_attempted ,
  D.num_root ,
  D.num_file_creations ,
  D.num_shells ,
  D.num_access_files ,
  D.num_outbound_cmds ,
  D.is_host_login ,
  D.is_guest_login ,
  D.count ,
  D.srv_count ,
  D.serror_rate ,
  D.srv_serror_rate ,
  D.rerror_rate ,
  D.srv_rerror_rate ,
  D.same_srv_rate ,
  D.diff_srv_rate ,
  D.srv_diff_host_rate ,
  D.dst_host_count ,
  D.dst_host_srv_count ,
  D.dst_host_same_srv_rate ,
  D.dst_host_diff_srv_rate ,
  D.dst_host_same_src_port_rate ,
  D.dst_host_srv_diff_host_rate ,
  D.dst_host_serror_rate ,
  D.dst_host_srv_serror_rate ,
  D.dst_host_rerror_rate ,
  D.dst_host_srv_rerror_rate ,
  D.class_attribute_binary
  FROM KDD_TRAIN_DATA_NODUP D
INNER JOIN SUBSET_IDS_WITH_REPLACEMENT S
ON S.VAL = D.id
WHERE S.id <= 1000;


--SELECT COUNT(*) FROM SUBSET_IDS_WITH_REPLACEMENT;