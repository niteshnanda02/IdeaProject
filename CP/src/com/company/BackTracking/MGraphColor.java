package com.company.BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class MGraphColor {
    static int[] color;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            int e = s.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < e; i++) {
                int F = s.nextInt(), S = s.nextInt();
                F--;
                S--;
                arr[F][S] = 1;
                arr[S][F] = 1;
            }
            graphcoloring(arr, m, n);
        }
    }

    private static void graphcoloring(int[][] arr, int m, int V) {
        color = new int[V];
        Arrays.fill(color, 0);

        if (graphUtil(arr, m, color, 0, V)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    private static boolean graphUtil(int[][] arr, int m, int[] color, int v, int V) {

        if (v == V)
            return true;

        for (int c = 1; c <= m; c++) {
            if (isSafe(arr, color, v, c, V)) {
                color[v] = c;

                if (graphUtil(arr, m, color, v + 1, V))
                    return true;

                color[v] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] arr, int[] color, int v, int c, int V) {

        for (int i = 0; i < V; i++) {
            if (arr[v][i] == 1 && c == color[i])
                return false;
        }
        return true;
    }
}
