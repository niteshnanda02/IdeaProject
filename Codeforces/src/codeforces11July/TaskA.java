package codeforces11July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            for (int i = 0; i <n ; i++) {
                out.print("1 ");
            }
            out.println();
        }
    }
}
