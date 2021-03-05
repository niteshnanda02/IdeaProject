package com.company.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TopologicalSort {
    static ArrayList<ArrayList<Integer>> adj;
    static int[] in;
    static ArrayList<Integer> res=new ArrayList<>();
    public static void main(String[] args) {
        PrintWriter out=new PrintWriter(System.out,true);
        FastReader fr = new FastReader();
        res.clear();
        int n=fr.nextInt();
        adj=new ArrayList<>(n+1);
        for (int i = 0; i <n+1 ; i++) {
            adj.add(new ArrayList<>());
        }
        in=new int[n+1];
        int m=fr.nextInt();
        while (m-->0){
            int x=fr.nextInt(),y=fr.nextInt();
            adj.get(x).add(y);
            in[y]++;
        }
        if(!khan(n)){
            out.println("Sandro fails.");
        }else {
            for (int node:res
                 ) {
               out.print(node+" ");
            }
            out.println();
        }
    }

    private static boolean khan(int n) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for (int i = 1; i <=n ; i++) {
            if(in[i]==0)
                queue.add(i);
        }

        while (!queue.isEmpty()){
            int rv=queue.poll();
            res.add(rv);
            for (int child:adj.get(rv)
                 ) {
                in[child]--;
                if(in[child]==0)
                    queue.add(child);
            }
        }
        int[] a=new int[1];
        return res.size()==n;
    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}