package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kuriyama {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        long[] a=new long[n];
        for (int i = 0; i <n ; i++) {
            a[i]=in.nextLong();
        }
        ArrayList<Long> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(a[i]);
        }
        Collections.sort(list);
        long[] prefix_a=new long[n+1];
        for (int i = 0; i <n ; i++) {
            prefix_a[i+1]=prefix_a[i]+a[i];
        }

        long[] prefix_sort=new long[n+1];
        for (int i = 0; i <n ; i++) {
            prefix_sort[i+1]=prefix_sort[i]+list.get(i);
        }
        int m=in.nextInt();
        for (int i = 0; i <m ; i++) {
            int type=in.nextInt();
            int l=in.nextInt(),r=in.nextInt();
            l--;
            if (type==1){
                if (l==0){
                    out.println(prefix_a[r]);
                }else {
                    out.println(prefix_a[r]-prefix_a[l]);
                }
            }else {

                if (l==0){
                    out.println(prefix_sort[r]);
                }else {
                    out.println(prefix_sort[r]-prefix_sort[l]);
                }
            }
        }
    }
}
