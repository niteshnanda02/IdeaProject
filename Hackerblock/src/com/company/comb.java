package com.company;

public class comb {

    public static void main(String[] args) {
        System.out.println(Comb("",""));
    }

    private static int Comb(String comb1, String comb2) {
        int big=comb1.length()+comb2.length();
        for (int i = 1,j=0; i <comb1.length()||j<comb2.length() ; ) {
            if (comb2.charAt(j)=='*'&&comb1.charAt(i)=='.'){

            }

        }
        return 0;
    }
}
