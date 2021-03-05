package codeforces11Oct2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),k=in.nextInt();
            long[] a=in.nextSortedLongArray(n);
            int i=n-2,max=n-1;

            while (k>0){
                a[max]+=a[i];
                a[i]=0;
                i--;
                k--;
            }
            out.println(a[max]);
        }
    }
}
