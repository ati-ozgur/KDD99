package testBench.ids.kdd99;

public class ClassifiersAndArguments
{


    private static final template = [ Classifier:"",Options:""]


    private static final j48_1 = [ Classifier:"weka.classifiers.trees.J48", Options:" -C 0.25 -M 2"]
    private static final j48_2 = [ Classifier:"weka.classifiers.trees.J48", Options:" -U"]
    private static final j48_3 = [ Classifier:"weka.classifiers.trees.J48", Options:" -S"]

    private static final SMO_1 = [ Classifier:"weka.classifiers.functions.SMO",Options:""]
    private static final SMO_2 = [ Classifier:"weka.classifiers.functions.SMO",Options:"-C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -C 250007 -E 1.0\""]

    private static final bayes1 = [Classifier:"weka.classifiers.bayes.BayesNet",Options:" -D -Q weka.classifiers.bayes.net.search.local.K2 -- -P 1 -S BAYES -E weka.classifiers.bayes.net.estimate.SimpleEstimator -- -A 0.5"]

    private static final naiveBayes1 = [ Classifier:"weka.classifiers.bayes.NaiveBayes",Options:""]


    private static final Logistic1 = [ Classifier:"weka.classifiers.functions.Logistic",Options:"-R 1.0E-8 -M -1"]
    private static final MultilayerPerceptron1 = [ Classifier:"weka.classifiers.functions.MultilayerPerceptron",Options:" -L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H 3"]

    private static final RBFNetwork1 = [ Classifier:"weka.classifiers.functions.RBFNetwork",Options:" -B 2 -S 1 -R 1.0E-8 -M -1 -W 0.1"]
    private static final RBFClassifier1 = [ Classifier:"weka.classifiers.functions.RBFClassifier",Options:" -N 2 -R 0.01 -L 1.0E-6 -C 2 -P 1 -E 1 -S 1"]
    private static final SGD1 = [ Classifier:"weka.classifiers.functions.SGD",Options:" -F 0 -L 0.01 -R 1.0E-4 -E 500"]
    private static final SimpleLogistic1 = [ Classifier:"weka.classifiers.functions.SimpleLogistic",Options:" -I 0 -M 500 -H 50 -W 0.0"]


    private static final AdaBoostM1_1 = [ Classifier:"weka.classifiers.meta.AdaBoostM1",Options:" -P 100 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump"]
            
            
    private static final DecisionTable = [ Classifier:"weka.classifiers.rules.DecisionTable",Options:" -X 1 -S \"weka.attributeSelection.BestFirst -D 1 -N 5\""]
    private static final OneR = [ Classifier:"weka.classifiers.rules.OneR",Options:"-B 6"]
    private static final ZeroR = [ Classifier:"weka.classifiers.rules.ZeroR",Options:""]
            
    private static final JRip  = [ Classifier:"weka.classifiers.rules.JRip",Options:" -F 3 -N 2.0 -O 2 -S 1"]
    private static final PART  = [ Classifier:"weka.classifiers.rules.PART",Options:"-M 2 -C 0.25 -Q 1"]

    private static final RandomForest  = [ Classifier:"weka.classifiers.trees.RandomForest",Options:" -I 10 -K 0 -S 1 -num-slots 1"]
    private static final DecisionStump  = [ Classifier:"weka.classifiers.trees.DecisionStump",Options:""]
    private static final LMT = [ Classifier: "weka.classifiers.trees.LMT", Options: "-I -1 -M 15 -W 0.0"]
    private static final RandomTree  = [ Classifier:"weka.classifiers.trees.RandomTree",Options:" -K 0 -M 1.0 -S 1"]
    private static final REPTree  = [ Classifier:"weka.classifiers.trees.REPTree",Options:"-M 2 -V 0.001 -N 3 -S 1 -L -1 -I 0.0"]
    private static final IBk  = [ Classifier:"weka.classifiers.lazy.IBk",Options:"-K 1 -W 0 -A \"weka.core.neighboursearch.LinearNNSearch -A \\\"weka.core.EuclideanDistance -R first-last\\\"\""]


    public static classifierListFast = [
    j48_1 ,
    naiveBayes1 ,
    Logistic1 ,
    AdaBoostM1_1 ,
    DecisionTable ,
    OneR ,
    ZeroR ,
    RandomForest  ,
    DecisionStump  ,
    LMT  ,
    RandomTree  ,
    REPTree  ,
    IBk  

    ] 


    public static classifierListFull = [
    //j48_1 ,
    //j48_2 ,
    //j48_3 ,
    //SMO_1 ,
    //SMO_2 ,
    //bayes1 ,
    //naiveBayes1 ,
    //Logistic1 ,
    //MultilayerPerceptron1 ,
    //RBFNetwork1 ,
    //RBFClassifier1 ,
    //SGD1 ,
    //SimpleLogistic1 ,
    //AdaBoostM1_1 ,
    //DecisionTable ,
    //OneR ,
    ZeroR 
    //JRip  ,
    //PART  ,
    //RandomForest  ,
    //DecisionStump  ,
    //LMT  ,
    //RandomTree  ,
    //REPTree  ,
    //IBk  
    ]

    public static classifierList = classifierListFast

}

