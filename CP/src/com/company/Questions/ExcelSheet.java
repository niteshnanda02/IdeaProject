package com.company.Questions;

public class ExcelSheet {
    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("AAA"));
    }
}
class Solution {
    public int titleToNumber(String s) {
        int c=0;
        int pow =1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int curr=ch-64;
            c=c*pow;
            c+=curr;
            pow=26;
        }
        return c;
    }
}