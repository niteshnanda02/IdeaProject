package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class FoxAndSnake {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    out.print("#");
                } else {
                    if (flag) {
                        if (j == m - 1) {
                            out.print("#");
                            flag=false;
                        }
                        else
                            out.print(".");
                    } else {
                        if (j==m-1)
                            flag=true;
                        if (j == 0)
                            out.print("#");
                        else
                            out.print(".");
                    }
                }
            }
            out.println();
        }
    }
}
