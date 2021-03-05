package com.company.TwoPointer;

import java.util.ArrayList;

public class IntervalListIntersections {
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        int i=0,j=0;

        while(i<A.length&&j<B.length){
            ArrayList<Integer> sub=new ArrayList<>();
            if(A[i][0]<=B[j][0]&&A[i][1]>=B[j][1]){

                sub.add(B[j][0]);
                sub.add(B[j][1]);
                j++;
            }else if(A[i][0]>=B[j][0]&&A[i][1]<=B[j][1]){
                sub.add(A[i][0]);
                sub.add(A[i][1]);
                i++;
            }else if(A[i][0]<=B[j][0]&&A[i][1]>=B[j][0]){
                sub.add(B[j][0]);
                sub.add(A[i][1]);
                i++;
            }else if(B[j][0]<=A[i][0]&&B[j][1]>=A[i][0]){
                sub.add(A[i][0]);
                sub.add(B[j][1]);
                j++;
            }else if(A[i][1]<B[j][0]){
                i++;
            }else if(B[j][1]<A[i][0]){
                j++;
            }
            list.add(sub);
        }

        System.out.println(list);
        return null;
    }

    public static void main(String[] args) {
        int[][] a= {{0,2},{5,10},{13,23},{24,25}},b={{1,5},{8,12},{15,24},{25,26}};
        System.out.println(intervalIntersection(a,b));
    }
}
