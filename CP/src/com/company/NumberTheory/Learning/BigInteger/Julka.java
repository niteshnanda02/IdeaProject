package com.company.NumberTheory.Learning.BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Julka {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {

        BigInteger total=s.nextBigInteger();
        BigInteger add=s.nextBigInteger();
        add=add.divide(BigInteger.TWO);
        BigInteger klauda=total.divide(BigInteger.TWO);
        BigInteger nataila=total.divide(BigInteger.TWO);
        klauda=klauda.add(add);
        nataila=nataila.subtract(add);
        System.out.println(klauda);
        System.out.println(nataila);
        }
    }
}
