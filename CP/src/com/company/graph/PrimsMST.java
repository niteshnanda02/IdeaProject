package com.company.graph;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
graph
8
14
0 1 4
0 7 8
1 7 11
7 8 7
8 6 6
7 6 1
1 2 8
2 8 2
2 3 7
2 5 4
6 5 2
3 5 14
3 4 9
5 4 10

 */
public class PrimsMST {
    private static class node{
        int node,cost;

        public node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "node{" +
                    "node=" + node +
                    ", cost=" + cost +
                    '}';
        }
    }
    static int[] val,parent;
    static boolean[] mst;
    static ArrayList<ArrayList<node>> adj;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        val =new int[n+1];
        Arrays.fill(val,Integer.MAX_VALUE);
        val[0]=0;
        parent=new int[n+1];
        parent[0]=-1;
        mst=new boolean[n+1];
        adj=new ArrayList<>(n+1);
        for (int i = 0; i <n+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        while (m-->0){
            int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
            adj.get(a).add(new node(b,c));
            adj.get(b).add(new node(a,c));
        }

        prims(n);
        printPrims(n);
    }

    private static void printPrims(int n) {
        int c=0;
        for (int i = 1; i <n+1 ; i++) {

            System.out.println(parent[i]+"--"+val[i]+"--"+i);
            c+=val[i];
        }
        System.out.println(c);
    }

    private static void prims(int V) {

        for (int i = 0; i <V-1 ; i++) {
            //select the minimum node
            int u=minNode(V);
            mst[u]=true;
            //Iterate all its children
            for (node child:adj.get(u)
                 ) {
                int distance=child.cost;
                if(!mst[child.node]&&distance<val[child.node]){
                    val[child.node]=distance;
                    parent[child.node]=u;
                }
            }

        }
    }

    private static int minNode(int v) {
        int minNode=Integer.MAX_VALUE;
        int vertex=0;
        for (int i = 0; i <v ; i++) {
            if (!mst[i]&&val[i]<minNode) {
                minNode=val[i];
                vertex=i;
            }
        }
        return vertex;
    }
}
