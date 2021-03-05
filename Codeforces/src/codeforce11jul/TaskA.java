package codeforce11jul;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            if (a == 0 || b == 0)
                out.println(0);
            else {
                long x, y;
                if (a > b) {
                    x = b;
                    y = b;
                } else {
                    x = a;
                    y = a;
                }
                long rem1 = x % 3;
                long res1 = x / 3;
                long rem2 = y % 3;
                long res2 = y / 3;
                long res = res1 + res2;
                if (a > b) {
                    x = a - b + rem1;
                    y = rem2;
                    if (y == 1 && x > 1) {
                        res++;
                    } else if (y == 2 && x > 3) {
                        res+=2;
                    } else if (y == 2 && x > 1) {
                        res++;
                    }
                } else {
                    x = rem1;
                    y = b - a + rem2;

                    if (x == 1 && y > 1) {
                        res++;
                    } else if (x == 2 && y > 3) {
                        res+=2;
                    } else if (x == 2 && y > 1) {
                        res++;
                    }
                }


                out.println(res);

            }
        }
    }
}
