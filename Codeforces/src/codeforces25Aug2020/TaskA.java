package codeforces25Aug2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            String s = in.nextString();
            if (s.charAt(n - 1) == '0')
                for (int i = 0; i < n; i++) {
                    out.print("0");
                }
            else
                for (int i = 0; i < n; i++) {
                    out.print("1");
                }
            out.println();
        }
    }
}
