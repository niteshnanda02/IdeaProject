package com.company.graph.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RatInMaze {
    static ArrayList<String> l = new ArrayList<>();
    static boolean[][] visited;

    public static ArrayList<String> printPath(int[][] m, int n) {
        // Your code here
        l.clear();
        visited = new boolean[n + 1][n + 1];
        visited[0][0] = true;
        print(m, 0, 0, n, "");
        Collections.sort(l);
        return l;
    }

    static void print(int[][] m, int i, int j, int n, String s) {
        //base case
        if (i == n - 1 && j == n - 1) {
            l.add(s);
            return;
        }
        if (i < 0 || i >= n || j < 0 || j >= n)
            return;
        //R
        int a = i, b = j + 1;
        if (b < n && m[a][b] == 1 && !visited[a][b]) {
            visited[a][b] = true;
            print(m, a, b, n, s + "R");
            visited[a][b] = false;
        }
        //U
        a = i - 1;
        b = j;
        if (a >= 0 && m[a][b] == 1 && !visited[a][b]) {
            visited[a][b] = true;
            print(m, a, b, n, s + "U");
            visited[a][b] = false;
        }
        //L
        a = i;
        b = j - 1;
        if (b >= 0 && m[a][b] == 1 && !visited[a][b]) {
            visited[a][b] = true;
            print(m, a, b, n, s + "L");
            visited[a][b] = false;
        }
        //D
        a = i + 1;
        b = j;
        if (a < n && m[a][b] == 1 && !visited[a][b]) {
            visited[a][b] = true;
            print(m, a, b, n, s + "D");
            visited[a][b] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(printPath(new int[][]{{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}}, 4));
    }
}
