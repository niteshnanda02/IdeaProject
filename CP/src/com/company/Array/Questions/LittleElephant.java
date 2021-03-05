package com.company.Array.Questions;

import java.util.Scanner;

public class LittleElephant {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            if (s.hasNextInt()) {
                int t = s.nextInt();
                while (t-- > 0) {
                    int n = s.nextInt();
                    int k = s.nextInt();
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += s.nextInt();
                    }
                    if (sum <= k)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
        }
    }
