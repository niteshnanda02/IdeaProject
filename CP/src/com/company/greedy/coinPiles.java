package com.company.greedy;

import java.io.*;
import java.util.Arrays;

public class coinPiles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        while (t-- > 0) {
            String l = reader.readLine();
            String[] a = l.split(" ");
            int n = Integer.parseInt(a[0]);
            int k = Integer.parseInt(a[1]);
            int[] A = new int[n];
            l = reader.readLine();
            a = l.split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(a[i]);
            }
            Arrays.sort(A);
            int ans = 0;
            int i = 0, j = n - 1;
            while (i < j) {
                if (A[i] - A[j] > k) {
                    int c = (A[i] - A[j]) - k;
                    A[i] -= c;
                    ans += c;
                    i++;
                    j--;
                } else {
                    break;
                }

            }

            System.out.println(ans);
        }
    }
}
