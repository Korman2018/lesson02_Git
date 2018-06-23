package lesson02;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        int[] array = new int[500];

        for (int i = 0; i < array.length; ++i) {
            array[i] = array.length - i;
        }

        System.out.println("Unsorted array:\n" + Arrays.toString(array));
        QuickSort.sort(array);
        System.out.println("Sorted array:\n" + Arrays.toString(array));
    }
}
