package cs.vapo.structures.trees;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BinaryTreeTests {

    @Test
    public void inOrderTraversal() {
        final BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.insert(4);
        binaryTree.insert(32);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(5);

        final String expectedOutput = "1, 3, 4, 5, 32, ";
        Assertions.assertEquals(expectedOutput, binaryTree.inOrderTraversal());
    }

    @Test
    public void preOrderTraversal() {
        final BinaryTree<Integer> binaryTree = new BinaryTree<>();
        // in this case, since we did not create a sorting algorithm, the order in which
        // we insert the elements does matter.
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(4);
        binaryTree.insert(7);
        binaryTree.insert(6);
        binaryTree.insert(9);
        binaryTree.insert(8);
        binaryTree.insert(10);

        final String expectedOutput = "5, 3, 2, 1, 4, 7, 6, 9, 8, 10, ";

        Assertions.assertEquals(expectedOutput, binaryTree.preOrderTraversal());
    }

    @Test
    public void postOrderTraversal() {
        final BinaryTree<Integer> binaryTree = new BinaryTree<>();
        // in this case, since we did not create a balancing algorithm, the order in which
        // we insert the elements does matter. If you want to sort these values,
        // then use a BST (binary search tree)
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(4);
        binaryTree.insert(7);
        binaryTree.insert(6);
        binaryTree.insert(9);
        binaryTree.insert(8);
        binaryTree.insert(10);

        final String expectedOutput = "1, 2, 4, 3, 6, 8, 10, 9, 7, 5, ";
        Assertions.assertEquals(expectedOutput, binaryTree.postOrderTraversal());
    }
}
