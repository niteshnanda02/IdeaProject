package codeforce23Div22021;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long p = in.nextLong(), a = in.nextLong(), b = in.nextLong(), c = in.nextLong();
            long min = Integer.MAX_VALUE;
            if (p % a == 0 || p % b == 0 || p % c == 0)
                out.println(0);
            else {
                long d1 = a - p % a;
                long d2 = b - p % b;
                long d3 = c - p % c;
                min = Math.min(d1, Math.min(d2, d3));
                out.println(min);
            }
        }
    }
}
