package codeforcesDIV324NOV2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=new int[n+1];
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 1; i <=n ; i++) {
                int v=in.nextInt();
                map.put(v,i);
                a[v]++;
            }
            int ans=-1;
            for (int i = 1; i <=n ; i++) {
                if(a[i]==1){
                    ans=map.get(i);
                    break;
                }
            }
            out.println(ans);
        }
    }
}
