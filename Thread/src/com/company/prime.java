package com.company;

import java.util.Scanner;

public class prime {
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
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int N=0;

        for (int i = 0; i <n ; i++) {
            if (s.hasNextInt()) {
                N = s.nextInt();
                s.nextLine();
            }
            boolean flag=isPrime(N);
            if(flag){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }

        }
    }
}
