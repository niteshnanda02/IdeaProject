package com.company.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Arrayformation {
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        ArrayList<Integer> sl=new ArrayList<>();
        list.add((ArrayList<Integer>) sl);

        Arrays.sort(arr);
        Arrays.sort(pieces, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0]-t1[0];
            }
        });
        int k=0;
        for (int i = 0; i <pieces.length ; i++) {
            for (int j = 0; j <pieces[i].length ; j++) {
                if(k>=arr.length||arr[k++]!=pieces[i][j])
                    return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        int[] a={91,4,64,78};
        int[][] p={{78},{4,64}, {91}};
        System.out.println(canFormArray(a,p));
    }
}
