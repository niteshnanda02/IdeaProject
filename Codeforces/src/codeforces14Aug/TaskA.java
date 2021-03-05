package codeforces14Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long[] a=in.nextLongArray(n);
            long sum=a[0]+a[1];
            if(sum<=a[n-1]){
                out.println("1 2 "+n);
            }else {
                out.println(-1);
            }
        }
    }
}
