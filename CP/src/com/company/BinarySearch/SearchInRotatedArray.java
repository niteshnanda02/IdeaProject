package com.company.BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{4,5,6,7,0,1,2},0));
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int pivot=0;
        int n=nums.length;
        int s=0,e=n-1;
        pivot=getPivot(nums,s,e,n);
        int F=binary(nums,s,pivot-1,target);
        int S=binary(nums,pivot,e,target);
        if(F==-1&&S==-1)
            return -1;
        else if(F==-1)
            return F;
        else
            return S;

    }
    private int binary(int[] nums,int s,int e,int target){
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]==target)
                return m;
            else if(nums[m]<target)
                s=m+1;
            else
                e=m-1;
        }
        return -1;
    }
    private int getPivot(int[] nums,int s,int e,int n){
        while(s<=e){
            int mid=s+(e-s)/2;
            int next=(mid+1)%n;
            int prev=(mid-1+n)%n;
            if(nums[mid]<=nums[next]&&nums[mid]<=nums[prev]){
                return mid;

            }else if(nums[mid]<=nums[e]){
                e=mid-1;
            }else if(nums[mid]>=nums[s]){
                s=mid+1;
            }
        }
        return 0;
    }
}