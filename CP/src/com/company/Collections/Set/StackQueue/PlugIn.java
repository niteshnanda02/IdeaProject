package com.company.Collections.Set.StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class PlugIn {
    public static void main(String[] args) throws IOException {
        Scanner reader=new Scanner(System.in);
        String s=reader.nextLine();
        Stack<Character> stack=new Stack<>();
        for (char ch:s.toCharArray()) {
            if (!stack.isEmpty()&&stack.peek()==ch){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        for (int i = 0; i <stack.size() ; i++) {
            System.out.print(stack.get(i));
        }
    }
}
