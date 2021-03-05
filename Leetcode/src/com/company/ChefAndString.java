package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChefAndString {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                if (s.hasNext()) {
                    String a = s.next();
                    String l = left(a);
                    String r = right(a);
                    if (l.equals(r))
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }

    private static String left(String s) {
        if (s.length() == 1) {
            return s;
        }
        int i = 1;
        String val = s.substring(i)+s.substring(0,i);
        return val;
    }

    private static String right(String s) {
        if (s.length() == 1) {
            return s;
        }
        StringBuilder builder = new StringBuilder(s);
        builder.append(s);
        int i = s.length() - 1;
        String val = s.substring(i,i+1)+s.substring(0,i);

        return val;
    }

}
