package com.company;

import java.util.Arrays;

public class multiext {
    public static void main(String[] args) {

        System.out.println(bueatiful("abc def ghi", 4, 10));
    }

    private static boolean bueatiful(String inputString, int l, int r) {
        int a = inputString.length();
        for (int i = l; i <= r; i++) {
            int j = 0;
            int val=-1;
            for (j = i; j < inputString.length(); j = j + i) {
                char ch = inputString.charAt(j-1);
                if (ch == ' ' || ch == '\0') {
                    val=j-val;
                    continue;
                } else {
                    break;
                }
            }
            if (j == inputString.length()+1) {
                System.out.println(val);
                if(val>=l&&val<=r){
                    return true;
                }
            }
        }
        return false;

    }
}
