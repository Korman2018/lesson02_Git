package lesson02;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        testQuickSort(100);
        testQuickSortMulti(100);
    }

    private static void testQuickSort(int size) {
        Integer[] array = new Integer[size];

        for (int i = 0; i < array.length; ++i) {
            array[i] = size - i;
        }

        System.out.println("Unsorted array:\n" + Arrays.toString(array));
        QuickSort.sort(array);
        System.out.println("Sorted array:\n" + Arrays.toString(array));
    }

    private static void testQuickSortMulti(int size) {
        Integer[] array = new Integer[size];

        for (int i = 0; i < array.length; ++i) {
            array[i] = size - i;
        }

        System.out.println("Unsorted array:\n" + Arrays.toString(array));
        QuickSortMultiThread.sort(array);
        System.out.println("Sorted array:\n" + Arrays.toString(array));
    }
}
