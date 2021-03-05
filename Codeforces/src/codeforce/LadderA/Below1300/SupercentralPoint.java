package codeforce.LadderA.Below1300;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class SupercentralPoint {
    class pair {
        int x, y;

        public pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        pair[] pairs = new pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new pair(in.nextInt(), in.nextInt());
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = pairs[i].x;
            int y = pairs[i].y;
            int l = x - 1, r = x + 1, t = y + 1, b = y - 1;
            boolean val = check(pairs, l, r, t, b, x, y);
            if (val) {
                ans++;
            }
        }
        out.println(ans);
    }

    private boolean check(pair[] pairs, int l, int r, int t, int b, int x, int y) {
        boolean L=false, R=false, T=false, B=false;
        for (int i = 0; i < pairs.length; i++) {
            if (l >= pairs[i].x && pairs[i].y == y)
                L = true;
            if (r <= pairs[i].x && pairs[i].y == y)
                R = true;
            if (b >= pairs[i].y && pairs[i].x == x)
                B = true;
            if (t <= pairs[i].y && pairs[i].x == x)
                T = true;
        }
        if (L && R && T && B)
            return true;
        else return false;
    }
}
