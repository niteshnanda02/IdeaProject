package codeforces6Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            for (int i = n-1; i >=0 ; i--) {
                out.print(a[i]+" ");
            }
            out.println();
        }
    }
}
