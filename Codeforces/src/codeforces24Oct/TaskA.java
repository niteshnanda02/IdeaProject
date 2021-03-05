package codeforces24Oct;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long m=in.nextLong();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextInt();
            }
            long sum= Arrays.stream(a).sum();
            if(sum==m)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
