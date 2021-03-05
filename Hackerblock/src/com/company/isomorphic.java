package com.company;

import java.util.Collections;

public class isomorphic {
    public static void main(String[] args) {
        int[][] a1={{2},{} };
        int[][] a2={{2}};
        System.out.println(areIsomorphic(a1,a2));
    }
    static boolean areIsomorphic(int[][] array1, int[][] array2) {
        int i=0,j=0;
        for(;i<array1.length&&j<array2.length;i++,j++){
            int a=array1[i].length;
            int b=array2[j].length;
            if(a!=b){
                return false;
            }
        }

        int a=array1.length;
        int b=array2.length;
        if(a!=b){
            return false;
        }

        return true;
    }

}
