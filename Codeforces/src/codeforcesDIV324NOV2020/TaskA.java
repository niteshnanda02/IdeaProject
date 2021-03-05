package codeforcesDIV324NOV2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            for (int i = 2; i <=n ; i++) {
                out.print(i+" ");
            }
            out.println(1);
        }
    }
}
