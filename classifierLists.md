# Classifier List

## Bayes


1. weka.classifiers.bayes.BayesNet -D -Q weka.classifiers.bayes.net.search.local.K2 -- -P 1 -S BAYES -E weka.classifiers.bayes.net.estimate.SimpleEstimator -- -A 0.5
NaiveBayes
2. weka.classifiers.bayes.NaiveBayes
3. weka.classifiers.bayes.NaiveBayesMultinomial
4. weka.classifiers.bayes.NaiveBayesUpdateable

## Functions

1. weka.classifiers.functions.Logistic -R 1.0E-8 -M -1
2. weka.classifiers.functions.MultilayerPerceptron -L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H a
3. weka.classifiers.functions.SGD -F 0 -L 0.01 -R 1.0E-4 -E 500 -C 0.001 -S 1
4. weka.classifiers.functions.SimpleLogistic -I 0 -M 500 -H 50 -W 0.0
5. weka.classifiers.functions.SMO -C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K "weka.classifiers.functions.supportVector.PolyKernel -E 1.0 -C 250007"
6. weka.classifiers.functions.VotedPerceptron -I 1 -E 1.0 -S 1 -M 10000

## Lazy

1. weka.classifiers.lazy.IBk -K 1 -W 0 -A "weka.core.neighboursearch.LinearNNSearch -A \"weka.core.EuclideanDistance -R first-last\""
2. weka.classifiers.lazy.KStar -B 20 -M a
3. weka.classifiers.lazy.LWL -U 0 -K -1 -A "weka.core.neighboursearch.LinearNNSearch -A \"weka.core.EuclideanDistance -R first-last\"" -W weka.classifiers.trees.DecisionStump


## Meta

1. weka.classifiers.meta.AdaBoostM1 -P 100 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump
2. weka.classifiers.meta.AttributeSelectedClassifier -E "weka.attributeSelection.CfsSubsetEval -P 1 -E 1" -S "weka.attributeSelection.BestFirst -D 1 -N 5" -W weka.classifiers.trees.J48 -- -C 0.25 -M 2
3. weka.classifiers.meta.Bagging -P 100 -S 1 -num-slots 1 -I 10 -W weka.classifiers.trees.REPTree -- -M 2 -V 0.001 -N 3 -S 1 -L -1 -I 0.0
4. weka.classifiers.meta.ClassificationViaRegression -W weka.classifiers.trees.M5P -- -M 4.0
5. weka.classifiers.meta.CostSensitiveClassifier -N /Users/atilla/Tools/weka-3-7-12 -S 1 -W weka.classifiers.rules.ZeroR
6. weka.classifiers.meta.CVParameterSelection -X 10 -S 1 -W weka.classifiers.rules.ZeroR

7. weka.classifiers.meta.FilteredClassifier -F "weka.filters.supervised.attribute.Discretize -R first-last -precision 6" -W weka.classifiers.trees.J48 -- -C 0.25 -M 2
8. weka.classifiers.meta.IterativeClassifierOptimizer -W weka.classifiers.meta.LogitBoost -L 50 -P 1 -E 1 -I 1 -F 10 -R 1 -metric RMSE -S 1 -- -P 100 -L -1.7976931348623157E308 -H 1.0 -Z 3.0 -O 1 -E 1 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump

9. weka.classifiers.meta.LogitBoost -P 100 -L -1.7976931348623157E308 -H 1.0 -Z 3.0 -O 1 -E 1 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump

10. weka.classifiers.meta.MultiClassClassifier -M 0 -R 2.0 -S 1 -W weka.classifiers.functions.Logistic -- -R 1.0E-8 -M -1

11. weka.classifiers.meta.MultiClassClassifierUpdateable -M 0 -R 2.0 -S 1 -W weka.classifiers.functions.SGD -- -F 0 -L 0.01 -R 1.0E-4 -E 500 -C 0.001 -S 1
12. weka.classifiers.meta.MultiScheme -X 0 -S 1 -B "weka.classifiers.rules.ZeroR "

13. weka.classifiers.meta.RandomCommittee -S 1 -num-slots 1 -I 10 -W weka.classifiers.trees.RandomTree -- -K 0 -M 1.0 -V 0.001 -S 1
14. weka.classifiers.meta.RandomizableFilteredClassifier -S 1 -F "weka.filters.unsupervised.attribute.RandomProjection -N 10 -R 42 -D Sparse1" -W weka.classifiers.lazy.IBk -- -K 1 -W 0 -A "weka.core.neighboursearch.LinearNNSearch -A \"weka.core.EuclideanDistance -R first-last\""

15. weka.classifiers.meta.RandomSubSpace -P 0.5 -S 1 -num-slots 1 -I 10 -W weka.classifiers.trees.REPTree -- -M 2 -V 0.001 -N 3 -S 1 -L -1 -I 0.0


16. weka.classifiers.meta.Stacking -X 10 -M "weka.classifiers.rules.ZeroR " -S 1 -num-slots 1 -B "weka.classifiers.rules.ZeroR "
17. weka.classifiers.meta.Vote -S 1 -B "weka.classifiers.rules.ZeroR " -R AVG

## Rules

1. weka.classifiers.rules.DecisionTable -X 1 -S "weka.attributeSelection.BestFirst -D 1 -N 5"
2. weka.classifiers.rules.JRip -F 3 -N 2.0 -O 2 -S 1
3. weka.classifiers.rules.OneR -B 6
4. weka.classifiers.rules.PART -M 2 -C 0.25 -Q 1
5. weka.classifiers.rules.ZeroR

## Trees

1. weka.classifiers.trees.DecisionStump
2. weka.classifiers.trees.HoeffdingTree -L 2 -S 1 -E 1.0E-7 -H 0.05 -M 0.01 -G 200.0 -N 0.0
3. weka.classifiers.trees.J48 -C 0.25 -M 2
4. weka.classifiers.trees.LMT -I -1 -M 15 -W 0.0
5. weka.classifiers.trees.RandomForest -I 100 -K 0 -S 1 -num-slots 1
6. weka.classifiers.trees.RandomTree -K 0 -M 1.0 -V 0.001 -S 1
7. weka.classifiers.trees.REPTree -M 2 -V 0.001 -N 3 -S 1 -L -1 -I 0.0

## Extra Packages

1. weka.classifiers.functions.RBFNetwork -B 2 -S 1 -R 1.0E-8 -M -1 -W 0.1
