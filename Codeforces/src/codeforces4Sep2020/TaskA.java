package codeforces4Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long a=in.nextLong(),b=in.nextLong();
            long diff=Math.abs(a-b);
            long ans=diff/10;
            if (diff%10>0){
                ans++;
            }
            out.println(ans);
        }
    }
}
