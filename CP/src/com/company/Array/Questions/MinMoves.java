package com.company.Array.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class MinMoves {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < a.length; i++) {
                    a[i] = s.nextInt();
                }
                Arrays.sort(a);
                int ans=0;
                for (int i = 1; i <n ; i++) {
                    ans+=a[i]-a[0];
                }
                System.out.println(ans);
            }
        }
    }


}
