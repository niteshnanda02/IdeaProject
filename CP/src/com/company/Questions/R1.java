package com.company.Questions;

public class R1 {
    public static void main(String[] args) {
        solve(3,2,new int[]{1,4,15});
    }

    private static void solve(int n, int k, int[] arr) {
        int ans=Integer.MAX_VALUE;
        int low=1,high=arr[arr.length-1];
        while (low<=high){
            int mid=low+(high-low)/2;
            ans=Math.min(mid,ans);
            int start=mid-k,end=mid+k;
            if(k>=0){
                high=mid;
            }
        }

        System.out.println(ans);
    }
}
