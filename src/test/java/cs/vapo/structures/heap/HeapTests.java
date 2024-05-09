package cs.vapo.structures.heap;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HeapTests {

    @Test
    public void minHeap() {
        int[] arr = {3,42,52,632,62,6,2462,0,5253,52,52,526,7,37,9};
        int expectedFirst = 0;
        int expectedSecond = 3;
        int expectedThird = 1;
        MinHeap minHeap = new MinHeap();
        for (int i : arr) {
            minHeap.push(i);
        }

        Assertions.assertEquals(expectedFirst, minHeap.pop());
        Assertions.assertEquals(expectedSecond, minHeap.pop());
        minHeap.push(1);
        Assertions.assertEquals(expectedThird, minHeap.pop());
    }

    @Test
    public void maxHeap() {
        int[] arr = {3,42,52,632,62,6,2462,0,5253,52,52,526,7,37,9};
        int expectedFirst = 5253;
        int expectedSecond = 2462;
        int expectedThird = 8888;
        MaxHeap maxHeap = new MaxHeap();
        for (int i : arr) {
            maxHeap.push(i);
        }

        Assertions.assertEquals(expectedFirst, maxHeap.pop());
        Assertions.assertEquals(expectedSecond, maxHeap.pop());
        maxHeap.push(8888);
        Assertions.assertEquals(expectedThird, maxHeap.pop());
    }
}
