package com.company.NumberTheory.Question;
import java.util.*;
import java.util.Scanner;

public class BachGoldProblem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        List<Integer> list=new ArrayList<>();
        int i=2;
        while (i<=n){
            if (isprime(i)){
                n-=i;
                list.add(i);
            }else
                i++;
        }
        System.out.println(list.size());
        for (Integer in:list
             ) {
            System.out.print(in+" ");
        }
        System.out.println();
    }
    private static boolean isprime(int n){
        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
