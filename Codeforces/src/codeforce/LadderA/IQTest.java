package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class IQTest {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] a = new int[n + 1];
        int O=0,E=0;
        int o = 0, e = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
            if (a[i] % 2 == 0) {
                E++;
                if (e==0)
                e = i;
            } else if ( a[i] % 2 != 0) {
                O++;
                if (o==0)
                o = i;
            }
        }
        if (E==1)
            out.println(e);
        else
            out.println(o);
    }
}
