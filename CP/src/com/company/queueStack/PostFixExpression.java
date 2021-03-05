package com.company.queueStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;

public class PostFixExpression {
    public static int evaluatePostFix(String S){
        // Your code here
        List<Integer> l=new ArrayList<>();
        Collections.sort(l, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        });
        Stack<Integer> stack=new Stack<>();
        for(char x:S.toCharArray()){
            if(x>='0'&&x<='9')
                stack.push(x-'0');
            else{
                int a=stack.pop(),b=stack.pop();
                if(x=='*'){
                    stack.push(b*a);
                }else if(x=='/'){
                    stack.push(b/a);
                }else if(x=='+'){
                    stack.push(b+a);
                }else{
                    stack.push(b-a);
                }
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(evaluatePostFix("231*+9-"));
    }
}
