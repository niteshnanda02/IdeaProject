package com.company.matrix;

import java.util.ArrayList;

public class SpiralMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int L=0,T=0,R=c-1,B=r-1;
        while(L<=R&&T<=B){
            for(int i=L;i<=R;i++){
                list.add(matrix[T][i]);
            }
            T++;
            for(int i=T;i<=B;i++){
                list.add(matrix[i][R]);
            }
            R--;
            if(T<B){
                for(int i=R;i>=L;i--){
                    list.add(matrix[B][i]);
                }
                B--;
            }
            if(L<R){
                for(int i=B;i>=T;i--){
                    list.add(matrix[i][L]);
                }
                L++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[][] a={{5,11,},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(spirallyTraverse(a,3,4));
    }
}
