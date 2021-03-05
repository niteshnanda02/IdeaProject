package codeforces17July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            int ind=n-1;
            while (ind>0&&a[ind]<=a[ind-1]){
                ind--;
            }
            while (ind>0&&a[ind]>=a[ind-1]){
                ind--;
            }
            out.println(ind);
        }
    }
}
