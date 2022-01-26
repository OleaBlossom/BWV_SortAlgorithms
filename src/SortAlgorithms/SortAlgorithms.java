package SortAlgorithms;

import java.util.Random;

public class SortAlgorithms {


    /**
     * leave to last -- we don't have to do this one
     *
     * @return int[]
     */
    public int[] bubbleSort(int size) {
        int[] myArray = loadArrayOfRandomInts(size);
        return myArray;
    }

    public int[] insertionSort(int size) {
        int[] array = loadArrayOfRandomInts(size);

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int current = array[i];

            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = current;
        }

        return array;
    }

    public int[] selectionSort(int size) {
        int[] array = loadArrayOfRandomInts(size);

        for (int i = 0; i < (array.length - 1); i++) {
            int minPosition = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
            }

            int tmp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = tmp;
        }

        return array;
    }

    private int[] loadArrayOfRandomInts(int size) {
        Random rand = new Random();
        int[] myArray = new int[size];

        for (int i = 0; i < size; i++) {
            myArray[i] = rand.nextInt(1000);
        }

        return myArray;
    }
}
