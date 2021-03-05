package com.company;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }
                System.out.println(check(a, n));
            }
        }
    }

    private static int check(int[] a, int n) {
        boolean val = true;
        int m = 0;
        int i = 0;
        while (val) {
            int an = lis(a, a.length);
            if (m < an) {
                int[] arr = new int[a.length * 2];
                int pos = 0;
                for (int element : a) {
                    arr[pos] = element;
                    pos++;
                }

                for (int element : a) {
                    arr[pos] = element;
                    pos++;
                }
                a = arr;
                i++;
                m = an;
            } else
                val = false;
        }
        return i;
    }

    static int lis(int arr[], int n) {
        int lis[] = new int[n];
        int i, j, max = 0;

        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;

        /* Compute optimized LIS values in bottom up manner */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        /* Pick maximum of all LIS values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];

        return max;
    }
}
