package com.company.Array.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Vector;

public class EhabAndPrefic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[] vis=new int[1000007];
        int[] a=new int[1000007];
        int[] b=new int[1000007];
        int n=Integer.parseInt(reader.readLine());
        String l=reader.readLine();
        String[] arr=l.split(" ");
        boolean flag=false;

        for (int i = 1; i <=n ; i++) {
            a[i]=Integer.parseInt(arr[i-1]);
            if(a[i]>i)
                flag=true;
            vis[a[i]]=1;
        }
        if (flag){
            System.out.println(-1);
        }
        Arrays.fill(b,-1);
        for (int i = 2; i <=n ; i++) {
            if(a[i]!=a[i-1]){
                b[i]=a[i-1];
                vis[a[i-1]]=1;
            }
        }

        Vector<Integer> notVisited=new Vector<>();
        for (int i = 0; i <=1000006 ; i++) {
            if (vis[i]==0)
                notVisited.add(i);
        }

        int j=0;
        for (int i = 1; i <=n ; i++) {
            if (b[i]==-1)
                b[i]=notVisited.get(j++);
        }

        for (int i = 1; i <=n ; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
