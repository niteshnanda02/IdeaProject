package com.company.BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class PathMoreThanKLength {
    static class Node{
        int n,c;

        public Node(int n, int c) {
            this.n = n;
            this.c = c;
        }
    }
    public static ArrayList<ArrayList<Node>> adj;
    public static int[] vis;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        adj=new ArrayList<>(n+1);
        for (int i = 0; i <n+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        vis=new int[n+1];
        int m=s.nextInt();
        while (m-->0){
            int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
            adj.get(a).add(new Node(b,c));
            adj.get(b).add(new Node(a,c));
        }
        int src=s.nextInt(),k=s.nextInt();
        boolean temp=solve(src,k,0);
        System.out.println(temp);
    }

    private static boolean solve(int src, int k, int cnt) {
        if(cnt>k)
            return true;
        vis[src]=1;
        for (Node child:adj.get(src)
             ) {
            if(vis[child.n]==0){
                if(solve(child.n,k,cnt+child.c))
                    return true;
            }
        }
        vis[src]=0;
        return false;
    }
}
