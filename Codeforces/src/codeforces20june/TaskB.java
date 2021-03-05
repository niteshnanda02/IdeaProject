package codeforces20june;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            long[] a = new long[2 * n];
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            for (int i = 0; i < 2 * n; i++) {
                a[i] = in.nextLong();
                if (a[i] % 2 == 0)
                    even.add(i + 1);
                else
                    odd.add(i + 1);
            }
            int c = n - 1;
            for (int i = 0; i < even.size() - 1; i += 2) {
                if (c != 0) {
                    out.println(even.get(i) + " " + even.get(i + 1));
                    c--;
                } else
                    break;
            }

            for (int i = 0; i < odd.size() - 1; i += 2) {
                if (c != 0) {
                    out.println(odd.get(i) + " " + odd.get(i + 1));
                    c--;
                } else
                    break;
            }
        }
    }
}
