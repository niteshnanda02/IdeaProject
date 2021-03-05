package com.company.DivideAndConquer;

import java.util.Scanner;

public class OnceInSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
            }
            search(a, 0, n - 1);
        }
    }

    private static void search(long[] a, int l, int h) {
        if (l > h)
            return;
        if (l == h) {
            System.out.println(a[l]);
            return;
        }

        int mid = l + (h - l) / 2;

        if (mid % 2 == 0) {
            if (a[mid] == a[mid + 1]) {
                search(a, mid + 2, h);
            } else {
                search(a, l, mid);
            }
        } else {
            if (a[mid] == a[mid - 1]) {
                search(a, mid + 1, h);
            } else {
                search(a, l, mid - 1);
            }
        }
    }
}
