package com.company.Questions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,1,4,2,5,1};
        arr=mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] mergesort(int[] arr, int left, int right) {
        if (left==right){
            int[] br=new int[1];
            br[0]=arr[left];
            return br;
        }
        int mid=left+(right-left)/2;
        int[] first=mergesort(arr,left,mid);
        int[] second=mergesort(arr,mid+1,right);
        int[] merge=merge(first,second);
        return merge;
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merge=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i<first.length&&j<second.length){
            if(first[i]<second[j])
                merge[k++]=first[i++];
            else
                merge[k++]=second[j++];
        }
        while (i<first.length)
            merge[k++]=first[i++];
        while (j<second.length)
            merge[k++]=second[j++];

        return merge;
    }
}
