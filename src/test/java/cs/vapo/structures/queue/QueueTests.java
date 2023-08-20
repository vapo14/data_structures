package cs.vapo.structures.queue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class QueueTests {

    @Test
    public void addToQueue() {
        final Queue<String> queue = new Queue<>();
        queue.add("v");
        queue.add("a");

        Assertions.assertEquals(2, queue.size());
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals("v", queue.peek());
    }

    @Test
    public void removeFromQueue() {
        final Queue<String> queue = new Queue<>();
        queue.add("v");
        queue.add("a");

        final String value = queue.remove();
        Assertions.assertEquals("v", value);
        Assertions.assertEquals(1, queue.size());
        Assertions.assertEquals("a", queue.peek());
    }
}
