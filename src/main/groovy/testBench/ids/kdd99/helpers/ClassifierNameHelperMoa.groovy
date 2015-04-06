public class ClassifierNameHelperMoa
{

    static map = [ 
"NaiveBayes":"moa.classifiers.bayes.NaiveBayes",
"Perceptron": "moa.classifiers.functions.Perceptron",
"SGD": "moa.classifiers.functions.SGD",
"SPegasos": "moa.classifiers.functions.SPegasos",
"kNN": "moa.classifiers.lazy.kNN",
"OCBoost":"moa.classifiers.meta.OCBoost",
"OzaBag":"moa.classifiers.meta.OzaBag",
"OzaBoost":"moa.classifiers.meta.OzaBoost",
"RuleClassifier":"moa.classifiers.rules.RuleClassifier",
"RuleClassifierNBayes":"moa.classifiers.rules.RuleClassifierNBayes",
"DecisionStump":"moa.classifiers.trees.DecisionStump",
"HoeffdingTree":"moa.classifiers.trees.HoeffdingTree"


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