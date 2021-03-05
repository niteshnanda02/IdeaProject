package com.company.Questions;

import java.util.*;

public class vivek2 {
    public static void main(String[] args) {

        Deque<Integer> deque=new LinkedList<>();

        String[] a={"Facebook","Google","Facebook","Google","Apple","Zen","Zen","Zen"};
        process(4);
    }

    private static void process(int n) {
        int i,j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }


}
