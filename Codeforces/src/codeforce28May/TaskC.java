package codeforce28May;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long h=in.nextLong(),c=in.nextLong(),t=in.nextLong();
            long diff=c+h;
            long temp=(h+t+diff)/(2*t-diff);
            out.println(2*temp+1);

        }
    }
}
