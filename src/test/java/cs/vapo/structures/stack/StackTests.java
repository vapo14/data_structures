package cs.vapo.structures.stack;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StackTests {

    @Test
    public void pushToStack() {
        final Stack<String> stack = new Stack<>();
        stack.push("v");
        stack.push("a");
        stack.push("p");
        stack.push("o");

        Assertions.assertFalse(stack.isEmpty());
        Assertions.assertEquals(4, stack.size());
    }

    @Test
    public void peekStack() {
        final Stack<Integer> stack = new Stack<>();
        stack.push(2);

        Assertions.assertEquals(2, stack.peek());
    }

    @Test
    public void popFromStack() {
        final Stack<String> stack = new Stack<>();
        stack.push("v");
        stack.push("a");

        final String value = stack.pop();
        Assertions.assertEquals("a", value);
        Assertions.assertEquals(1, stack.size());
    }
}
