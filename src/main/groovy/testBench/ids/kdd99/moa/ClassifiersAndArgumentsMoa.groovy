package testBench.ids.kdd99.moa;

public class ClassifiersAndArgumentsMoa
{


    private static final template = [ Classifier:"",ClassifierShortName:"",Options:""]



    private static final NaiveBayes = [ ClassifierShortName:"NaiveBayes",Classifier:"moa.classifiers.bayes.NaiveBayes",Options:""]
    private static final Perceptron = [ClassifierShortName:"Perceptron", Classifier:"moa.classifiers.functions.Perceptron",Options:""]
    private static final SGD = [ClassifierShortName:"SGD", Classifier:"moa.classifiers.functions.SGD",Options:""]
    private static final SPegasos = [ClassifierShortName:"SPegasos", Classifier:"moa.classifiers.functions.SPegasos",Options:""]
    private static final kNN = [ClassifierShortName:"kNN", Classifier:"moa.classifiers.lazy.kNN",Options:""]
    private static final OCBoost = [ClassifierShortName:"OCBoost", Classifier:"moa.classifiers.meta.OCBoost",Options:""]
    private static final OzaBag = [ClassifierShortName:"OzaBag", Classifier:"moa.classifiers.meta.OzaBag",Options:""]
    private static final OzaBoost = [ClassifierShortName:"OzaBoost", Classifier:"moa.classifiers.meta.OzaBoost",Options:""]
    private static final RuleClassifier = [ClassifierShortName:"RuleClassifier", Classifier:"moa.classifiers.rules.RuleClassifier",Options:""]
    private static final RuleClassifierNBayes = [ClassifierShortName:"RuleClassifierNBayes", Classifier:"moa.classifiers.rules.RuleClassifierNBayes",Options:""]
    private static final DecisionStump = [ClassifierShortName:"DecisionStump", Classifier:"moa.classifiers.trees.DecisionStump",Options:""]
    private static final HoeffdingTree = [ClassifierShortName:"HoeffdingTree", Classifier:"moa.classifiers.trees.HoeffdingTree",Options:""]




    public static classifierListFull = [
    NaiveBayes ,
    Perceptron ,
    SGD ,
    SPegasos , 
    kNN ,
    OzaBag ,
    RuleClassifier ,
    RuleClassifierNBayes ,
    //DecisionStump  ,
	HoeffdingTree      
    
    ] 

    public static classifierList = classifierListFull

}

