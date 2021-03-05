package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class Xenia {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] count = new int[7];
        boolean temp = true;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            if (v < 7)
                count[v]++;
            if (v == 5 || v == 7) {
                temp = false;
            }
        }
        if (!temp)
            out.println(-1);
        else {
            int one = count[1];
            if (one != n / 3) {
                out.println(-1);
            } else {
                int six = count[6];
                boolean flag = true;
                if (count[3] > 0) {
                    if (count[3] > six ) {
                        out.println(-1);
                        flag = false;
                    } else if (count[3] == six && count[2] == 0 && count[4] == 0) {
                        for (int i = 0; i < six; i++) {
                            out.println("1 3 6");
                        }
                        flag = false;
                    } else {
                        six -= count[3];
                    }
                }
                if (flag) {
                    if (count[2] != count[4] + six)
                        out.println(-1);
                    else {
                        for (int i = 0; i < count[4]; i++) {
                            out.println("1 2 4");
                        }

                        for (int i = 0; i < six; i++) {
                            out.println("1 2 6");
                        }

                        for (int i = 0; i < count[3]; i++) {
                            out.println("1 3 6");
                        }
                    }
                }

            }
        }
    }
}