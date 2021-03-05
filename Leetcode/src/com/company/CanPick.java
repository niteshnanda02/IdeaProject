package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CanPick {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int big = s.nextInt(), small = s.nextInt(), goal = s.nextInt();
        System.out.println(check(big, small, goal));
    }

    private static boolean check(int big, int small, int goal) {
        if (big < 0 || small < 0)
            return false;

        if (goal < 5) {
            for (int i = 0; i < small; i++) {
                if (goal == 0)
                    return true;

                goal -= 1;
            }
        } else {
            for (int i = 0; i < big; i++) {
                if (goal == 0)
                    return true;
                if (goal < 5) {
                    break;
                }
                goal -= 5;
            }
            if (goal == 0)
                return true;

            for (int i = 0; i < small; i++) {
                if (goal == 0)
                    return true;
                goal -= 1;
            }
        }
        return false;
    }
}
