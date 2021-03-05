package com.company.NumberTheory.Learning;

public class PrimeFactorization {
    //O(sqrt(n))
    static void primeFactor(int N){

        for (int i = 2; i*i <=N ; i++) {
            if (N%i==0){
                int cnt=0;
                while (N%i==0) {
                    cnt++;
                    N /= i;
                }
                System.out.println(i+"^"+cnt);
            }
        }
        if (N>1){
            System.out.println(N+"^"+1);
        }
    }
    public static void main(String[] args) {
        primeFactor(26);
    }
}
