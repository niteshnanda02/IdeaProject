package com.company;

import java.util.Scanner;

public class Main {
        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
	// write your code here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int n;


        for (int j = 1; j <=t; j++) {
             n=s.nextInt();
            boolean flag=isPrime(n);
            if(flag){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }

        }
    }
}
