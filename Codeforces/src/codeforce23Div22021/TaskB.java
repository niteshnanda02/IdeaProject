package codeforce23Div22021;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
            for (int i = 0; i <n ; i++) {
                map.put(a[i],i);
            }
            int last=n-1;
            Set<Map.Entry<Integer,Integer>> entries=map.entrySet();
            for (Map.Entry<Integer,Integer> entry:entries
                 ) {
                int val=entry.getValue();
                if(val<=last){
                    for (int i = val; i <=last ; i++) {
                        out.print(a[i]+" ");
                    }
                    last=val-1;
                }
            }
            out.println();
        }
    }

    private int max(int[] a, int i) {
        int max=i,val=a[i];
        i--;
        while (i>=0){
            if(a[i]>=val){
                max=i;
                val=a[i];
            }
            i--;
        }
        return max;
    }
}
