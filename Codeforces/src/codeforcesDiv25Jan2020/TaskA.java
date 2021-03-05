package codeforcesDiv25Jan2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            double x = in.nextDouble();
            long first = 0, second = 0;
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                first += v;
                second += Math.ceil(v / x);
            }
            first = (long) Math.ceil(first / x);
            out.println(first + " " + second);

        }
    }
}
