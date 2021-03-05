package codeforces1july;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong();
            n--;
            n=n/2;
            out.println(n+1);
        }
    }
}
