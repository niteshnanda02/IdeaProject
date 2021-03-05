package com.company.Trie;

public class TrieClient {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.add("arts");
        trie.add("amit");
        trie.add("boy");
        trie.add("bug");
        trie.add("bats");
        trie.display();
        trie.remove("boy");
        System.out.println("----------------");
        trie.display();

    }
}
