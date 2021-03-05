package codeforces30Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long max = Long.MIN_VALUE;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
            if (a[i] > max)
                max = a[i];
        }
        Arrays.sort(a);
        long c = Math.round(Math.pow(max,1.0/(float)(n-1)));
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - Math.pow(c, i));
        }
        out.println(ans);

    }
}
