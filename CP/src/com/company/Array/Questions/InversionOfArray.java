package com.company.Array.Questions;

import java.util.Arrays;

public class InversionOfArray {
    static long count=0;
    public static void main(String[] args) {
        long[] arr={2, 3, 4, 5, 6};
        arr=mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

    private static long[] mergesort(long[] arr, int low, int high) {
        if(high==low){
            long[] br=new long[1];
            br[0]=arr[low];
            return br;
        }
        int mid=low+(high-low)/2;
        long[] fh=mergesort(arr,low,mid);
        long[] sh=mergesort(arr,mid+1,high);
        return merge(fh,sh);

    }

    private static long[] merge(long[] fh, long[] sh) {
        int n=fh.length,m=sh.length;
        long[] merge=new long[n+m];
        int i=0,j=0,k=0;
        while (i<n&&j<m){
            if(fh[i]<=sh[j]) merge[k++]=fh[i++];
            else {
                merge[k++]=sh[j++];
                count+=n-i;
            }
        }
        while (i<n)
            merge[k++]=fh[i++];

        while (j<m)
            merge[k++]=sh[j++];

        return merge;

    }
}
