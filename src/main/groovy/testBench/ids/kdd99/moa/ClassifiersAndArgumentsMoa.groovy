package testBench.ids.kdd99.moa;

public class ClassifiersAndArgumentsMoa
{


    private static final template = [ Classifier:"",Options:""]



    private static final NaiveBayes = [ Classifier:"moa.classifiers.bayes.NaiveBayes",Options:""]
    private static final Perceptron = [ Classifier:"moa.classifiers.functions.Perceptron",Options:""]
    private static final SGD = [ Classifier:"moa.classifiers.functions.SGD",Options:""]
    private static final SPegasos = [ Classifier:"moa.classifiers.functions.SPegasos",Options:""]
    private static final kNN = [ Classifier:"moa.classifiers.lazy.kNN",Options:""]
    private static final OCBoost = [ Classifier:"moa.classifiers.meta.OCBoost",Options:""]
    private static final OzaBag = [ Classifier:"moa.classifiers.meta.OzaBag",Options:""]
    private static final OzaBoost = [ Classifier:"moa.classifiers.meta.OzaBoost",Options:""]
    private static final RuleClassifier = [ Classifier:"moa.classifiers.rules.RuleClassifier",Options:""]
    private static final RuleClassifierNBayes = [ Classifier:"moa.classifiers.rules.RuleClassifierNBayes",Options:""]
    private static final DecisionStump = [ Classifier:"moa.classifiers.trees.DecisionStump",Options:""]
    private static final HoeffdingTree = [ Classifier:"moa.classifiers.trees.HoeffdingTree",Options:""]




    public static classifierListFull = [
    NaiveBayes ,
    Perceptron ,
    SGD ,
    kNN ,
    OzaBag ,
    RuleClassifier ,
    RuleClassifierNBayes ,
    DecisionStump  ,
	HoeffdingTree      
    
    ] 

    public static classifierList = classifierListFull

}

