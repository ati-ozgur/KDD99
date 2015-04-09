package testBench.ids.kdd99.moa


import java.util.List;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.datasetHelpers.*;
import testBench.ids.kdd99.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;


def dir = new File(Finals.MODELS_SAVE_FOLDER )
dir.eachFileRecurse (FileType.FILES) { file ->
    println(file)
}