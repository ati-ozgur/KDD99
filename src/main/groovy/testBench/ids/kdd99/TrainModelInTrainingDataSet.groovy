package testBench.ids.kdd99


import java.util.List;

import weka.core.Instances;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


def map = [ "J48": "weka.classifiers.trees.J48",
"SMO": "weka.classifiers.functions.SMO",
"BayesNet":"weka.classifiers.bayes.BayesNet",
"NaiveBayes":"weka.classifiers.bayes.NaiveBayes",
"Logistic": "weka.classifiers.functions.Logistic",
"MultilayerPerceptron":"weka.classifiers.functions.MultilayerPerceptron"
]

classifierName = args[1]

print map[classifierName]





