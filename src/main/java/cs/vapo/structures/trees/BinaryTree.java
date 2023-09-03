package cs.vapo.structures.trees;

public class BinaryTree<T extends Comparable<T>> {

    private BinaryTreeNode<T> root;

    /**
     * Inserts a new node into the tree following the simple BinaryTree implementation
     * @param value the value of the new node
     */
    public void insert(T value) {
        final BinaryTreeNode<T> newNode = new BinaryTreeNode<>();
        newNode.setValue(value);
        if (root == null) {
            root = newNode;
            return;
        }
        insert(root, newNode);
    }

    private void insert(BinaryTreeNode<T> rootNode, BinaryTreeNode<T> newNode) {
        // if the new value is smaller than the current node, then insert left
        // else, insert in right subtree
        if (newNode.getValue().compareTo(rootNode.getValue()) < 0) {
            if (rootNode.getLeft() == null) {
                rootNode.setLeft(newNode);
                return;
            }
            insert(rootNode.getLeft(), newNode);
        } else {
            if (rootNode.getRight() == null) {
                rootNode.setRight(newNode);
                return;
            }
            insert(rootNode.getRight(), newNode);
        }
    }

    /**
     * InOrder traversal of the tree.
     * <ol>
     *     <li>Traverse the left subtree</li>
     *     <li>Traverse the root</li>
     *     <li>Traverse the right subtree</li>
     * </ol>
     * @return a string representing the order of the nodes visited
     */
    public String inOrderTraversal() {
        final StringBuilder stringBuilder = new StringBuilder();
        inOrderTraversal(root, stringBuilder);
        return stringBuilder.toString();
    }

    private void inOrderTraversal(final BinaryTreeNode<T> root, final StringBuilder stringBuilder) {
        if (root == null) {
            return;
        }
        // traverse left subtree
        inOrderTraversal(root.getLeft(), stringBuilder);
        // traverse root
        stringBuilder.append(root.getValue()).append(", ");
        // traverse right subtree
        inOrderTraversal(root.getRight(), stringBuilder);
    }

    /**
     * PreOrder traversal of the tree.
     * <ol>
     *     <li>Traverse the root</li>
     *     <li>Traverse the left subtree</li>
     *     <li>Traverse the right subtree</li>
     * </ol>
     * @return a string representing the order of the nodes visited
     */
    public String preOrderTraversal() {
        final StringBuilder stringBuilder = new StringBuilder();
        preOrderTraversal(root, stringBuilder);
        return stringBuilder.toString();
    }

    private void preOrderTraversal(final BinaryTreeNode<T> root, final StringBuilder stringBuilder) {
        if (root == null) {
            return;
        }
        // visit the root
        stringBuilder.append(root.getValue()).append(", ");
        // visit left subtree
        preOrderTraversal(root.getLeft(), stringBuilder);
        // visit right subtree
        preOrderTraversal(root.getRight(), stringBuilder);
    }

    /**
     * PostOrder traversal of the tree.
     * <ol>
     *     <li>Traverse the left subtree</li>
     *     <li>Traverse the right subtree</li>
     *     <li>Traverse the root</li>
     * </ol>
     * @return a string representing the order of the nodes visited
     */
    public String postOrderTraversal() {
        final StringBuilder stringBuilder = new StringBuilder();
        postOrderTraversal(root, stringBuilder);
        return stringBuilder.toString();
    }

    private void postOrderTraversal(final BinaryTreeNode<T> root, final StringBuilder stringBuilder) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.getLeft(), stringBuilder);
        postOrderTraversal(root.getRight(), stringBuilder);
        stringBuilder.append(root.getValue()).append(", ");
    }

    public BinaryTreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<T> root) {
        this.root = root;
    }
}
