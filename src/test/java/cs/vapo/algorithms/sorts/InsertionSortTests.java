package cs.vapo.algorithms.sorts;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class InsertionSortTests {

    @Test
    public void insertionSort() {
        final int[] arr = {4, 34, 55, 26, 262, 62, 26 };
        final int[] expectedOutput = {4, 26, 26, 34, 55, 62, 262};

        InsertionSort.sort(arr);

        Assertions.assertArrayEquals(arr, expectedOutput);
    }
}
