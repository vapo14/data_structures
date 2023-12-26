package cs.vapo.structures.trees;

import java.util.HashMap;

public class Trie {

    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public boolean insert(final String word) {
        if (word == null) {
            return false;
        }

        TrieNode currentNode = this.root;

        for (final char character : word.toCharArray()) {
            if (currentNode.getChildren() == null) {
                currentNode.setChildren(new HashMap<>());
            }
            if (!currentNode.getChildren().containsKey(character)) {
                currentNode.getChildren().put(character, new TrieNode(character));
            }

            currentNode = currentNode.getChildren().get(character);
        }

        currentNode.setEndOfWord(true);
        return true;
    }

    public boolean hasWord(final String word) {
        if (word == null) {
            return false;
        }

        TrieNode currentNode = this.root;

        for (final char character : word.toCharArray()) {
            if (!currentNode.getChildren().containsKey(character)) {
                return false;
            }
            currentNode = currentNode.getChildren().get(character);
        }

        return currentNode.isEndOfWord();
    }

    public boolean hasPrefix(final String prefix) {
        if (prefix == null) {
            return false;
        }

        TrieNode currentNode = this.root;

        for (final char character : prefix.toCharArray()) {
            if (!currentNode.getChildren().containsKey(character)) {
                return false;
            }
            currentNode = currentNode.getChildren().get(character);
        }

        return true;
    }

}