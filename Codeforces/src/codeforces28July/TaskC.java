package codeforces28July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Stack;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            String s=in.nextString();
            Stack<Character> stack=new Stack<>();
            for (int i = 0; i <n ; i++) {
                char cc=s.charAt(i);
                if (!stack.isEmpty()&&stack.peek()=='('&&cc==')'){
                    stack.pop();
                }else
                    stack.push(cc);
            }
            out.println(stack.size()/2);
        }
    }
}
