package codeforces1july;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong(),k=in.nextLong();
            long ans=0;
            if (n>k){
                ans=((k*(k+1))/2);
            }
            else {
                k=n-1;
                ans=((k*(k+1))/2);
                ans++;
            }
            out.println(ans);
        }
    }
}
