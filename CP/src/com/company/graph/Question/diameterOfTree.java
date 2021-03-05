package com.company.graph.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class diameterOfTree {
    static ArrayList<ArrayList<Integer>> adj;
    static int[] visited;
    static int n;
    static int maxD,maxNode;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        adj=new ArrayList<>(n+1);
        for (int i = 0; i <n+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        visited =new int[n+1];
        int m=n-1;
        while (m-->0){
            int a=s.nextInt(),b=s.nextInt();
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        maxD=-1;
        dfs(1,0);
        maxD=-1;
        Arrays.fill(visited,0);
        dfs(maxNode,0);
        System.out.println(maxD);
    }

    private static void dfs(int node, int d) {

        visited[node]=1;

        if (maxD<d){
            maxD=d;
            maxNode=node;
        }

        for (int child:adj.get(node)
             ) {
            if (visited[child]==0){
                dfs(child,d+1);
            }
        }

    }
}
