package cs.vapo.structures.stack;

/**
 * A Stack uses LIFO (last in first out) ordering
 */
public class Stack<T> {

    private StackNode<T> head;

    public Stack() {
        this.head = null;
    }

    public T pop() {
        if (head == null) {
            return null;
        }
        final StackNode<T> previousHead = this.head;
        this.head = previousHead.getNext();
        previousHead.setNext(null);
        return previousHead.getData();
    }

    public void push(T data) {
        final StackNode<T> newNode = new StackNode<>();
        newNode.setData(data);
        if (head == null) {
            this.head = newNode;
            return;
        }
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public T peek() {
        return this.head.getData();
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        if (this.head == null) {
            return 0;
        }
        StackNode<T> pointer = this.head;
        int count = 1;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
            count++;
        }
        return count;
    }
}
