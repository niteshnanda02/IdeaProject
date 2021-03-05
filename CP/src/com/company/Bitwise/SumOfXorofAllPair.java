package com.company.Bitwise;

public class SumOfXorofAllPair {
    public static long sumXOR (int arr[], int n) {
        //Complete the function
        long res=0;

        for(int i=0;i<31;i++){
            int cntZ=0,cntO=0;
            int num=1<<i;

            for(int j=0;j<n;j++){
                if((arr[j]&num)==1)
                    cntO++;
                else
                    cntZ++;
            }
            int p=cntO*cntZ;

            res+=p*(1<<i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={5,3,9};
        System.out.println(sumXOR(a,a.length));
    }

}
