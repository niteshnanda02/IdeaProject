package com.company.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuiltyKitchen {
    public static void main(String[] args) throws IOException {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        String l=r.readLine();
        String[] a=l.split(" ");
        int n=Integer.parseInt(a[0]);
        int v=Integer.parseInt(a[1]);
        l=r.readLine();
        a=l.split(" ");
        float[] A=new float[n];
        for (int i = 0; i <n ; i++) {
            A[i]=Float.parseFloat(a[i]);
        }
        l=r.readLine();
        a=l.split(" ");
        float[] B=new float[n];
        for (int i = 0; i <n ; i++) {
            B[i]=Float.parseFloat(a[i]);
        }
        float min=Float.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            min=Math.min(B[i]/A[i],min);
        }
        float ans=0;
        for (int i = 0; i <n ; i++) {
            ans+=A[i]*min;
        }
        ans=Math.min(ans,v);
        System.out.println(ans);
    }
}
