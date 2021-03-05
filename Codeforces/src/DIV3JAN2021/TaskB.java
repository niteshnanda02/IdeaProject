package DIV3JAN2021;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0) {
            int count2 = 0, count1 = 0;
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int v = in.nextInt();
                if (v == 1)
                    count1++;
                else
                    count2++;
            }
            int t = count1 + 2 * count2;
            if (t % 2 != 0) {
                out.println("NO");
            } else {
                int required = t / 2;
                int count = 0;
                if (required % 2 == 1) {
                    count = count + Math.min(count1, 1);
                    count1 = count1 - count;
                    if (count == 0) {
                        out.println("NO");
                        continue;
                    }
                }
                int temp = required - count;
                count += Math.min(temp, count2 * 2);
                if (count == required) {
                    out.println("YES");

                } else {
                    temp = required - count;
                    count += Math.min(temp, count1);
                    if (count == required) {
                        out.println("YES");
                    } else {
                        out.println("NO");
                    }
                }
            }
        }
    }
}
