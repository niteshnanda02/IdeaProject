package com.company.Questions;
import java.util.*;
public class decodeString {
    public static String decodeString(String s) {
        String ans="";
        Stack<Integer> num=new Stack<>();
        Stack<String> str=new Stack();
        str.push("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                str.push(str.pop()+ch);
            }else if(ch>='1'&&ch<='9'){
                num.push(ch-'0');
            }else if(ch=='['){
                str.push("");
            }else {
                String st=str.pop();
                StringBuilder sb=new StringBuilder();
                int n=num.pop();
                for (int j = 0; j <n ; j++) {
                    sb.append(st);
                }
                str.push(str.pop()+sb.toString());
            }
        }
        return str.pop();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("abc3[cd]xyz"));
    }
}
