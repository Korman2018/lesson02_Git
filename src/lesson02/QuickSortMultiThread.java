package lesson02;


public class QuickSortMultiThread extends QuickSort {

    private static volatile int threadCount;

    private static int maxThreads = Runtime.getRuntime().availableProcessors();

    /**
     * Sort an array by Quick sort algorithm
     */
    public static void sort(int[] ar) {
        sortHelper(ar, 0, ar.length - 1);
    }

    public static void sortHelper(final int[] ar, final int left, final int right) {
        if (right <= left) {
            return;
        }
        final int index = partition(ar, left, right);
        if (threadCount < maxThreads) {
            Thread thread = new Thread(() -> {
                sortHelper(ar, left, index - 1);
            });
            thread.start();
            threadCount++;
            sortHelper(ar, index, right);
            try {
                thread.join();
                threadCount--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            sortHelper(ar, left, index - 1);
            sortHelper(ar, index, right);
        }
    }
}
