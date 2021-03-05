package com.company.Array.Questions;

import java.util.Scanner;
import java.util.Vector;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Vector<Integer> vector=new Vector<>();
        for (int i = 0; i <n ; i++) {
            int p=s.nextInt(),q=s.nextInt();
            vector.add(q-p);
        }
        int c=0;
        for (int i = 0; i <n ; i++) {
            if (vector.get(i)>1)
                c++;
        }
        System.out.println(c);
    }
}
