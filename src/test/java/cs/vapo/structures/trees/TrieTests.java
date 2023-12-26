package cs.vapo.structures.trees;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TrieTests {

    @Test
    public void hasPrefix() {
        final Trie trie = new Trie();
        trie.insert("word");
        trie.insert("where");
        trie.insert("why");

        Assertions.assertTrue(trie.hasPrefix("wh"));
    }

    @Test
    public void hasWord() {
        final Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("help");
        trie.insert("held");

        Assertions.assertTrue(trie.hasWord("held"));
        Assertions.assertFalse(trie.hasWord("hellou"));
    }
}
