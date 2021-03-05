package com.company.codeforceContest7may;

import java.util.Scanner;

public class Skier {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();
            int N = 0, S = 0, E = 0, W = 0;
            int c = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);



                if (ch == 'N') {
                    if (S > 0) {
                        c++;
                        S--;

                    } else {
                        c += 5;
                        N=1;
                    }
                } else if (ch == 'S') {
                    if (N > 0) {
                        c++;
                        N--;
                    } else {
                        c += 5;
                        S=1;
                    }
                } else if (ch == 'W') {
                    if (E > 0) {
                        c++;
                        E--;
                    } else {
                        c += 5;
                        W=1;
                    }
                } else if (ch == 'E') {
                    if (W > 0) {
                        c++;
                        W--;
                    } else {
                        c += 5;
                        E=1;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
