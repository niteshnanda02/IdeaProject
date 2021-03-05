package com.company.queueStack;

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Stack;

public class Jnex {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        testNumber=in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                stack.push(in.nextInt());
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
                int curr=stack.peek();
                stack.pop();
                while (!store.isEmpty()){
                    stack.push(store.peek());
                    store.pop();
                }
                stack.push(curr);

                for (int i = 0; i <stack.size() ; i++) {
                    System.out.print(stack.get(i));
                }
                System.out.println();
            }


        }
    }
}
