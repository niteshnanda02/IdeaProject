package com.company.Array.Questions;

import java.util.Scanner;

public class ChefRainbow {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int r = 1;
                boolean val = true;
                boolean temp=false;
                for (int i = 0; i < n; i++) {
                    if (r==0){
                        temp=true;
                        break;
                    }
                    if (r == 7)
                        val = false;
                    int v = s.nextInt();
                    if (val) {
                        if (v == r) {
                            r++;
                        }
                    } else {
                        if (v == r)
                            r--;
                    }
                }
                if (r != 0||temp)
                    System.out.println("no");
                else if (r == 0) {
                    System.out.println("yes");

                }
            }
        }
    }
}
