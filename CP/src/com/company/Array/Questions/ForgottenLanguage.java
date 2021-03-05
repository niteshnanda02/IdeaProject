package com.company.Array.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ForgottenLanguage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), k = s.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(s.next());
            }
            for (int i = 0; i < k; i++) {
                int l = s.nextInt();
                for (int j = 0; j < l; j++) {
                    String v = s.next();
                    if (list.contains(v)) {
                        int ind = list.indexOf(v);
                        list.set(ind, "");
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == "")
                    System.out.print("YES ");
                else
                    System.out.print("NO ");
            }
            System.out.println();
        }
    }
}
