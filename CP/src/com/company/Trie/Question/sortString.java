package com.company.Trie.Question;

import com.company.Trie.Trie;

import java.util.*;

public class sortString {
    public static class Trie {
        private class Node {
            char data;
            Map<Character, Node> children;
            boolean isTerminal;

            public Node(char data, boolean isTerminal) {
                this.data = data;
                children = new TreeMap<>();
                this.isTerminal = isTerminal;
            }
        }

        private Node root;

        public Trie() {
            root = new Node('\0', false);
        }

        public void add(String word) {
            add(this.root, word);
        }

        //O(word length)
        private void add(Node parent, String word) {

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

            add(child, ros);
        }

        public void display() {
            display(this.root, "");
        }

        private void display(Node node, String osf) {

            if (node.isTerminal) {
                String toDisplay = osf.substring(1) + node.data;
                System.out.println(toDisplay);
                return;
            }

            Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
            for (Map.Entry<Character, Node> entry : entries) {
                display(entry.getValue(), osf + node.data);
            }


        }
    }

    public static void main(String[] args) {
        Trie trie=new Trie();
        String[] a={"geeks", "for", "geeks", "a", "portal",
                "to", "learn", "can", "be", "computer",
                "science", "zoom", "yup", "fire", "in", "data"};
        for (int i = 0; i <a.length ; i++) {
            trie.add(a[i]);
        }
        trie.display();
    }

}
