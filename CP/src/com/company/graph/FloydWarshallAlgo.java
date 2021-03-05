package com.company.graph;

import java.util.Arrays;
import java.util.Scanner;

public class FloydWarshallAlgo {
    static int[][] graph;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        graph=new int[n][m];
        for (int[] a:graph
             ) {
            Arrays.fill(a,Integer.MAX_VALUE);
        }
        int t=m;
        while (t-->0){
            int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
            graph[a][b]=c;
        }
        for (int i = 0; i <n ; i++) {
            graph[i][i]=0;
        }
        floydWarshall(n);
    }

    private static void floydWarshall(int V) {
        //traverse v times for all vertices
        for (int i = 0; i <V ; i++) {
            for (int j = 0; j <V ; j++) {
                for (int k = 0; k <V ; k++) {
                    if (graph[j][i]==Integer.MAX_VALUE||graph[i][k]==Integer.MAX_VALUE)
                        continue;
                    if(graph[j][i]+graph[i][k]<graph[j][k]){
                        graph[j][k]=graph[j][i]+graph[i][k];
                    }
                }
            }
        }
        
        //check if there is any negative wt cycle;
        for (int i = 0; i <V ; i++) {
            if(graph[i][i]<0){
                System.out.println("Graph containing negative wt cycle");
                return;
            }
        }

        for (int i = 1; i <V ; i++) {
            for (int j = 0; j <V ; j++) {
                System.out.println(i+" to "+j+" distance is "+graph[i][j]);
            }
            System.out.println("===========================");
        }
    }
}
