package com.company.recursion.questions;

import java.util.Stack;

public class ReverseAStack {
    private static void reverseStack(Stack<Integer> s){
        if (s.isEmpty())
            return;
        int item=s.pop();
        reverseStack(s);
        insert(s,item);
    }

    private static void insert(Stack<Integer> s, int item) {
        if(s.isEmpty()){
            s.push(item);
            return;
        }
        int val=s.pop();
        insert(s,item);
        s.push(val);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        reverseStack(s);
        System.out.println(s);
    }
}
