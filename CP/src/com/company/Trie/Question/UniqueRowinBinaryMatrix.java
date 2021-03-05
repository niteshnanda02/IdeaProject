package com.company.Trie.Question;
import java.util.*;
public class UniqueRowinBinaryMatrix {
    static class Trie{
        class Node{
            int data;
            Map<Integer,Node> children;
            boolean isTerminal;

            Node(int d,boolean b){
                data=d;
                children=new HashMap<>();
                isTerminal=b;
            }
        }
        private Node root;

        Trie(){
            root=new Node(2,false);
        }
        public void add(int[] a,int i,int n){
            add(this.root,a,i,n);
        }
        private void add(Node parent,int[] a,int i,int n){
            if(i==n){
                if(parent.isTerminal){

                }else{
                    parent.isTerminal=true;
                }
                return;
            }
            int cc=a[i];
            Node child=parent.children.get(cc);
            if(child==null){
                child=new Node(cc,false);
                parent.children.put(cc,child);
            }

            add(child,a,i+1,n);
        }
        public void display(ArrayList<ArrayList<Integer>> list){
            display(this.root,"",list);
        }
        private void display(Node node, String osf, ArrayList<ArrayList<Integer>> list){
            if(node.isTerminal){
                String toDisplay=osf.substring(1)+node.data;
                ArrayList<Integer> subList=new ArrayList<>();
                for (int i = 0; i <toDisplay.length() ; i++) {
                    char ch=toDisplay.charAt(i);
                    subList.add(ch-'0');
                }
                list.add(subList);
                return;
            }
            Set<Map.Entry<Integer,Node>> entries=node.children.entrySet();
            for(Map.Entry<Integer,Node> entry:entries){

                display(entry.getValue(),osf+node.data,list);
            }
        }
    }
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        Trie trie =new Trie();
        for(int i=0;i<r;i++){
            trie.add(a[i],0,c);
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        trie.display(list);


        return list;
    }

    public static void main(String[] args) {
        int M[][] = {{1 ,1 ,1 ,1 ,0 ,0 ,1},{ 1 ,0, 1, 0, 1 ,1 ,0},{ 0 ,0 ,0 ,0 ,1 ,0 ,1},{ 1 ,0 ,0 ,0, 1, 1 ,1}};
        System.out.println(uniqueRow(M,4,7));
    }
}
