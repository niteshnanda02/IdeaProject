package codeforce30may;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                if (a[i] % 2 != 0)
                    c++;
            }

            if (x==n&&c%2!=0)
                out.println("Yes");
            else if (x!=n&&x%2!=0&&c!=0)
                out.println("Yes");
            else if (x!=n&&x%2==0&&c!=n&&c!=0)
                out.println("Yes");
            else
                out.println("No");
        }
    }
}
