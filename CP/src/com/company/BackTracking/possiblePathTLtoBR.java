package com.company.BackTracking;

import java.util.*;

public class possiblePathTLtoBR {
    static int[] x = {0, 1}, y = {1, 0};

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int n = mat.length, m = mat[0].length;
        boolean[][] vis = new boolean[n][m];
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        subList.add(mat[0][0]);
        findLongestPath(mat, vis, 0, 0, n - 1, m - 1, subList, list);
        System.out.println(list);
    }

    private static void findLongestPath(int[][] mat, boolean[][] vis, int sr, int sc, int n, int m, List<Integer> subList, List<List<Integer>> list) {
        if (sr == n && sc == m) {
            list.add(new ArrayList<>(subList));
            return;
        }
        for (int i = 0; i < 2; i++) {
            int nr = sr + x[i], nc = sc + y[i];
            if (isSafe(nr, nc, n, m, vis)) {
                vis[nr][nc] = true;
                subList.add(mat[nr][nc]);
                findLongestPath(mat, vis, nr, nc, n, m, subList, list);
                vis[nr][nc] = false;
                subList.remove(subList.size() - 1);
            }
        }
    }

    private static boolean isSafe(int nr, int nc, int n, int m, boolean[][] vis) {
        if (nr < 0 || nr > n || nc < 0 || nc > m || vis[nr][nc] == true)
            return false;
        return true;
    }
}
