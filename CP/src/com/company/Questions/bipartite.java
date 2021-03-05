package com.company.Questions;

import java.util.Scanner;

public class bipartite {
    static int[] color;
    static int[] visited;
    static boolean isBipartite(int G[][],int V)
    {
        //add code here.
        color=new int[V+1];
        visited=new int[V+1];
        boolean temp=false;
        for (int i = 0; i <V ; i++) {
            if(visited[i]==0){
                temp=bipartite(G,i,0,V);
                if(temp)
                    break;
            }
        }

        return temp;
    }

    static boolean bipartite(int G[][],int par,int col,int V){
        visited[par]=1;
        color[par]=col;

        for(int child=0;child<V;child++){
            if(G[par][child]==1){
                if(visited[child]==0){
                    if(!bipartite(G,child,color[par] ^1,V))
                        return false;

                }else if(color[par]==color[child])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int[][] a=new int[n][n];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println(isBipartite(a,n));
        }
    }
}
