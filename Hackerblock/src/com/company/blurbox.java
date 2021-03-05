package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class blurbox {
    public static void main(String[] args) {
        int[][] a={{36,0,18,9},
        {27,54,9,0},
        {81,63,72,45}};
        a=boxBlur(a);
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] boxBlur(int[][] image) {
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<image.length-2;i++){
            List<Integer> list = new ArrayList<>();

            for(int j=0;j<image[i].length-2;j++){
                int c=0;
                for(int k=Math.max(0,i);k<=Math.min(i+1,image.length-1)+1;k++){
                    for(int l=Math.max(0,j);l<=Math.min(j+1,image.length-1)+1;l++){
                        int a=image[k][l];
                        c+=a;
                    }
                }
                list.add(c/9);
            }
            lists.add(list);
        }
        int[][] ans = new int[lists.size()][lists.get(0).size()];
        for (int i = 0; i <lists.size() ; i++) {
            for (int j = 0; j <lists.get(0).size() ; j++) {
                ans[i][j]=lists.get(i).get(j);
            }
        }
        return ans;
    }

}
