package com.company.String;

public class Atoi {
    static int atoi(String str) {
        int ans = 0;
        int start=1;
        if(str.charAt(0)=='-'){
            start=-1;
            str=str.substring(1);
        }
        // Your code here
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int v = ch - '0';
            if (v >= 0 && v <= 9) {
                ans = ans * 10 + v;
            } else {
                return -1;
            }
        }
        return start*ans;

    }

    public static void main(String[] args) {
        System.out.println(atoi("-12"));
    }
}
