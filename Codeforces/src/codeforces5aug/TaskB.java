package codeforces5aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.Collections;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long mina=Integer.MAX_VALUE,minb=Integer.MAX_VALUE;
            long[] a=new long[n] ;
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextLong();
                if(a[i]<mina){
                    mina=a[i];
                }
            }
            long[] b=new long[n] ;
            for (int i = 0; i <n ; i++) {
                b[i]=in.nextLong();
                if(b[i]<minb){
                    minb=b[i];
                }
            }
            long[] c=new long[n];
            for (int i = 0; i <n ; i++) {
                long r1=a[i]-mina;
                long r2=b[i]-minb;
                long r=Math.max(r1,r2);
                c[i]=r;
            }
            long ans=0;
            for (int i = 0; i <n ; i++) {
                ans+=c[i];
            }
            out.println(ans);
        }
    }
}
