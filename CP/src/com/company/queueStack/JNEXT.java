package com.company.queueStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class JNEXT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            char[] line = br.readLine().toCharArray();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < line.length; i++) {
                if (line[i] >= '0' && line[i] <= '9')
                    stack.push(line[i]-'0');
            }
            int top = stack.peek();
            Stack<Integer> store = new Stack<>();
            store.add(top);
            stack.pop();
            while (!stack.isEmpty() && stack.peek() > top) {
                top = stack.peek();
                store.add(top);
                stack.pop();
            }
            if (stack.isEmpty())
                System.out.println(-1);
            else {
                int curr = stack.peek();
                stack.pop();
                while (!store.isEmpty()) {
                    stack.push(store.peek());
                    store.pop();
                }
                stack.push(curr);

                for (int i = 0; i < stack.size(); i++) {
                    System.out.print(stack.get(i));
                }
                System.out.println();
            }


        }
    }
}
