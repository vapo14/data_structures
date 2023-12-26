package cs.vapo.structures.trees;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private Map<Character, TrieNode> children;

    private char value;

    private boolean endOfWord;

    public TrieNode() {
        this.children = new HashMap<>();
    }

    public TrieNode(final char value) {
        this.children = new HashMap<>();
        this.value = value;
    }

    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, TrieNode> children) {
        this.children = children;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }
}
