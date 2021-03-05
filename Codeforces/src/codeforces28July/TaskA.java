package codeforces28July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int x = in.nextInt(), y = in.nextInt(), n = in.nextInt();
            int a = (n / x) * x;
            if(a + y <= n) {
                out.println(a + y);
            } else {
                out.println(a + y - x);
            }
        }
    }

}
