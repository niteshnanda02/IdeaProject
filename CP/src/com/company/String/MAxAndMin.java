package com.company.String;

public class MAxAndMin {
    public static void main(String[] args) {
        String x1 = "5466", x2 = "4555";
        printmaxmin(x1, x2);
    }

    private static void printmaxmin(String x1, String x2) {
        long max1 = 0, max2 = 0, min1 = 0, min2 = 0;
        for (int i = 0; i < x1.length(); i++) {
            int curx1 = Character.getNumericValue(x1.charAt(i)) ;
            int curx2 = Character.getNumericValue(x2.charAt(i));
            if (curx1 == 5 || curx1 == 6) {
                if (curx1 > 5) {
                    max1 = max1 * 10 + curx1;
                    min1 = min1 * 10 + 5;
                } else {

                    max1 = max1 * 10 + 6;
                    min1 = min1 * 10 + curx1;

                }
            } else {
                max1 = max1 * 10 + curx1;
                min1 = min1 * 10 + curx1;
            }
            if (curx2 == 5 || curx2 == 6) {
                if (curx2 > 5) {

                    max2 = max2 * 10 + curx2;
                    min2 = min2 * 10 + 5;
                } else {
                    max2 = max2 * 10 + 6;
                    min2 = min2 * 10 + curx2;
                }
            } else {
                max2 = max2 * 10 + curx2;
                min2 = min2 * 10 + curx2;
            }
        }
        long max = max1 + max2, min = min1 + min2;
        System.out.println("Minimum Sum: " + min + " " + "(" + min1 + " + " + min2 + ")");
        System.out.println("Maximum Sum: " + max + " " + "(" + max1 + " + " + max2 + ")");
    }
}
