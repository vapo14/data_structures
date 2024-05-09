package cs.vapo.structures.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Heap / Priority Queue data structure
 * This structure is implemented using an array to represent the complete binary tree.
 * For accessing any given node, we have the following formulas where 'i' is the index of the current 'node'
 * <ul>
 *     <li>leftChild = 2 * i</li>
 *     <li>rightChild = 2 * i + 1</li>
 *     <li>parent = i / 2 (round down) </li>
 * </ul>
 * These order properties are true since we have a complete binary tree.
 */
public class MinHeap {

    List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
        heap.add(0);
    }

    public void push(int val) {
        heap.add(val);
        int i = heap.size() - 1;

        // Percolate up
        while (i > 1 && heap.get(i) < heap.get(i / 2)) {
            int tmp = heap.get(i);
            heap.set(i, heap.get(i / 2));
            heap.set(i / 2, tmp);
            i = i / 2;
        }
    }

    public int pop() {
        if (heap.size() == 1) {
            return -1;
        }
        if (heap.size() == 2) {
            return heap.remove(heap.size() - 1); // equivalent to heap.remove(1)
        }

        int res = heap.get(1);
        // Move last value to root
        heap.set(1, heap.remove(heap.size() - 1));
        int i = 1;
        // Percolate down
        while(2 * i < heap.size()) {
            // if the right child is in range, and the right child is lower than the left, and the current node is
            // greater than the right child then swap. This essentially just swaps with the right child
            if (2 * i + 1 < heap.size() &&
                    heap.get(2 * i + 1) < heap.get(2 * i) &&
                    heap.get(i) > heap.get(2 * i + 1)) {
                // Swap right child
                int tmp = heap.get(i);
                heap.set(i, heap.get(2 * i + 1));
                heap.set(2 * i + 1, tmp);
                i = 2 * i + 1;
            // This swaps with the left child if it is less than the current node. These conditions can
            // be changed in case you want a max heap.
            } else if (heap.get(i) > heap.get(2 * i)) {
                // Swap left child
                int tmp = heap.get(i);
                heap.set(i, heap.get(2 * i));
                heap.set(2 * i, tmp);
                i = 2 * i;
            } else {
                break;
            }
        }
        return res;
    }
}
