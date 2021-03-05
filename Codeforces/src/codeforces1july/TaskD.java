package codeforces1july;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt(), k = in.nextInt();
            int[][] arr = new int[n][n];
            for (int[] a : arr) {
                Arrays.fill(a,0);
            }
            if (k == 0) {
                out.println(0);
                display(arr, n, out);
            } else if (k == n * n) {
                for (int[] a : arr) {
                    Arrays.fill(a,1);
                }
                out.println(0);
                display(arr, n, out);
            } else {
                for (int i = 0; i < k && i < n; i++) {
                    arr[i][i] = 1;
                }
                if (k <= n) {
                    out.println(0);
                    display(arr, n, out);
                } else {
                    k -= n;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (arr[i][j] != 1 && k > 0) {
                                arr[i][j] = 1;
                                k--;
                            }
                        }
                    }
                    int maxR = 0, maxC = 0, minR = Integer.MAX_VALUE, minC = Integer.MAX_VALUE;
                    for (int i = 0; i < n; i++) {
                        int sumR = 0, sumC = 0;
                        for (int j = 0; j < n; j++) {
                            sumR += arr[i][j];
                            sumC += arr[j][i];
                        }
                        maxR = Math.max(sumR, maxR);
                        minR = Math.min(sumR, minR);
                        maxC = Math.max(maxC, sumC);
                        minC = Math.min(minC, sumC);
                    }
                    int res = (int) (Math.pow(maxR - minR, 2) + Math.pow(maxC - minC, 2));
                    out.println(res);
                    display(arr, n, out);
                }

            }
        }


    }

    private void display(int[][] arr, int n, OutputWriter out) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(arr[i][j]);
            }
            out.println();
        }
    }

}
