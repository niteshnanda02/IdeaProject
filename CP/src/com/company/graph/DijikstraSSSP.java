package com.company.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DijikstraSSSP {
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
    static boolean[] processed;
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
        processed =new boolean[n+1];
        adj=new ArrayList<>(n+1);
        for (int i = 0; i <n+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        while (m-->0){
            int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
            adj.get(a).add(new node(b,c));
            adj.get(b).add(new node(a,c));
        }

        Dijikstra(n);
        printDijikstra(n);
    }

    private static void printDijikstra(int n) {
        for (int i = 1; i <n ; i++) {
            System.out.println(parent[i]+"--"+val[i]+"--"+i);
        }
    }

    private static void Dijikstra(int V) {

        for (int i = 0; i <V-1 ; i++) {
            //select the minimum node
            int u=minNode(V);
            processed[u]=true;
            //Iterate all its children
            for (node child:adj.get(u)
            ) {
                int distance=child.cost+val[u];
                if(!processed[child.node]&&distance<val[child.node]){
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
            if (!processed[i]&&val[i]<minNode) {
                minNode=val[i];
                vertex=i;
            }
        }
        return vertex;
    }

}
