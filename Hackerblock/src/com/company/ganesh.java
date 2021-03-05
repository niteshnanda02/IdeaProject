package com.company;

public class ganesh {
    public static void main(String[] args) {
        ganesh(7);
    }

    private static void ganesh(int n) {
        int row = 0;
        int nst = n;
        int nsp = (int) Math.pow(n, 0.5);
        while (row < n) {
            int cst = 0;
            int csp = 0;
            if (row < n / 2) {
                System.out.print("*");
                while (csp < nsp) {
                    System.out.print(" ");
                    csp++;
                }
                System.out.print("*");
                if (row == 0) {
                    while (cst < nst / 2) {
                        System.out.print("*");
                        cst++;
                    }
                }
            } else if (row == n / 2) {
                while (cst < nst) {
                    System.out.print("*");
                    cst++;
                }
            } else {
                if (row == n - 1) {
                    while (cst < nst / 2) {
                        System.out.print("*");
                        cst++;
                    }
                } else {
                    while (csp <= nsp) {
                        System.out.print(" ");
                        csp++;
                    }
                }
                csp=0;

                System.out.print("*");
                while (csp < nsp) {
                    System.out.print(" ");
                    csp++;
                }
                System.out.print("*");


            }
            row++;
            System.out.println();
        }
    }
}
