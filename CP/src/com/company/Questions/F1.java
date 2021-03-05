package com.company.Questions;

import java.util.Scanner;

public class F1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = s.nextInt();
        }
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = s.nextInt();
        }
        int dist = s.nextInt(), k = s.nextInt();
        solve(d, l, n, dist, k);
    }

    private static void solve(int[] d, int[] l, int n, int dist, int k) {
        int energy = k;
        if (k < energy) {
            System.out.println(-1);
            return;
        }
        int stall=0;
        int distance=0;
        for (int i = 0; i < n; ) {
            int j=i;
            while (i < n) {
                if (distance+energy >= d[i]) {
                    energy -= (d[i]-distance);
                    distance=d[i];
                    i++;
                }else if(j==i&&energy<d[i]){
                    System.out.println(-1);
                    return;
                }else {
                    break;
                }
            }
            energy+=l[i-1];
            stall++;
        }
        if (distance+energy>=dist){
            System.out.println(stall);
        }else {
            System.out.println(-1);
        }
    }
}
