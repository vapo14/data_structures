package cs.vapo.algorithms.sorts;

public class MergeSort {

    /**
     * Recursive implementation of Merge Sort (top-down approach)
     * @param arr array to sort
     */
    public static void sortRecursive(int[] arr) {
        if (arr.length == 0) return;
        mergeSortRecursive(arr, 0, arr.length - 1);
    }

    private static void mergeSortRecursive(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortRecursive(arr, left, mid);
            mergeSortRecursive(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }
    }

    private static void merge(int[] arr, int left, int right, int mid) {
        int[] tempArray = new int[arr.length];

        for (int i = left; i <= right; i++) {
            tempArray[i] = arr[i];
        }

        int tempLeft = left;
        int tempRight = mid + 1;
        int current = left;

        while (tempLeft <= mid && tempRight <= right) {
            if (tempArray[tempLeft] <= tempArray[tempRight]) {
                arr[current] = tempArray[tempLeft];
                tempLeft++;
            } else {
                arr[current] = tempArray[tempRight];
                tempRight++;
            }
            current++;
        }

        int remaining = mid - tempLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = tempArray[tempLeft + i];
        }
    }
}
