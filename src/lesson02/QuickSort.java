package lesson02;

/**
 * Sort an array by Quick sort algorithm
 *
 */
public class QuickSort {

    public static void sort(int[] array) {
        sortHelper(array, 0, array.length - 1);
    }

    public static void sortHelper(int[] array, int left, int right) {
        if (right > left) {
            int index = partition(array, left, right);
            sortHelper(array, left, index - 1);
            sortHelper(array, index, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[left + (right - left) / 2]; // fix overflow

        while (left <= right) {
            while (array[left] < pivot) {
                ++left;
            }

            while (array[right] > pivot) {
                --right;
            }

            if (left <= right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                ++left;
                --right;
            }
        }

        return left;
    }
}
