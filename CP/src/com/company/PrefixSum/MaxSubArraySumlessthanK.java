package com.company.PrefixSum;

public class MaxSubArraySumlessthanK {
    public static void main(String[] args) {
        int[] a={ 1, 2, 3,4 };
        int k=5;
        System.out.println(maxSize(a,k,a.length));
    }

    private static int maxSize(int[] a, int k, int n) {
        int[] prefixSum=new int[n+1];
        for (int i = 0; i <n ; i++) {
            prefixSum[i + 1] = prefixSum[i] + a[i];
        }
        return bsearch(prefixSum,n,k);
    }

    private static int bsearch(int[] prefixSum, int n, int k) {
        int left=1,right=n;
        int ans=-1;
        while (left<=right){
            int mid=(left+right)/2;
            int i;
            for (i = mid; i <=n ; i++) {
                if (prefixSum[i]-prefixSum[i-mid]>k){
                    break;
                }
            }

            if (i==n+1){
                left=mid+1;
                ans=mid;
            }
            else
                right=mid-1;
        }
        return ans;
    }
}
