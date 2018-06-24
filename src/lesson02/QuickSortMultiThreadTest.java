package lesson02;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class QuickSortMultiThreadTest {

    @Test
    public void testQuickSortMultiThread() {
        Integer[] actual = new Integer[300_000];
        Random random = new Random();

        for (int i = 0; i < actual.length; i++) {
            actual[i] = random.nextInt();
        }
        Integer[] expected = Arrays.copyOf(actual, actual.length);
        Arrays.sort(expected);

        long start = System.currentTimeMillis();
        QuickSortMultiThread.sort(actual);
        start = System.currentTimeMillis() - start;
        System.out.println("MultiThread quicksort time " + start + "ms(" + actual.length + " elements)");
        assertEquals(true, Arrays.equals(actual, expected));
    }
}
