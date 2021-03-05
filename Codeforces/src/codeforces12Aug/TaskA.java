package codeforces12Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long[] a = new long[4];
            a = in.nextLongArray(4);
            int o = 0;
            boolean c = true;
            for (int i = 0; i < 4; i++) {
                if (a[i] % 2 != 0)
                    o++;
                if (a[i] == 0 && i != 3) {
                    c = false;
                }
            }
            if (o == 0 || o == 1 || o == 4)
                out.println("YES");
            else if (o == 3) {
                if (c) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            } else {
                out.println("NO");
            }
        }
    }
}
