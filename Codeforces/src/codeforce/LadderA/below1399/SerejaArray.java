package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class SerejaArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),m=in.nextInt();
        long[] a=new long[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=in.nextLong();
        }
        long store=0;
        for (int i = 0; i <m ; i++) {
            int t=in.nextInt();
            if (t==1){
                int v=in.nextInt();
                long x=in.nextLong();
                a[v]=x-store;
            }else if(t==2){
                long inc=in.nextLong();
                store+=inc;
            }else {
                int q=in.nextInt();
                out.println(a[q]+store);
            }

        }
    }
}
