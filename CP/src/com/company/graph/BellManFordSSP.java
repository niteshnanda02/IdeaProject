package com.company.graph;

import java.util.*;

public class BellManFordSSP {
    private static class Node{
        int src,dst,wt;

        public Node(int src, int dst, int wt) {
            this.src = src;
            this.dst = dst;
            this.wt = wt;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "src=" + src +
                    ", dst=" + dst +
                    ", wt=" + wt +
                    '}';
        }
    }
    private static List<Node> edgeList;
    private static int[] parent,values;


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        edgeList=new ArrayList<>();
        parent=new int[n];
        parent[0]=-1;
        values=new int[n];
        Arrays.fill(values,Integer.MAX_VALUE);
        values[0]=0;

        int t=m;
        while (t-->0){
            int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
            edgeList.add(new Node(a,b,c));
        }
        System.out.println(edgeList);
        bellmanFord(n,m);

    }

    private static void bellmanFord(int V, int E) {
        //Include v-1 edges to cover all vertices
        boolean updated = false;
        for (int i = 0; i < V-1; i++) {
            updated=false;
            for (int j = 0; j <E ; j++) {
                int u=edgeList.get(j).src;
                int v=edgeList.get(j).dst;
                int wt=edgeList.get(j).wt;
                if(values[u]!=Integer.MAX_VALUE&&values[u]+wt<values[v]){
                    values[v]=values[u]+wt;
                    parent[v]=u;
                    updated=true;
                }
            }
            if(updated==false)
                break;
        }

        //Now check by relaxing one more if we have a negative edge cycle
        for (int i = 0; i <E&&updated==true ; i++) {
            int u=edgeList.get(i).src;
            int v=edgeList.get(i).src;
            int wt=edgeList.get(i).wt;
            if(values[u]!=Integer.MAX_VALUE&&values[u]+wt<values[v]){
                System.out.println("Graph has negative wt cycle");
                return;
            }
        }
        //print shortest path graph
        for (int i = 1; i <V ; i++) {
            System.out.println("U->V: "+parent[i]+" -> "+i+" Cost to reach "+parent[i]+" from source 0 "+values[i]);
        }
    }
}
