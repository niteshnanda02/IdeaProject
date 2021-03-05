package codeforces19sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long x = in.nextLong();
            int i = 0;
            int ans = 0;
            while (x >= 0) {
                long num = (long) (Math.pow(2, i+1)) - 1;
                long step=(num*(num+1))/2;
                x-=step;
                ans++;
                i++;
            }
            out.println((ans-1));
        }
    }
}
