package codeforces21Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long n = in.nextLong(), k = in.nextLong();
            if (k == 0) {
                if (n % 2 == 0)
                    out.println("0");
                else
                    out.println("1");
            } else if (n <= k) {
                out.println((k - n));
            } else {
                if (n % 2 == 0 && k % 2 == 0 || n % 2 != 0 && k % 2 != 0)
                    out.println("0");
                else
                    out.println("1");
            }
        }
    }
}
