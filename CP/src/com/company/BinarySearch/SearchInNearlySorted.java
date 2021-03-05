package com.company.BinarySearch;

public class SearchInNearlySorted {
    public static void main(String[] args) {
        int[] a={10, 3, 40, 20, 50, 80, 70};
        int target=0;
        System.out.println(search(a,target));

    }

    private static int search(int[] a, int target) {
        int s=0,e=a.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==target){
                return mid;
            }
            if(mid-1>=s&&a[mid-1]==target)
                return mid-1;
            if(mid+1<=e&&a[mid+1]==target)
                return mid+1;

            else if(a[mid]<target)
                s=mid+2;
            else
                e=mid-2;
        }
        return -1;
    }
}
