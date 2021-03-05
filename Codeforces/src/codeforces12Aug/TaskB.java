package codeforces12Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int m = in.nextInt(), n = in.nextInt(), Sx = in.nextInt(), Sy = in.nextInt();
        boolean[][] arr = new boolean[m][n];
        for (boolean[] a : arr
        ) {
            Arrays.fill(a, false);
        }
        Sx--;
        Sy--;
        for (int i = Sy; i < n; i++) {
            if (!arr[Sx][i]) {
                System.out.println((Sx + 1) + " " + (i + 1));
                arr[Sx][i] = true;

            }
        }

        for (int i = Sy; i >= 0; i--) {
            if (!arr[Sx][i]) {
                System.out.println((Sx + 1) + " " + (i + 1));
                arr[Sx][i] = true;
            }
        }
        int x = 0, y = 0;

        int i, k = x, l = y;
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                if (!arr[k][i]) {
                    arr[k][i] = true;
                    System.out.println((k + 1) + " " + (i + 1));
                }
            }
            k++;

            for (i = k; i < m; ++i) {
                if (!arr[i][n - 1]) {
                    System.out.println((i + 1) + " " + n);
                    arr[i][n - 1] = true;
                }
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    if (!arr[m - 1][i]) {
                        arr[m - 1][i] = true;
                        System.out.println(m + " " + (i + 1));
                    }
                }
                m--;
            }

            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    if (!arr[i][l]) {
                        arr[i][l] = true;
                        System.out.println((i + 1) + " " + (l + 1));
                    }
                }
                l++;
            }
        }
    }
}
