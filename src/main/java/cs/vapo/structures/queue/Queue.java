package cs.vapo.structures.queue;

/**
 * A queue uses FIFO (first in first out) ordering.
 * @param <T> Generic Type
 */
public class Queue<T> {

    private QueueNode<T> head;

    public Queue() {
        this.head = null;
    }

    public void add(final T data) {
        QueueNode<T> newNode = new QueueNode<>();
        newNode.setData(data);
        if (head == null) {
            head = newNode;
            return;
        }
        QueueNode<T> pointer = head;
        // consider using two pointers (head, tail) to skip the
        // iteration to the last node
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        pointer.setNext(newNode);
    }
    public T remove() {
        if (head == null) return null;
        final T data = head.getData();
        head = head.getNext();
        return data;
    }
    public T peek() {
        return head.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (head == null) return 0;
        int count = 1;
        QueueNode<T> pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
            count++;
        }
        return count;
    }

}
