package codeforce16June;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            int odd = 0, even = 0, ans = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (a[i] % 2 != 0) {
                        even++;
                    }
                } else {
                    if (a[i] % 2 == 0) {
                        odd++;
                    }
                }
            }
            if (even>odd||odd>even){
                out.println(-1);
            }else {
                ans=(even+odd)/2;
                out.println(ans);
            }
        }
    }
}