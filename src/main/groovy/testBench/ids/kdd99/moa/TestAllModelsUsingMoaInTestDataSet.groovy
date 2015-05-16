package testBench.ids.kdd99.moa


import java.util.List;

import testBench.ids.kdd99.*;
import testBench.ids.kdd99.dal.*;
import testBench.ids.kdd99.helpers.datasetHelpers.*;
import testBench.ids.kdd99.helpers.modelHelpers.*;
import testBench.ids.kdd99.helpers.*;

import groovy.io.FileType;


def dir = new File(Finals.MODELS_SAVE_FOLDER )
dir.eachFile (FileType.FILES) { file ->
     if(file.name.endsWith('.moa')) {
        println(file.name)
        

        String[] argList = new String[2];
        argList[0] = "modelFileName";
        argList[1] = file.name;

        TestOneModelUsingMoaInTestDataSet.main(argList)        
    }

}
