package com.company.StackQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class NextGreatorElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
            }
            Stack<Long> stack = new Stack<>();
            Map<Long, Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {

                while (!stack.empty() && stack.peek() < a[i]) {
                    map.put(stack.peek(), a[i]);
                    stack.pop();
                }
                stack.push(a[i]);
            }
            for (int i = 0; i <n ; i++) {
                if (map.containsKey(a[i]))
                    System.out.print(map.get(a[i])+" ");
                else
                    System.out.print("-1 ");
            }
            System.out.println();
        }
    }
}
