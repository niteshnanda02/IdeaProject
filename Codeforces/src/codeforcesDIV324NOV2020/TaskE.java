package codeforcesDIV324NOV2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskE {
    static ArrayList<ArrayList<Integer>> adj;
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            adj=new ArrayList<>(n+1);
            for (int i = 0; i <n+1 ; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i <n ; i++) {
                int a=in.nextInt(),b=in.nextInt();
                adj.get(a).add(b);
                adj.get(b).add(a);
            }
            Map<Integer,Integer> map=new HashMap<>();
            int c=0;
            for (int i = 1; i <=n ; i++) {
                ArrayList<Integer> list=adj.get(i);
                c+=factorial(list.size());
                map.put(i,list.size());
            }
            Set<Map.Entry<Integer,Integer>> entries=map.entrySet();
            for (Map.Entry<Integer,Integer> e:entries
                 ) {
                if(e.getValue()>1)
                    c++;
            }
            out.println(c);
         }
    }
    int factorial(int n){
        if(n==0||n==1)
            return n;
        return n*factorial(n-1);
    }
}
