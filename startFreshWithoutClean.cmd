SET PATH=%PATH%;.\tools
gradlew downloadKddDatasetFiles unzipKddDatasetFiles tableImportKddTrainDataFromCommandLine schemaChangeAfterImport CreateArffFileForFullTrainingAndTestDataset trainAllModelsUsingWekaInTrainingDataSet testAllModelsUsingWekaInTrainingDataSet testAllModelsUsingWekaInTestDataSet

