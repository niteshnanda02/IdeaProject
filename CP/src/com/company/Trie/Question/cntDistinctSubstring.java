package com.company.Trie.Question;
import java.util.*;
public class cntDistinctSubstring {
    static class Trie{
        class Node{
            char data;
            Map<Character,Node> children;
            boolean isTerminal;
            Node(char d,boolean b){
                data=d;
                children=new HashMap<>();
                isTerminal=b;
            }
        }
        private Node root;
        private int numOfNodes;

        Trie(){
            root=new Node('\0',false);
            numOfNodes=0;
        }
        public int getNodes(){
            return getNodes(this.root);
        }
        private int getNodes(Node node){
            if(node==null)
                return 1;
            int c=0;
            Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
            for(Map.Entry<Character,Node> entry:entries){
                c+=getNodes(entry.getValue());
            }
            return c;
        }
        public void add(String word){
            add(this.root,word);
        }
        private void add(Node parent,String word){
            if(word.length()==0){
                if(parent.isTerminal){

                }else{
                    parent.isTerminal=true;

                }
                return;
            }
            char cc=word.charAt(0);
            String ros=word.substring(1);
            Node child=parent.children.get(cc);
            if(child==null){
                child=new Node(cc,false);
                parent.children.put(cc,child);
            }
            add(child,ros);
        }
    }
    public static int countDistinctSubstring(String st)
    {
        //your code here
        Trie trie=new Trie();
        for(int i=0;i<st.length();i++){
            trie.add(st.substring(i));
        }
        return trie.getNodes();

    }

    public static void main(String[] args) {
        System.out.println(countDistinctSubstring("ab"));
    }
}