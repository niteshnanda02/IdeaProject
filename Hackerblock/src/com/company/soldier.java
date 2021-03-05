package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class soldier {
    public static void main(String[] args) {
        int[] a={1 ,5};
        int[] b={3,4};
        arrange(a,b);
        arr(a,b);
    }

    private static void arr(int[] a, int[] b) {
        int c=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0,j=0; i < a.length&&j<b.length; ) {
            if(a[i]>b[j]){
                i++;
                j++;
                c++;
            }else {
                i++;
            }
        }
    }


    private static void arrange(int[] a, int[] b) {
        int c=0;
        Arrays.sort(a);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if (b[j]<list.get(i)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
