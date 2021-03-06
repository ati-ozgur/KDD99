

INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('apache2','DOS',2,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('back','DOS',2,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('buffer_overflow','U2R',3,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('ftp_write','R2L',4,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('guess_passwd','R2L',4,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('httptunnel','U2R',3,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('imap','R2L',4,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('ipsweep','PROBE',1,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('land','DOS',2,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('loadmodule','U2R',3,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('mailbomb','DOS',2,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('mscan','PROBE',1,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('multihop','R2L',4,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('named','U2R',1,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('neptune','DOS',2,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('nmap','PROBE',1,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('normal','normal',0,'normal','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('perl','U2R',3,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('phf','R2L',4,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('pod','DOS',2,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('portsweep','PROBE',1,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('processtable','DOS',2,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('ps','U2R',3,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('rootkit','U2R',3,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('saint','PROBE',1,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('satan','PROBE',1,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('sendmail','R2L',4,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('smurf','DOS',2,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('snmpgetattack','R2L',4,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('snmpguess','R2L',4,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('spy','R2L',4,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('sqlattack','U2R',3,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('teardrop','DOS',2,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('udpstorm','DOS',2,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('warezclient','R2L',4,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('warezmaster','DOS',2,'attack','False');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('worm','R2L',4,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('xlock','R2L',4,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('xsnoop','R2L',4,'attack','True');
INSERT INTO "LT_CLASS_ATTRIBUTE" VALUES('xterm','U2R',3,'attack','True');

INSERT INTO "LT_FLAG" VALUES('OTH');
INSERT INTO "LT_FLAG" VALUES('REJ');
INSERT INTO "LT_FLAG" VALUES('RSTO');
INSERT INTO "LT_FLAG" VALUES('RSTOS0');
INSERT INTO "LT_FLAG" VALUES('RSTR');
INSERT INTO "LT_FLAG" VALUES('S0');
INSERT INTO "LT_FLAG" VALUES('S1');
INSERT INTO "LT_FLAG" VALUES('S2');
INSERT INTO "LT_FLAG" VALUES('S3');
INSERT INTO "LT_FLAG" VALUES('SF');
INSERT INTO "LT_FLAG" VALUES('SH');

INSERT INTO "LT_IS_GUEST_LOGIN" VALUES('0');
INSERT INTO "LT_IS_GUEST_LOGIN" VALUES('1');

INSERT INTO "LT_IS_HOST_LOGIN" VALUES('False');
INSERT INTO "LT_IS_HOST_LOGIN" VALUES('True');

INSERT INTO "LT_LAND" VALUES('0');
INSERT INTO "LT_LAND" VALUES('1');


INSERT INTO "LT_LOGGED_IN" VALUES('0');
INSERT INTO "LT_LOGGED_IN" VALUES('1');

INSERT INTO "LT_PROTOCOL_TYPE" VALUES('icmp');
INSERT INTO "LT_PROTOCOL_TYPE" VALUES('tcp');
INSERT INTO "LT_PROTOCOL_TYPE" VALUES('udp');


INSERT INTO "LT_SERVICE_TYPE" VALUES('aol');
INSERT INTO "LT_SERVICE_TYPE" VALUES('auth');
INSERT INTO "LT_SERVICE_TYPE" VALUES('bgp');
INSERT INTO "LT_SERVICE_TYPE" VALUES('courier');
INSERT INTO "LT_SERVICE_TYPE" VALUES('csnet_ns');
INSERT INTO "LT_SERVICE_TYPE" VALUES('ctf');
INSERT INTO "LT_SERVICE_TYPE" VALUES('daytime');
INSERT INTO "LT_SERVICE_TYPE" VALUES('discard');
INSERT INTO "LT_SERVICE_TYPE" VALUES('domain');
INSERT INTO "LT_SERVICE_TYPE" VALUES('domain_u');
INSERT INTO "LT_SERVICE_TYPE" VALUES('echo');
INSERT INTO "LT_SERVICE_TYPE" VALUES('eco_i');
INSERT INTO "LT_SERVICE_TYPE" VALUES('ecr_i');
INSERT INTO "LT_SERVICE_TYPE" VALUES('efs');
INSERT INTO "LT_SERVICE_TYPE" VALUES('exec');
INSERT INTO "LT_SERVICE_TYPE" VALUES('finger');
INSERT INTO "LT_SERVICE_TYPE" VALUES('ftp');
INSERT INTO "LT_SERVICE_TYPE" VALUES('ftp_data');
INSERT INTO "LT_SERVICE_TYPE" VALUES('gopher');
INSERT INTO "LT_SERVICE_TYPE" VALUES('harvest');
INSERT INTO "LT_SERVICE_TYPE" VALUES('hostnames');
INSERT INTO "LT_SERVICE_TYPE" VALUES('http');
INSERT INTO "LT_SERVICE_TYPE" VALUES('http_2784');
INSERT INTO "LT_SERVICE_TYPE" VALUES('http_443');
INSERT INTO "LT_SERVICE_TYPE" VALUES('http_8001');
INSERT INTO "LT_SERVICE_TYPE" VALUES('IRC');
INSERT INTO "LT_SERVICE_TYPE" VALUES('imap4');
INSERT INTO "LT_SERVICE_TYPE" VALUES('iso_tsap');
INSERT INTO "LT_SERVICE_TYPE" VALUES('klogin');
INSERT INTO "LT_SERVICE_TYPE" VALUES('kshell');
INSERT INTO "LT_SERVICE_TYPE" VALUES('ldap');
INSERT INTO "LT_SERVICE_TYPE" VALUES('link');
INSERT INTO "LT_SERVICE_TYPE" VALUES('login');
INSERT INTO "LT_SERVICE_TYPE" VALUES('mtp');
INSERT INTO "LT_SERVICE_TYPE" VALUES('name');
INSERT INTO "LT_SERVICE_TYPE" VALUES('netbios_dgm');
INSERT INTO "LT_SERVICE_TYPE" VALUES('netbios_ns');
INSERT INTO "LT_SERVICE_TYPE" VALUES('netbios_ssn');
INSERT INTO "LT_SERVICE_TYPE" VALUES('netstat');
INSERT INTO "LT_SERVICE_TYPE" VALUES('nnsp');
INSERT INTO "LT_SERVICE_TYPE" VALUES('nntp');
INSERT INTO "LT_SERVICE_TYPE" VALUES('ntp_u');
INSERT INTO "LT_SERVICE_TYPE" VALUES('other');
INSERT INTO "LT_SERVICE_TYPE" VALUES('pm_dump');
INSERT INTO "LT_SERVICE_TYPE" VALUES('pop_2');
INSERT INTO "LT_SERVICE_TYPE" VALUES('pop_3');
INSERT INTO "LT_SERVICE_TYPE" VALUES('printer');
INSERT INTO "LT_SERVICE_TYPE" VALUES('private');
INSERT INTO "LT_SERVICE_TYPE" VALUES('red_i');
INSERT INTO "LT_SERVICE_TYPE" VALUES('remote_job');
INSERT INTO "LT_SERVICE_TYPE" VALUES('rje');
INSERT INTO "LT_SERVICE_TYPE" VALUES('shell');
INSERT INTO "LT_SERVICE_TYPE" VALUES('smtp');
INSERT INTO "LT_SERVICE_TYPE" VALUES('sql_net');
INSERT INTO "LT_SERVICE_TYPE" VALUES('ssh');
INSERT INTO "LT_SERVICE_TYPE" VALUES('sunrpc');
INSERT INTO "LT_SERVICE_TYPE" VALUES('supdup');
INSERT INTO "LT_SERVICE_TYPE" VALUES('systat');
INSERT INTO "LT_SERVICE_TYPE" VALUES('telnet');
INSERT INTO "LT_SERVICE_TYPE" VALUES('tftp_u');
INSERT INTO "LT_SERVICE_TYPE" VALUES('tim_i');
INSERT INTO "LT_SERVICE_TYPE" VALUES('time');
INSERT INTO "LT_SERVICE_TYPE" VALUES('urh_i');
INSERT INTO "LT_SERVICE_TYPE" VALUES('urp_i');
INSERT INTO "LT_SERVICE_TYPE" VALUES('uucp');
INSERT INTO "LT_SERVICE_TYPE" VALUES('uucp_path');
INSERT INTO "LT_SERVICE_TYPE" VALUES('vmnet');
INSERT INTO "LT_SERVICE_TYPE" VALUES('whois');
INSERT INTO "LT_SERVICE_TYPE" VALUES('X11');
INSERT INTO "LT_SERVICE_TYPE" VALUES('Z39_50');


INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.trees.J48', 'J48');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.rules.RuleClassifierNBayes', 'RuleClassifierNBayes');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.bayes.NaiveBayes', 'NaiveBayes');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.functions.Logistic', 'Logistic');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.meta.AdaBoostM1', 'AdaBoostM1');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.rules.DecisionTable', 'DecisionTable');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.rules.OneR', 'OneR');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.rules.ZeroR', 'ZeroR');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.trees.RandomForest', 'RandomForest');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.trees.DecisionStump', 'DecisionStump');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.trees.RandomTree', 'RandomTree');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.trees.REPTree', 'REPTree');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.lazy.IBk', 'IBk');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.functions.SMO', 'SMO');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.bayes.BayesNet', 'BayesNet');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.functions.MultilayerPerceptron', 'MLP');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.functions.SGD', 'SGD');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.functions.SimpleLogistic', 'SimpleLogistic');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.trees.HoeffdingTree', 'HoeffdingTree');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.bayes.NaiveBayes', 'NaiveBayes');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.functions.Perceptron', 'Perceptron');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.functions.SGD', 'SGD');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.functions.SPegasos', 'SPegasos');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.lazy.kNN', 'kNN');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.lazy.kNNwithPAW', 'kNNwithPAW');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.lazy.kNNwithPAWandADWIN', 'kNNwithPAWandADWIN');

INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.meta.OzaBag', 'OzaBag');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('moa.classifiers.rules.RuleClassifier', 'RuleClassifier');

INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.functions.RBFClassifier', 'RBFClassifier');
INSERT INTO LT_CLASSIFIER_NAMES (ClassifierFullName, classifierShortName) VALUES ('weka.classifiers.functions.RBFNetwork', 'RBFNetwork');


