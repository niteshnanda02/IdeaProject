package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class FindMarble {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt(), s = in.nextInt(), t = in.nextInt();
        int[] a = in.nextIntArray(n);
        int c = 0;
        boolean flag = false;
        int o = s;

        while (s != t) {
            s = a[s - 1];
            if (o == s && s != t) {
                flag = true;
                break;
            }
            c++;
        }
        if (flag)
            out.println(-1);
        else
            out.println(c);
    }
}
