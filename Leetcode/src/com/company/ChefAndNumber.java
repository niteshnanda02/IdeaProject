package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {


                int n = s.nextInt();
                int[] a = new int[n];
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                    set.add(a[i]);
                }
                int ans = a[0], co = 0;
                for (Integer c : set) {
                    int val = 0;
                    for (int i = 0; i < n; i++) {
                        if (c == a[i]) {
                            i++;
                            val++;

                        }
                    }
                    if (val > co) {
                        co = val;
                        ans = Integer.valueOf(c);
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
