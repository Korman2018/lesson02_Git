package lesson02;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class QuickSortSingleThreadTest {

    @Test
    public void testQuickSort() {
        Integer[] actual = new Integer[500_000];
        Random random = new Random();

        for (int i = 0; i < actual.length; i++) {
            actual[i] = random.nextInt();
        }
        Integer[] expected = Arrays.copyOf(actual, actual.length);
        Arrays.sort(expected);

        long start = System.currentTimeMillis();
        QuickSort.sort(actual);
        start = System.currentTimeMillis() - start;
        System.out.println("Single thread quicksort time " + start + "ms(" + actual.length + " elements)");
        assertEquals(true, Arrays.equals(actual, expected));
    }
}
