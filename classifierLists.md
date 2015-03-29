# Classifier List

## Bayes

BayesNet
weka.classifiers.bayes.BayesNet -D -Q weka.classifiers.bayes.net.search.local.K2 -- -P 1 -S BAYES -E weka.classifiers.bayes.net.estimate.SimpleEstimator -- -A 0.5
NaiveBayes
weka.classifiers.bayes.NaiveBayes
weka.classifiers.bayes.NaiveBayesMultinomial
weka.classifiers.bayes.NaiveBayesUpdateable


## Functions

weka.classifiers.functions.Logistic -R 1.0E-8 -M -1
weka.classifiers.functions.MultilayerPerceptron -L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a
weka.classifiers.functions.SGD -F 0 -L 0.01 -R 1.0E-4 -E 500 -C 0.001 -S 1
weka.classifiers.functions.SimpleLogistic -I 0 -M 500 -H 50 -W 0.0
weka.classifiers.functions.SMO -C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K "weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007"
weka.classifiers.functions.VotedPerceptron -I 1 -E 1.0 -S 1 -M 10000

## Lazy
weka.classifiers.lazy.IBk -K 1 -W 0 -A "weka.core.neighboursearch.LinearNNSearch -A \"weka.core.EuclideanDistance -R first-last\""
weka.classifiers.lazy.KStar -B 20 -M a
weka.classifiers.lazy.LWL -U 0 -K -1 -A "weka.core.neighboursearch.LinearNNSearch -A \"weka.core.EuclideanDistance -R first-last\"" -W weka.classifiers.trees.DecisionStump


## Meta
weka.classifiers.meta.AdaBoostM1 -P 100 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump
weka.classifiers.meta.AttributeSelectedClassifier -E "weka.attributeSelection.CfsSubsetEval -P 1 -E 1" -S "weka.attributeSelection.BestFirst -D 1 -N 5" -W weka.classifiers.trees.J48 -- -C 0.25 -M 2
weka.classifiers.meta.Bagging -P 100 -S 1 -num-slots 1 -I 10 -W weka.classifiers.trees.REPTree -- -M 2 -V 0.001 -N 3 -S 1 -L -1 -I 0.0
weka.classifiers.meta.ClassificationViaRegression -W weka.classifiers.trees.M5P -- -M 4.0
weka.classifiers.meta.CostSensitiveClassifier -N /Users/atilla/Tools/weka-3-7-12 -S 1 -W weka.classifiers.rules.ZeroR
weka.classifiers.meta.CVParameterSelection -X 10 -S 1 -W weka.classifiers.rules.ZeroR

