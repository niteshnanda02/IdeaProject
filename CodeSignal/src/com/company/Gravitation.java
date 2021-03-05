package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Gravitation {
    public static void main(String[] args) {
        String[] rows={"#..##",
                ".##.#",
                ".#.##",
                "....."};
        int[] arr=grav(rows);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] grav(String[] rows) {
        int minl=rows.length;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <rows[0].length() ; i++) {
            int fin=rows.length-1;
            int t=0;
            for (int j = rows.length-1; j >=0 ; j--) {
                if (rows[j].charAt(i)=='#'){
                    t=fin-j;
                    fin--;
                }
            }
            if (t==minl){
                list.add(i);
            }
            if (t<minl){
                minl=t;
                list=new ArrayList<>();
                list.add(i);
            }
        }
        int[] arr=new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            arr[i]=list.get(i);
        }
        return arr;
    }
}
