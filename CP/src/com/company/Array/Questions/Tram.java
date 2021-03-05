package com.company.Array.Questions;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Tram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Vector<Integer> vector=new Vector<>();
        for (int i = 0; i <n ; i++) {
            int l=s.nextInt(),e=s.nextInt();
            if (i==0){
                vector.add(e);
                continue;
            }
            vector.add(vector.get(i-1)-l+e);
        }
        int max=Collections.max(vector);
        System.out.println(max);
    }
}
