package com.company.Questions;

import java.util.Arrays;

public class si1 {
    public static void main(String[] args) {
//        solve("hello world",3);
        System.out.println(10&3);
        System.out.println(2&4);
        System.out.println(2&2);
    }

    private static void solve(String s, int row) {
        int col= (int) Math.ceil((double) s.length()/row)+1;
        char[][] mat=new char[row][col];
        int ind=0;
        for (int i = 0; i <col ; i++) {
            for (int j = 0; j <row ; j++) {
                if(ind<s.length()) {
                    mat[j][i + j] = s.charAt(ind);
                    ind++;
                }
            }
        }
        String ans="";
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                if(mat[i][j]=='\0'||mat[i][j]==' '){
                    ans+="_";
                }else
                    ans+=mat[i][j];
            }
        }
        System.out.println(ans);
    }
}
