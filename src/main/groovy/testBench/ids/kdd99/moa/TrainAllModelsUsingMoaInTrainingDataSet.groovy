package testBench.ids.kdd99.moa;



import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;
import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;



import moa.options.*;
import weka.core.*;
import moa.tasks.*;

import moa.classifiers.*;
import moa.classifiers.trees.HoeffdingTree;
import moa.streams.generators.*;
import moa.streams.*;

ClassifiersAndArgumentsMoa.classifierList.each{
	println(it["ClassifierShortName"])
    String[] argList = new String[2];
    argList[0] = "classifierName";
    argList[1] = it["ClassifierShortName"];


	TrainOneModelUsingMoaInTrainingDataSet.main(argList)
}
