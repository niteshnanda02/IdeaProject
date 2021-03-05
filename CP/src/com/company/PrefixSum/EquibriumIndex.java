package com.company.PrefixSum;

public class EquibriumIndex {
    public static void main(String[] args) {
        // write your code here
        int[] a= {-7, 1, 5, 2, -4, 3, 0};

        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        int leftSum=0;
        for (int i = 0; i <a.length ; i++) {
            sum-=a[i];
            if (leftSum==sum){
                System.out.println(i);
                break;
            }
            leftSum+=a[i];
        }
    }
}
