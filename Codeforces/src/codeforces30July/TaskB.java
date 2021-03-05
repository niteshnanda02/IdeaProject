package codeforces30July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int c=0;
            int k= (int) (n-Math.ceil((float)(n)/4));
            for (int i = 0; i <k ; i++) {
                c++;
                out.print("9");
            }
            for (int i = c; i <n ; i++) {
                out.print("8");
            }
            out.println();
        }
    }
}
