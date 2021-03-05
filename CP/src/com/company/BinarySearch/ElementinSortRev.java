package com.company.BinarySearch;

public class ElementinSortRev {
    public static void main(String[] args) {
        int[] a={9,12,15,17,25,28,32,37,3,5,7,8};
        int pivot=findpivotindex(a,0,a.length-1);
        int elem=7;
        int ind=0;
        if(a[pivot]<=elem&&elem<=a[a.length-1]){
            ind=binarysearch(a,pivot,a.length-1,elem);
        }else {
            ind=binarysearch(a,0,pivot-1,elem);
        }
        System.out.println(ind);
    }
    private static int binarysearch(int[] a,int s,int e,int elem){
        int mid=(s+e)>>1;
        if(a[mid]==elem)
            return mid;
        else if(a[mid]>elem)
            return binarysearch(a,s,mid-1,elem);
        else
            return binarysearch(a,mid+1,e,elem);
    }
    private static int findpivotindex(int[] a, int s, int e) {

        int mid=(s+e)>>1;
        if(a[mid]>a[mid+1])
            return mid+1;
        else if(a[s]>a[mid])
            return findpivotindex(a,s,mid-1);
        else
            return findpivotindex(a,mid+1,e);
    }
}
