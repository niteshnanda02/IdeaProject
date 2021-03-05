package com.company.graph;

import java.util.*;

public class KruskalMST {
    private static class Node implements Comparable<Node>{
        int src,des,wt;

        public Node(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
        @Override
        public int compareTo(Node node){
            return this.wt-node.wt;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "src=" + src +
                    ", des=" + des +
                    ", wt=" + wt +
                    '}';
        }
    }
    private static List<Node> edgeList;
    private static List<Node> mst;
    static int[] par,rank;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        edgeList=new ArrayList<>();
        mst=new ArrayList<>();
        par=new int[n];
        rank=new int[n];
        Arrays.fill(par,-1);
        Arrays.fill(rank,0);
        int m=s.nextInt();
        int temp=m;
        while (temp-->0){
            int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
            Node node=new Node(a,b,c);
            edgeList.add(node);
        }
        kruskal(n,m);
        printMST();
    }

    private static void printMST() {
        for (int i = 0; i <mst.size() ; i++) {
            System.out.println(mst.get(i));
        }
    }

    private static void kruskal(int V, int E) {

        //sort all edges on the basis of wt in increasing order
        Collections.sort(edgeList);

        int i=0,j=0;
        //for mst we only need V-1 edges
        while (i<V-1&&j<E){
            int from=find(edgeList.get(j).src);
            int to=find(edgeList.get(j).des);
            //that means there absolute parent is same and
            //they are forming cycle so we don't add this edge
            if(from==to){
                j++;
                continue;
            }
            union(from,to);
            mst.add(edgeList.get(j));
            i++;
        }

    }
    //union by rank
    //if there is difference in rank then max rank is MAX(rankA,rankB) ,else rank is inc by 1

    private static void union(int from, int to) {

        if(rank[from]<rank[to]){
            par[from]=to;
        }else if(rank[from]>rank[to]){
            par[to]=from;
        }else {
            par[from]=to;
            rank[to]+=1;
        }
    }

    //path by compression
    private static int find(int src) {
        if(par[src]==-1)
            return src;
        return par[src]=find(par[src]);
    }
}
