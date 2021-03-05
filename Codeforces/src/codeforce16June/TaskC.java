package codeforce16June;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.awt.image.renderable.ContextualRenderedImageFactory;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt(), k = in.nextInt();
            String s = in.nextString();
            char[] a = s.toCharArray();
            int res = 0;
            int f = -1, c = 0;
            for (int i = 0; i <= k && i < n; i++) {
                if (a[i] == '1') {
                    f = i;
                    break;
                }
            }
            if (f == -1) {
                res++;
                c = k;
                f = k + 1;
            }
            int start = Math.min(k + 1, f);
            for (int i = start; i < n; i++) {

                if (a[i] == '1')
                    c = 0;
                else
                    c++;
                if (c == 2 * k + 1) {
                    res++;
                    c = k;
                }
            }
            if (c >= k + 1) {
                res++;
            }
            out.println(res);
        }

    }
}