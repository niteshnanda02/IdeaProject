package com.company.NumberTheory.Learning;

public class gcd {
    public static void main(String[] args) {
        int a=4,b=5;
        System.out.println(Gcd(a,b));
        System.out.println(a*b/Gcd(a,b));
    }

    private static int Gcd(int a, int b) {
        if(b==0)
            return a;
        return Gcd(b,a%b);
    }
}
