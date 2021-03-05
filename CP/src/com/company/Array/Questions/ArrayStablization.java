package com.company.Array.Questions;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ArrayStablization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < n; i++) {
            vector.add(s.nextInt());
        }
        Collections.sort(vector);
        int ans;
        if (n == 1) {
            ans = vector.get(0);
        } else {
            ans =Math.min(vector.get(vector.size() - 2) - vector.get(0),
                        vector.get(vector.size()-1)-vector.get(1));

        }
        System.out.println(ans);
    }
}
