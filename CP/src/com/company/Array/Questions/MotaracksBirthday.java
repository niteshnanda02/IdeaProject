package com.company.Array.Questions;

import java.util.Scanner;
import java.util.Vector;

public class MotaracksBirthday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            Vector<Integer> vector = new Vector<>();
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int v = s.nextInt();
                vector.add(v);
            }
            for (int i = 0; i < n; i++) {
                if (i > 0 && vector.get(i) == -1 && vector.get(i - 1) != -1) {
                    max = Math.max(max, vector.get(i - 1));
                    min = Math.min(min, vector.get(i - 1));
                }
                if (i < n - 1 && vector.get(i) == -1 && vector.get(i + 1) != -1) {
                    max = Math.max(max, vector.get(i + 1));
                    min = Math.min(min, vector.get(i + 1));
                }
            }
            int mid = (max + min) / 2;
            for (int i = 0; i < n; i++) {
                if (vector.get(i) == -1)
                    vector.set(i, mid);
            }
            int ans = 0;
            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, Math.abs(vector.get(i - 1) - vector.get(i)));
            }
            System.out.println(ans + " " + mid);
        }
    }
}
