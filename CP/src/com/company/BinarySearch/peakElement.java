package com.company.BinarySearch;

import java.util.Objects;

public class peakElement {
    class pair{
        int x,y;
        pair(int a,int b){
            x=a;y=b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            pair pair = (pair) o;
            return x == pair.x &&
                    y == pair.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    public static void main(String[] args) {
        System.out.println(new Peak().peakElement(new int[]{1,2,3},3));
    }
}
class Peak
{
    // Function to find the peak element
    // a[]: input array
    // n: size of array a[]
    public int peakElement(int[] a,int n)
    {
        //add code here.
        if(n==1)
            return 0;
        int l=0,e=n-1;
        while(l<=e){
            int mid=l+(e-l)/2;
            if(mid>0&&mid<n-1){
                if(a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
                    return mid;
                }else if(a[mid]<a[mid-1]){
                    e=mid-1;
                }else{
                    l=mid+1;
                }
            }else if(mid==0){
                if(a[0]>a[1])
                    return 0;
                else
                    return 1;
            }else if(mid==n-1){
                if(a[n-1]>a[n-2])
                    return n-1;
                else
                    return n-2;
            }
        }
        return 0;
    }
}