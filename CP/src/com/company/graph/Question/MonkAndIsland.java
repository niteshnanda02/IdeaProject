package com.company.graph.Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MonkAndIsland {
    static int n;
    static int[] vis,dis;
    static ArrayList<ArrayList<Integer>> adj;
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            n=s.nextInt();
            vis=new int[n+1];
            dis=new int[n+1];
            adj=new ArrayList<>(n+1);
            for(int i=0;i<n+1;i++)
                adj.add(new ArrayList<>());

            int m=s.nextInt();
            while(m-->0){
                int a=s.nextInt(),b=s.nextInt();
                adj.get(a).add(b);
                adj.get(b).add(a);
            }
            System.out.println(adj);
            bfs(1);
            System.out.println(dis[n]);
        }

    }
    private static void bfs(int curr){
        vis[curr]=1;
        dis[curr]=0;
        Queue<Integer> queue=new LinkedList<>();

        queue.add(curr);

        while(!queue.isEmpty()){
            int rv=queue.remove();
            for(int child:adj.get(rv)){
                if(vis[child]==0){
                    queue.add(child);
                    vis[child]=1;
                    dis[child]=dis[rv]+1;
                }
            }
        }
    }
}