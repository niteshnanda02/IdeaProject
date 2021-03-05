package com.company;

import java.util.Scanner;

public class goblin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int N = s.nextInt();
            int M = s.nextInt();
            int C = s.nextInt();
            double[] carr = new double[C];
            for (int i = 0; i < C; i++) {
                carr[i] = s.nextDouble();
            }
            checkgob(N, M, C, carr);

            t--;
        }
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void checkgob(int N, int M, int C, double[] carr) {
        int c = 0;

        double a = 0.0;
        for (int i = 0; i < C; i++) {
            a += carr[i];
            c++;
            if (a == N || a * 2 == N) {
                if (c <= C) {
                    System.out.println(c);
                    return;
                }
            }

        }
    }
}
