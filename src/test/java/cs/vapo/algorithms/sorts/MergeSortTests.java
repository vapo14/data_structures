package cs.vapo.algorithms.sorts;

import java.util.Arrays;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MergeSortTests {

    @Test
    public void mergeSortRecursive() {
        int[] arr = new int[] {22, 35, 49, 39, 19, 47, 20, 2, 18, 7, 48, 40, 41, 3, 37, 6, 26, 12, 43, 33, 11, 13, 36,
                8, 46, 28, 27, 50, 42, 24, 14, 23, 16, 17, 30, 44, 4, 31, 1, 15, 10, 25, 5, 9, 21, 45, 29, 32, 38, 34};
        int[] sortedArr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
                24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
                49, 50};
        MergeSort.sortRecursive(arr);
        System.out.println(Arrays.toString(arr));
        Assertions.assertArrayEquals(sortedArr, arr);
    }
}
