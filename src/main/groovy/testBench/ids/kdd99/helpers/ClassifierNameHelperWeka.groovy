public class ClassifierNameHelper
{

    static map = [ "J48": "weka.classifiers.trees.J48",
"SMO": "weka.classifiers.functions.SMO",
"BayesNet":"weka.classifiers.bayes.BayesNet",
"NaiveBayes":"weka.classifiers.bayes.NaiveBayes",
"Logistic": "weka.classifiers.functions.Logistic",
"MultilayerPerceptron":"weka.classifiers.functions.MultilayerPerceptron",
"MLP":"weka.classifiers.functions.MultilayerPerceptron",
"RBFNetwork": "weka.classifiers.functions.RBFNetwork",
"RBFClassifier":"weka.classifiers.functions.RBFClassifier",
"SGD":"weka.classifiers.functions.SGD",
"SimpleLogistic":"weka.classifiers.functions.SimpleLogistic",
"AdaBoostM1":"weka.classifiers.meta.AdaBoostM1",
"DecisionStump":"weka.classifiers.trees.DecisionStump",
"DecisionTable":"weka.classifiers.rules.DecisionTable",
"OneR":"weka.classifiers.rules.OneR",
"ZeroR":"weka.classifiers.rules.ZeroR",
"JRip":"weka.classifiers.rules.JRip",
"PART":"weka.classifiers.rules.PART",
"RandomForest":"weka.classifiers.trees.RandomForest",
"LMT":"weka.classifiers.trees.LMT",
"RandomTree":"weka.classifiers.trees.RandomTree",
"REPTree":"weka.classifiers.trees.REPTree",
"IBk":"weka.classifiers.lazy.IBk"

]


    public static String getLongName(String classifierShortName)
    {
        return map[classifierShortName];
    }

    public static String getShortName(String classifierLongName)
    {
    	int lastDot = classifierLongName.lastIndexOf(".");
    	String shortName = classifierLongName.substring(lastDot + 1, classifierLongName.length());
        return shortName;
    }



}