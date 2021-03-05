package codeforces30NOV2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt() ;
        while (testNumber-->0){
            int X=in.nextInt()-1,Y=in.nextInt();
            out.println(X+" "+Y);
        }
    }
}
