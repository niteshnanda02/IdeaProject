package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Stack;

public class Plugin {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.nextString();
        Stack<Character> stack=new Stack<>();
        for (char ch:s.toCharArray()) {
            if (!stack.isEmpty()&&stack.peek()==ch){
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        for (int i = 0; i <stack.size() ; i++) {
            out.print(stack.get(i));
        }
    }
}
