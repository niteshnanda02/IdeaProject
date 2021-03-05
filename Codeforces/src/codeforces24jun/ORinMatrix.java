package codeforces24jun;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class ORinMatrix {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),m=in.nextInt();
        int[][] a=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                a[i][j]=in.nextInt();
            }
        }
        int[][] and=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                int v=1;
                for (int k = 0; k <n ; k++) {
                    v=v&a[k][j];
                }

                for (int k = 0; k <m ; k++) {
                    v=v&a[i][k];
                }
                and[i][j]=v;
            }
        }
        int[][] or=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                int v=0;
                for (int k = 0; k <n ; k++) {
                    v=v|and[k][j];
                }

                for (int k = 0; k <m ; k++) {
                    v=v|and[i][k];
                }
                or[i][j]=v;
            }
        }
        if (equal(a,or,n,m)){
            out.println("YES");
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j < m; j++) {
                    out.print(and[i][j]+" ");
                }
                out.println();
            }
        }else
            out.println("NO");
    }

    private boolean equal(int[][] a, int[][] or, int n, int m) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (a[i][j]!=or[i][j])
                    return false;
            }
        }
        return true;
    }
}
