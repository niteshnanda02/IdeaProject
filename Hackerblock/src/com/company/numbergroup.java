package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class numbergroup {
    public static void main(String[] args) {
        int[] arr={10000, 1};
        System.out.println(group(arr));
    }

    private static int group(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int num=0,head=0;


        for (int j = 1; j <=Integer.MAX_VALUE ; j++) {
               int check=0;
                for (int i = 0; i <arr.length ; i++) {
                    int k=arr[i];
                    if(arr[i]>=(((j-1)*(int)Math.pow(10,4))+1)&&arr[i]<=j*(int)Math.pow(10,4)){
                        list.add(arr[i]);
                        check++;
                }
               

            }
            if (check!=0){
                head++;
                num+=check;
            }


        }
        System.out.println(list);
        return head+num;

    }

    private static void checkno(int i) {
        for (int j = 1; j <=10 ; j++) {
            if(j>(j-1)*(int)Math.pow(10,4)&&j<j*(int)Math.pow(10,4)){


            }
        }
    }
}
