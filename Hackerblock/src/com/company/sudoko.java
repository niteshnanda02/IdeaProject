package com.company;

import java.util.ArrayList;

public class sudoko {
    public static void main(String[] args) {
        int[][] g={{1, 3, 2, 5, 4, 6, 9, 8, 7},
                {4, 6, 5, 8, 7, 9, 3, 2, 1},
        {7, 9, 8, 2, 1, 3, 6, 5, 4},
        {9, 2, 1, 4, 3, 5, 8, 7, 6},
        {3, 5, 4, 7, 6, 8, 2, 1, 9},
        {6, 8, 7, 1, 9, 2, 5, 4, 3},
        {5, 7, 6, 9, 8, 1, 4, 3, 2},
        {2, 4, 3, 6, 5, 7, 1, 9, 8},
        {8, 1, 9, 3, 2, 4, 7, 6, 5}};
        System.out.println(sudoku(g));
    }
    static boolean sudoku(int[][] grid) {
        ArrayList<Integer> finlist=new ArrayList<>();
        ArrayList<Integer> list=addelement(finlist);
        finlist=new ArrayList<>() ;
        ArrayList<Integer> row=addelement(finlist);
        finlist=new ArrayList<>();
        ArrayList<Integer> col=addelement(finlist);
        System.out.println(row);
        System.out.println(col);

        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid.length ; j++) {
                int a=grid[i][j];
                if(row.contains(a)){
                    row.remove(new Integer(a));
                }else{
                    return false;
                }
                int b=grid[j][i];
                if(col.contains(b)){
                    col.remove(new Integer(b));
                }else{
                    return false;
                }
            }
            row=addelement(row);
            col=addelement(col);
        }
        for(int i=0;i<=grid.length-3;i+=3){
            for(int j=0;j<=grid.length-3;j+=3){
                for(int k=i;k<i+3;k++){
                    for(int l=j;l<j+3;l++){
                        int a=grid[k][l];
                        if(list.contains(a)){
                            list.remove(new Integer(a));
                        }else{
                            return false;
                        }
                    }
                }
                list=addelement(list);
            }
        }

        return true;
    }
    static ArrayList<Integer> addelement(ArrayList<Integer> list){
        for(int i=1;i<=9;i++){
            list.add(i);
        }
        return list;
    }
}
