package codeforces29July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long l=in.nextLong(),r=in.nextLong();
            if(l*2<=r&&l<r){
                out.println(l+" "+(l*2));
            }else {
                out.println(-1+" "+-1);
            }
        }
    }
}
