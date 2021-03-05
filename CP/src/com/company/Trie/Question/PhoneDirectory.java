package com.company.Trie.Question;

import com.company.Trie.Trie;

import java.util.*;

public class PhoneDirectory {
    public static class Trie {
        private class Node {
            char data;
            Map<Character, Node> children;
            boolean isTerminal;
            Set<String> set;

            public Node(char data, boolean isTerminal) {
                this.data = data;
                children = new HashMap<>();
                this.isTerminal = isTerminal;
                set = new TreeSet<>();
            }
        }

        private Node root;
        private int numOfWords;

        public Trie() {
            root = new Node('\0', false);
            numOfWords = 0;
        }

        public int getNumOfWords() {
            return numOfWords;
        }

        public void add(String word) {
            add(this.root, word, word);
        }

        //O(word length)
        private void add(Node parent, String word, String origWord) {

            if (word.length() == 0) {
                if (parent.isTerminal) {
                    //Word is already present there
                } else {
                    parent.isTerminal = true;
                }
                return;
            }
            char cc = word.charAt(0);
            String ros = word.substring(1);
            Node child = parent.children.get(cc); //O(1)
            if (child == null) {
                child = new Node(cc, false);
                parent.children.put(cc, child);
            }
            child.set.add(origWord);
            add(child, ros, origWord);
        }

        public Set<String> search(String word) {
            return search(this.root, word);
        }

        private Set<String> search(Node parent, String word) {
            if (word.length() == 0) {
                return parent.set;
            }

            char cc = word.charAt(0);
            String ros = word.substring(1);
            Node child = parent.children.get(cc);
            if (child == null)
                return null;
            return search(child, ros);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            Trie trie = new Trie();
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                String str = s.next();
                trie.add(str);
            }
            String query = s.next();
            for (int i = 0; i < query.length(); i++) {
                Set<String> set = trie.search(query.substring(0, i + 1));
                if (set == null) {
                    System.out.println(0);
                } else {
                    for (String str :
                            set) {
                        System.out.print(str + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
/*
sanaaaaabbb sanaaabbabb sanaab sanaababba sanaababbabaa sanaba sanabaaaaababa sanababaaaaaaaa sanabb sanabbbbaab sanbabb sanbabbbaabbbb sanbbbbbaa
sanaaaaabbb sanaaabbabb sanaab sanaababba sanaababbabaa sanaba sanabaaaaababa sanababaaaaaaaa sanabb sanabbbbaab sanbabb sanbabbbaabbbb sanbbbbbaa
sanaaaaabbb sanaaabbabb sanaab sanaababba sanaababbabaa sanaba sanabaaaaababa sanababaaaaaaaa sanabb sanabbbbaab sanbabb sanbabbbaabbbb sanbbbbbaa
sanbabb sanbabbbaabbbb sanbbbbbaa
sanbbbbbaa
sanbbbbbaa
 */