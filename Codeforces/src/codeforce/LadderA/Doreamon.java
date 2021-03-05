package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class Doreamon {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int v2 = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        int ans = Integer.MAX_VALUE;
        boolean flag = false;
        if (n % m == 0) {
            flag = true;
            ans = Math.min(ans, n);
        }
        while (v2 < n) {
            if (v2 % m == 0) {
                flag = true;
                ans = Math.min(ans, v2);
            }
            v2++;

        }
        if (!flag)
            out.println(-1);
        else
            out.println(ans);
    }
}
