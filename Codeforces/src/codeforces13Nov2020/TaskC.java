package codeforces13Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    static int[] x={0,1,1,1,0,-1,-1,-1};
    static int[] y={1,1,0,-1,-1,-1,0,1};
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),m=in.nextInt();
            long[][] a=new long[n][m];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    a[i][j]=in.nextLong();
                }
            }

            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < m; j++) {
                    long val=a[i][j];
                    boolean temp=false;
                    for (int k = 0; k < 8; k++) {
                        int c = i + x[k], d = j + y[k];
                        if (c >= 0 && c < n && d >= 0 && d < m) {
                            if(val==a[c][d]){
                                temp=true;
                                break;
                            }
                        }
                    }
                    if(temp){
                        a[i][j]++;
                    }
                }
            }

            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    out.print(a[i][j]+" ");
                }
                out.println();
            }
            out.println();
        }
    }
}
