package cs.vapo.algorithms.sorts;

public class InsertionSort {

    /**
     * <p>
     * Insertion sort iterates, consuming one input element each repetition,
     * and grows a sorted output list. At each iteration, insertion sort removes one element
     * from the input data, finds the location it belongs within the sorted list,
     * and inserts it there. It repeats until no input elements remain.
     * </p>
     *
     * <a href="https://en.wikipedia.org/wiki/Insertion_sort">Wikipedia Reference</a>
     * @param arr the array to sort
     */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    /**
     * Simple swap method
     * @param arr the source array
     * @param i source position
     * @param j destination position
     */
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
