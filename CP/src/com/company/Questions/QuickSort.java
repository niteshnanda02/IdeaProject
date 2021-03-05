package com.company.Questions;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quicksort(int[] arr, int left, int right) {
        if (left==right)
            return;
        int mid=left+(right-left)/2;
        int pivot=arr[mid];
        quickpivot(arr,left,right,pivot);
        quicksort(arr,left,mid);
        quicksort(arr,mid+1,right);

    }

    private static void quickpivot(int[] arr, int left, int right, int pivot) {
        while (left<right){
            while (arr[left]<pivot){
                left++;
            }
            while (arr[right]>pivot){
                right--;
            }
            if (left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
}
