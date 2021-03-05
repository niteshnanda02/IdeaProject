package com.company.Questions;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

    static int n,count;
    static int[] vis;
    static ArrayList<ArrayList<Integer>> adj;
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            n=s.nextInt();
            int m=s.nextInt();
            adj=new ArrayList<>(n+1);
            vis=new int[n+1];
            for(int i=0;i<n+1;i++)
                adj.add(new ArrayList<>());

            while(m-->0){
                int a=s.nextInt(),b=s.nextInt();
                adj.get(a).add(b);
                adj.get(b).add(a);
            }
            System.out.println(adj);
            cc();
        }
    }
    private static void cc(){
        int c=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            count=1;
            if(vis[i]==0){
                dfs(i);
                list.add(count);
                c++;
            }

        }
        long ans=1;
        for(int i=0;i<list.size();i++){
            ans=(long)((ans*list.get(i))%(Math.pow(10,9)+7));
        }
        System.out.println(c+" "+ans);
    }
    private static void dfs(int v){
        vis[v]=1;
        for(int c:adj.get(v)){
            if(vis[c]==0){
                count++;
                dfs(c);

            }
        }
    }
}
