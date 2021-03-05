package com.company.graph.Question;
import java.util.*;
public class SocialNetWorkingGraph {
    static ArrayList<ArrayList<Integer>> adj;
    static int[] vis,dis,level;

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner

        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),e=s.nextInt();
        adj=new ArrayList<>(n+1);
        vis=new int[n+1];
        dis=new int[n+1];
        level=new int[n+1];
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<e;i++){
            int u=s.nextInt(),v=s.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int m=s.nextInt();
        for(int j=0;j<m;j++){
            int u=s.nextInt(),d=s.nextInt();
            for(int i=0;i<n+1;i++){
                level[i]=0;
                vis[i]=0;
            }
            bfs(u);
            System.out.println(level[d]);
        }

    }
    private static void bfs(int n){
        Queue<Integer> queue=new LinkedList<>();
        vis[n]=1;
        queue.add(n);
        dis[n]=0;
        while(!queue.isEmpty()){
            int rv=queue.remove();
            for(int child:adj.get(rv)){
                if(vis[child]==0){
                    queue.add(child);
                    vis[child]=1;
                    dis[child]=dis[rv]+1;
                    level[dis[child]]++;
                }
            }
        }
    }
}
