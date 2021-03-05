package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class runnerMetting {
    public static void main(String[] args) {
        int[] a = {1, 4, 2}, b = {5, 6, 2};

        runner(a, b);
    }

    private static void runner(int[] a, int[] b) {
        float x = 0, c = 1;
        float X = 0;
        int ans = 0, res = 0;
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 1; i < a.length; i++) {
            c = Math.abs(a[i - 1] - a[i]);
            x = Math.abs(b[i - 1] - b[i]);
            X = c / x;
        }
        for (int i = 0; i < a.length; i++) {
            ans = (int) (X * b[i]) + a[i];
            y.add(ans);
        }
        if (X >= 0) {
            Collections.sort(y);
            for (int i = 1; i < y.size(); i++) {
                if (y.get(i - 1) == y.get(i)) {
                    res++;
                } else {
                    res = 0;
                }
            }
        }
        System.out.println(res);
    }
}
