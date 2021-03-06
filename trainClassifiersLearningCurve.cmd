gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.rules.ZeroR' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.rules.OneR -B 6' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.trees.DecisionStump' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.trees.J48  -C 0.25 -M 2' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.trees.J48  -U' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.trees.J48  -S' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.trees.RandomForest -I 10 -K 0 -S 1 -num-slots 1' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.trees.RandomTree -K 0 -M 1.0 -S 1' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.SMO' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.SMO -C 1.0 -L 0.001 -P 1.0E-12 -N 0 -V -1 -W 1 -K \"weka.classifiers.functions.supportVector.PolyKernel -C 250007 -E 1.0\"' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.bayes.BayesNet -D -Q weka.classifiers.bayes.net.search.local.K2 -- -P 1 -S BAYES -E weka.classifiers.bayes.net.estimate.SimpleEstimator -- -A 0.5' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.bayes.NaiveBayes' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.Logistic -R 1.0E-8 -M -1' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.MultilayerPerceptron  -L 0.3 -M 0.2 -N 500 -V 0 -S 0 -E 20 -H 3' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.RBFNetwork  -B 2 -S 1 -R 1.0E-8 -M -1 -W 0.1' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.RBFClassifier -N 2 -R 0.01 -L 1.0E-6 -C 2 -P 1 -E 1 -S 1' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.SGD  -F 0 -L 0.01 -R 1.0E-4 -E 500' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.functions.SimpleLogistic -I 0 -M 500 -H 50 -W 0.0' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.meta.AdaBoostM1 -P 100 -S 1 -I 10 -W weka.classifiers.trees.DecisionStump' -PfolderName=Datasets\SavedArff
gradlew trainOneModelUsingWekaInGivenFolderTrainingDataSets -PclassifierFullString='weka.classifiers.rules.DecisionTable -X 1 -S \"weka.attributeSelection.BestFirst -D 1 -N 5\"' -PfolderName=Datasets\SavedArff


