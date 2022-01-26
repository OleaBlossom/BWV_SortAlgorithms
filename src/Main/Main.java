package Main;

import SortAlgorithms.SortAlgorithms;

public class Main {

    public static void main(String[] args) {
        SortAlgorithms s = new SortAlgorithms();

        int[] arrayFromSelection = s.selectionSort();

        for (int j : arrayFromSelection) {
            System.out.println(j);
        }
    }
}
