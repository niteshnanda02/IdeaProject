package com.company.graph;

import java.awt.List;
import java.util.*;

public class Graphrep {
    static int[] visited;
    //ssp
    static int[] distanceArray;
    //color
    static int[] color;
    //storing the subtree size;
    static int[] subSize;
    //store the lowestAcestor
    static int[] lowestAncestor;
    //store the intime of the node
    static int[] intime;
    //timer for intime of the node;
    static int timer=0;
    static ArrayList<ArrayList<Integer>> adj;
    static int n;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int m = s.nextInt();
        //n: no. of nodes, m: no. of edges
        visited = new int[n + 1];
        distanceArray = new int[n + 1];
        lowestAncestor=new int[n+1];
        intime=new int[n+1];
        color=new int[n+1];
        subSize=new int[n+1];
        adj = new ArrayList<>(n + 1);
        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<>());
        }
        while (m-- > 0) {
            int a = s.nextInt(), b = s.nextInt();
            addEdge(adj, a, b);
        }
//        sspUsingDfs(1,0);
//        System.out.println(Arrays.toString(distanceArray));
//        System.out.println(adj);
//        System.out.println(bipartite(1,0));
//        boolean temp=false;
//        for(int i=0;i<n;i++){
//            if(visited[i]==0){
//                temp=containCycle(i,-1);
//                if(temp)
//                    break;
//            }
//        }
//        System.out.println(temp);
        System.out.println(containCycle(0,-1));
//        System.out.println(subTreeSize(1));
//        bfs(3);
//        findBridge(1,-1);
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int a, int b) {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    private static void dfs(int v) {
        visited[v] = 1;
//        System.out.print(v+" ");
        for (int i = 0; i < adj.get(v).size(); i++) {
            int child = adj.get(v).get(i);
            if (visited[child] == 0) {
                dfs(child);
            }
        }
    }

    private static int connectedComponent() {
        int currCount = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                dfs(i);
                currCount++;
            }
        }
        return currCount;
    }

    //single shortest path using depth first search
    private static void sspUsingDfs(int v, int d) {
        visited[v] = 1;
        distanceArray[v] = d;
        for (int child : adj.get(v)
        ) {
            if (visited[child] == 0)
                sspUsingDfs(child, distanceArray[v] + 1);
        }
    }

    private static boolean bipartite(int v,int c){
        visited[v]=1;
        color[v]=c;

        for (int child:adj.get(v)
             ) {
            if (visited[child]==0){
                if (!bipartite(child,color[v]^1))
                    return false;
            }else {
                if (color[v]==color[child])
                    return false;
            }
        }
        return true;

    }

    static boolean  containCycle(int node,int par){
        visited[node]=1;
        for (int child:adj.get(node)
             ) {
            if (visited[child]==0){
                if (containCycle(child,node))
                    return true;
            }
            else if(child!=par)
                return true;
        }
        return false;
    }

    private static int subTreeSize(int node){

        visited[node]=1;
        int currSize=1;

        for (int child:adj.get(node)
             ) {
            if (visited[child]==0){
                currSize+=subTreeSize(child);
            }
        }
        subSize[node]=currSize;

        return currSize;
    }

    private static void bfs(int v){
        visited[v]=1;
        LinkedList<Integer> queue=new LinkedList<>();
        queue.addLast(v);

        while (!queue.isEmpty()){
            int rv=queue.removeFirst();
            System.out.print(rv+" ");
            for (int child:adj.get(rv)
                 ) {
                if (visited[child]==0){
                    visited[child]=1;
                    queue.addLast(child);
                }
            }
        }

    }


    private static void findBridge(int node, int par) {
        visited[node]=1;
        lowestAncestor[node]=intime[node]=timer;
        timer++;
        for (int child:adj.get(node)
             ) {
            //if the child is the parent
            if(child==par)
                continue;
            //if the node is already visited then will check the lowAncestor of the node
            else if(visited[child]==1){
                //edge node - child is a back edge(means other path or a cycle)
                lowestAncestor[node]=Math.min(lowestAncestor[node],intime[child] );
            }else {
                //edge node - child is a forward edge
                findBridge(child,node);

                if(lowestAncestor[child]>intime[node]){
                    System.out.println(node+" - "+child+" this is a bridge");
                }

                lowestAncestor[node]=Math.min(lowestAncestor[child],lowestAncestor[node] );
            }
        }
    }

}
