package codeforces15Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] a = new int[n][m];
            int neg=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                    if(a[i][j]<0)
                        neg++;

                }
            }
            long sum=0;
            int small=Integer.MAX_VALUE;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    sum+=Math.abs(a[i][j]);
                    small=Math.min(Math.abs(a[i][j]),small);
                }
            }
            if(neg%2!=0)
                sum=sum-(2*small);

            out.println(sum);

        }
    }
}
