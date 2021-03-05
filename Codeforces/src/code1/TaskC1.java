package code1;

import java.util.*;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC1 {
    static int count = 0;
    static List<int[]> list;
    static int[] x = {0, 1, 0, -1}, y = {1, 0, -1, 0};

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            list = new ArrayList<>();

            int n = in.nextInt(), m = in.nextInt();
            int[][] mat = new int[n][m];
            for (int i = 0; i < n; i++) {
                String l = in.nextString();
                for (int j = 0; j < m; j++) {
                    mat[i][j] = l.charAt(j) - '0';
                }
            }
            for (int i = 0; i <= n - 2; i++) {
                for (int j = 0; j <= m - 2; j++) {
                    int zero = 0, one = 0;
                    for (int k = i; k < i + 2; k++) {
                        for (int l = j; l < j + 2; l++) {
                            if (mat[k][l] == 0)
                                zero++;
                            else
                                one++;
                        }

                    }
                    if (one == 4) {
                        four(mat, i, j);
                    } else if (one == 3) {
                        three(mat,i,j);
                    } else if (one == 2) {
                        two(mat,i,j);
                    } else if (one == 1) {
                        one(mat,i,j);
                    }
                }
            }
            out.println(list.size());
            for (int i = 0; i <list.size() ; i++) {
                int[] a=list.get(i);
                for (int j = 0; j <a.length ; j++) {
                    out.print((a[j]+1)+" ");
                }
                out.println();
            }
        }
    }

    private void four(int[][] mat, int i, int j) {
        int[] a = new int[6];
        a[0] = i;
        a[1] = j;
        mat[i][j] = 0;
        a[2] = i + 1;
        a[3] = j;
        mat[i + 1][j] = 0;
        a[4] = i;
        a[5] = j + 1;
        mat[i][j + 1] = 0;
        list.add(a);
        one(mat, i, j);

    }

    private void one(int[][] mat, int i, int j) {
        int k = i, l = j;
        boolean temp=false;
        for (k = i; k < i + 2; k++) {
            for (l = j; l < j + 2; l++) {
                if (mat[k][l] == 1){
                    temp=true;
                    break;

                }
            }
            if(temp)
                break;
        }
        int[] a = new int[6];
        a[0] = k;
        a[1] = l;
        mat[k][l] = 0;
        int c = 2;
        for (int m = 0; m < 4; m++) {
            int nx = k + x[m], ny = l + y[m];
            if (nx >= i && nx < i + 2 && ny >= j && ny < j + 2) {
                a[c] = nx;
                c++;
                a[c] = ny;
                c++;
                mat[nx][ny] = 1;
            }
        }
        list.add(a);

        two(mat, i, j);
    }

    private void two(int[][] mat, int i, int j) {
        int k = i, l = j;
        boolean temp=false;
        for (k = i; k < i + 2; k++) {
            for (l = j; l < j + 2; l++) {
                if (mat[k][l] == 1) {
                    temp=true;
                    break;
                }
            }
            if(temp)
                break;
        }
        int[] a = new int[6];
        a[0] = k;
        a[1] = l;
        mat[k][l] = 0;
        int c = 2;
        for (int m = 0; m < 4; m++) {
            int nx = k + x[m], ny = l + y[m];
            if (nx >= i && nx < i + 2 && ny >= j && ny < j + 2&&mat[nx][ny]==0) {
                a[c] = nx;
                c++;
                a[c] = ny;
                c++;
                mat[nx][ny] = 1;

            }
        }
        list.add(a);

        three(mat, i, j);
    }

    private void three(int[][] mat, int i, int j) {
        int c = 0;
        int[] a = new int[6];
        for (int k = i; k < i + 2; k++) {
            for (int l = j; l < j + 2; l++) {
                if (mat[k][l] == 1) {
                    a[c] = k;
                    c++;
                    a[c] = l;
                    c++;
                    mat[k][l] = 0;
                }
            }
        }
        list.add(a);
    }
}
