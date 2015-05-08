package testBench.ids.kdd99.helpers;

import java.util.Random;


public class RandomNumbersHelpers
{

    private static Random rnd = new Random();

    private static final int KDD_TRAIN_DATA_NODUP_COUNT = 1074992;
    private static final int KDD_TRAIN_DATA_COUNT = 4898431;
    private static final int TEST_CORRECTED_COUNT = 311029;


    private static final int CONSTANT_START_SEED = 19112012;

    private static int startSeed = CONSTANT_START_SEED;

    private RandomNumbersHelpers()
    {
        reset();  
    }

    public static Random getRandom()
    {
      return rnd;
    }


    public static void reset()
    {
        rnd = new Random();
        rnd.setSeed(startSeed);
    }


    public static void setSeed(int seed)
    {
        this.startSeed = seed;
        reset();
    }

    public static int randInt(int min, int max) {

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rnd.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    public static int randIntKddTrainData()
    {
        return randInt(1,KDD_TRAIN_DATA_COUNT);
    }

    public static int randIntKddTrainDataNoDuplicate()
    {
        return randInt(1,KDD_TRAIN_DATA_NODUP_COUNT);
    }


    public static List<Integer> getListOfRandomNumberKddTrainDataNoDuplicate(int size)
    {
        List<Integer> list = new ArrayList<Integer>(size);

        for(int i=0;i<size;i++)
        {
            list.add(randIntKddTrainDataNoDuplicate());
        }
        return list;
    }

    public static int[] getArrayOfRandomNumberKddTrainDataNoDuplicate(int size)
    {
        int[] list = new int[size];

        for(int i=0;i<size;i++)
        {
            list[i] = randIntKddTrainDataNoDuplicate();
        }
        return list;
    }


    public static void main(String[] args)
    {
        println(getListOfRandomNumberKddTrainDataNoDuplicate(100));
        reset();
        println(getArrayOfRandomNumberKddTrainDataNoDuplicate(100));

    }

}