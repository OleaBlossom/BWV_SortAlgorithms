package Main;

import SortAlgorithms.SortAlgorithms;

public class Main {

    public static void main(String[] args) {
        SortAlgorithms s = new SortAlgorithms();

        int[] arrayFromSelection = s.selectionSort(15);

        System.out.println("selection sort:");
        for (int j : arrayFromSelection) {
            System.out.println(j);
        }

        int[] arrayFromInsertion = s.insertionSort(25);

        System.out.println("insertion sort:");
        for (int j : arrayFromInsertion) {
            System.out.println(j);
        }
    }
}
