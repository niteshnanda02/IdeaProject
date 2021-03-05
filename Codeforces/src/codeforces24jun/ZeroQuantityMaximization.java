package codeforces24jun;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ZeroQuantityMaximization {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long[] a = in.nextLongArray(n);
        long[] b = in.nextLongArray(n);
        Map<Float, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (a[i] == 0 || b[i] == 0)
                continue;
            float one = a[i];
            float two = b[i];
            if (one % two == 0 || two % one == 0) {
                float f = one / two;
                map.put(f, map.getOrDefault(f, 0) + 1);
            }
        }
        long ans = highest(map);
        out.println(ans);
    }

    private long highest(Map<Float, Integer> map) {
        long key = 0, value = 0;
        Set<Map.Entry<Float, Integer>> entries = map.entrySet();
        for (Map.Entry<Float, Integer> entry : entries) {
            if (value < entry.getValue()) {
                value = entry.getValue();
            }
        }
        return value;
    }
}
