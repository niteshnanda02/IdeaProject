package com.company.BinarySearch;

public class SqrRoot {
    public static void main(String[] args) {
        System.out.println(root(50,3));
    }

    private static float root(int num, int precision) {
        int s=0,e=num;
        double ans=0.0;
        while (s<=e) {
            int mid = (s + e) / 2;
            int elem = mid * mid;
            if (elem == num)
                ans = mid;
            else if (elem < num) {
                s = mid + 1;
                ans = mid;
            } else
                e = mid - 1;

        }
        double increment=0.1;
        for (int i = 0; i <precision ; i++) {
            while (ans*ans<=num){
                ans+=increment;
            }
            ans-=increment;
            increment/=10;
        }
        return (float) ans;
    }

}
