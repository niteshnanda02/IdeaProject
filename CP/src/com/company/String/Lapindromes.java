package com.company.String;

import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()){
            int[] a;
            int t=s.nextInt();
            while (t-->0){
                a=new int[26];
                String str=s.next();
                for (int i = 0; i <str.length()/2 ; i++) {
                    char cc=str.charAt(i);
                    char ce=str.charAt(str.length()-1-i);
                    a[cc-'a']++;
                    a[ce-'a']--;
                }
                boolean check=check(a);
                if (check)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }

    private static boolean check(int[] a) {
        for (int i = 0; i <a.length ; i++) {
            if (a[i]!=0)
                return false;
        }
        return true;
    }
}
