package com.company.StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String str = s.next();
            boolean te = check(str);
            if (te) {
                System.out.println("balanced");
            } else {
                System.out.println("not balanced");
            }

        }
    }

    private static boolean check(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '}') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '{')
                        stack.pop();
                    else
                        return false;
                } else
                    return false;
            } else if (ch == ')') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '(')
                        stack.pop();
                    else
                        return false;
                } else
                    return false;
            } else if (ch == ']') {
                if (!stack.isEmpty()) {
                    if (stack.peek() == '[')
                        stack.pop();
                    else
                        return false;
                } else
                    return false;
            } else {
                stack.push(ch);
            }
        }
        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
