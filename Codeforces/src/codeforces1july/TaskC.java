package codeforces1july;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long a=in.nextLong(),b=in.nextLong(),n=in.nextLong(),m=in.nextLong();

            if ((a+b)<(n+m)||Math.min(a,b)<m){
                out.println("No");
            }else
                out.println("Yes");
        }
    }
}
