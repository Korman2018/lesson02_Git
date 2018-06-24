package lesson02;

/**
 * Sort an array by Quick sort algorithm
 *
 */
public class QuickSort {

    /**
     * Sort an array by Quick sort algorithm
     *
     * @param ar  array
     * @param <E> Comparable type
     */
    public static <E extends Comparable<E>> void sort(E[] ar) {
        sortHelper(ar, 0, ar.length - 1);
    }

    public static <E extends Comparable<E>> void sortHelper(E[] ar, int left, int right) {
        if (right <= left) {
            return;
        }
        int index = partition(ar, left, right);
        sortHelper(ar, left, index - 1);
        sortHelper(ar, index, right);
    }

    public static <E extends Comparable<E>> int partition(E ar[], int left, int right) {
        System.out.println("in method partition");
        E pivot = ar[left + (right - left) / 2]; // no overflow
        while (left <= right) {
            while (ar[left].compareTo(pivot) < 0) {
                left++;
            }
            while (ar[right].compareTo(pivot) > 0) {
                right--;
            }
            if (left <= right) {
                E tmp = ar[left];
                ar[left] = ar[right];
                ar[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
}
