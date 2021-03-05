package codeforces6Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long min=Integer.MAX_VALUE;
            long sum=0;
            for (int i = 0; i <n ; i++) {
                long v=in.nextInt();
                sum+=v;
                min=Math.min(min,sum);
            }
            out.println(Math.abs(min));
        }
    }
}
