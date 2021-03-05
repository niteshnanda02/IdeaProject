package com.company.Array.Questions;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a1 = {7, 9, 9, 10, 11, 11, 13, 14, 17, 19};
        int[] a2 = {1, 1, 4, 5, 8, 11, 13, 16, 19, 19};
        new Solution().merge(a1, a2, a1.length, a2.length);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}

class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int N = n + m;
        int gap = N;
        do {
            gap = (int) Math.ceil(gap / 2.0);
            if(gap==2){
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));
            }
            int i = 0, j = gap % N;
            while (i < j && j < N) {
                if (i % N >= n && j % N >= n) {
                    int ni = (i % N) - (n), nj = (j % N) - (n);
                    if (arr2[ni] > arr2[nj])
                        swap(arr2, ni, nj);
                } else if (i % N < n && j % N >= n) {
                    int ni = i, nj = (j % N) - (n);
                    if (arr1[ni] > arr2[nj]) {
                        int t = arr1[ni];
                        arr1[ni] = arr2[nj];
                        arr2[nj] = t;
                    }
                } else {
                    if (arr1[i] > arr1[j])
                        swap(arr1, i, j);
                }
                i++;
                j++;

            }
        } while (gap != 1);
    }

    void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
