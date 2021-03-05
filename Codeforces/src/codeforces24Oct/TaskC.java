package codeforces24Oct;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.math.BigInteger;
import java.util.Arrays;

public class TaskC {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),x=in.nextInt(),pos=in.nextInt();
        int ans=fact(n-1);
        out.println(ans);
    }

    private int fact(int n) {
        if(n<=1)
            return n;
        return (int) (((n%(Math.pow(10,9)+7))*fact((int) ((n-1)%(Math.pow(10,9)+7))))%(Math.pow(10,9)+7));
    }
}
