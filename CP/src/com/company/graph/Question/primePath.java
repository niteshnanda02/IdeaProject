package com.company.graph.Question;

import java.util.*;

public class primePath {
    static ArrayList<ArrayList<Integer>> adj;
    static int[] visited=new int[10002];
    static int[] distance=new int[10002];
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();

        adj=new ArrayList<>(10002);
        for (int i = 0; i <10002 ; i++) {
            adj.add(new ArrayList<>());
        }
        createGraph();
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int a=s.nextInt(),b=s.nextInt();
            for (int i = 1000; i <=9999 ; i++) {
                visited[i]=0;
                distance[i]=-1;

            }

            bfs(a);
            if (distance[b]==-1)
                System.out.println("Impossible");
            else
                System.out.println(distance[b]);
        }
    }

    private static void bfs(int src) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(src);
        visited[src]=1;
        distance[src]=0;
        while (!queue.isEmpty()){
            int rv=queue.remove();
            for (int child:adj.get(rv)
            ) {
                if(visited[child]==0){
                    queue.add(child);
                    visited[child]=1;
                    distance[child]=distance[rv]+1;
                }
            }
        }

    }

    private static void createGraph() {
        ArrayList<Integer> primesList=new ArrayList<>();
        for (int i = 1000; i <=9999 ; i++) {
            if (isPrime(i))
                primesList.add(i);
        }

        for (int i = 0; i <primesList.size() ; i++) {
            for (int j = i+1; j <primesList.size() ; j++) {
                int a=primesList.get(i);
                int b=primesList.get(j);
                if(isValid(a,b)){
                    adj.get(a).add(b);
                    adj.get(b).add(a);
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    private static boolean isValid(int a, int b) {
        int cnt=0;
        while (a>0){
            if(a%10!=b%10) cnt++;
            a/=10;
            b/=10;
        }
        if (cnt==1)
            return true;
        else
            return false;
    }


}
