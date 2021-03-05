package com.company.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatform {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            int[] d = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = s.nextInt();
            }
            int[] combine = new int[2 * n];
            int j = 0, k = 0;
            for (int i = 0; i < 2 * n; i++) {
                if (j >= n || k >= n)
                    break;
                if (a[j] >= d[k]) {
                    combine[i] = -1;
                    k++;
                } else {
                    combine[i] = 1;
                    j++;
                }
            }
            for (int i = 1; i < 2 * n; i++) {
                combine[i] += combine[i - 1];
            }
            System.out.println(Arrays.stream(combine).max().getAsInt());
        }
    }
}
