package codeforces29Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.Map;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();

        while (testNumber-->0){
            int n=in.nextInt(),k=in.nextInt();
            int[] a=new int[n];
            int max=Integer.MAX_VALUE;
            boolean[] arr=new boolean[102];
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextInt();
                arr[a[i]]=true;
            }
            for (int maxColor = 1; maxColor <101 ; maxColor++) {

                if(arr[maxColor]){
                    int curr=0;
                    for (int i = 0; i <n ;) {
                        if(a[i]!=maxColor){
                            i+=k;
                            curr++;
                        }else
                            i++;
                    }
                    max=Math.min(max,curr);
                }
            }
            out.println(max);
        }
    }
}
