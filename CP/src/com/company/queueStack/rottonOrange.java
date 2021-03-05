package com.company.queueStack;

import java.util.*;

public class rottonOrange {
    static class pair {
        int x, y;

        pair(int a, int b) {
            x = a;
            y = b;
        }


    }

    static int[][] dis;
    static int[] x = {0, 1, 0, -1}, y = {1, 0, -1, 0};

    public static int rotOranges(int a[][], int r, int c) {
        // Write your code here
        dis = new int[r][c];
        for (int[] arr:
             dis) {
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        Queue<pair> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] == 2) {
                    q.add(new pair(i, j));
                    dis[i][j]=0;
                }
                else if(a[i][j]==0)
                    dis[i][j]=0;

            }
        }

        while (!q.isEmpty()) {
            pair rp = q.remove();
            for (int i = 0; i < 4; i++) {
                int X = rp.x + x[i], Y = rp.y + y[i];
                if (isSafe(X, Y, a, r, c)) {
                    dis[X][Y] = dis[rp.x][rp.y] + 1;
                    a[X][Y] = 2;
                    q.add(new pair(X, Y));
                }
            }
        }

                int max = 0;
        for (int[] arr : dis) {
            for (int elem : arr) {
                if(elem==Integer.MAX_VALUE)
                    return -1;
                max = Math.max(elem, max);
            }
        }
        return max;
    }

    private static boolean isSafe(int x, int y, int[][] a, int r, int c) {
        if (x < 0 || x >= r || y < 0 || y >= c || a[x][y] != 1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        int[][] a=new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                a[i][j]=s.nextInt();
            }
        }
        System.out.println(rotOranges(a,r,c));
    }
}
