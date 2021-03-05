package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Vector;

public class TPrimes {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.nextLong();
        for (long i = 0; i < n; i++) {
            long orig = in.nextLong();
            long v = (long) Math.sqrt(orig);
            if (v == 1) {
                out.println("NO");
                continue;
            }
            if (v * v == orig) {
                if (isprime(v)) out.println("YES");
                else
                    out.println("NO");
            } else
                out.println("NO");
        }
    }

    private boolean isprime(long n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
