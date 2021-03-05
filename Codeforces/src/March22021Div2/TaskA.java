package March22021Div2;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Stack;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            String dummy=s;
            dummy=dummy.replace('A','(');
            dummy=dummy.replace('B','(');
            dummy=dummy.replace('C',')');
            if(balance(dummy)){
                out.println("YES");
            }
            dummy=s;
            dummy=dummy.replace('A','(');
            dummy=dummy.replace('B',')');
            dummy=dummy.replace('C','(');
            if(balance(dummy)){
                out.println("YES");
            }
            dummy=s;
            dummy=dummy.replace('B','(');
            dummy=dummy.replace('A','(');
            dummy=dummy.replace('C',')');
            if(balance(dummy)){
                out.println("YES");
            }

            dummy=dummy.replace('B','(');
            dummy=dummy.replace('A',')');
            dummy=dummy.replace('C','(');
            if(balance(dummy)){
                out.println("YES");
            }
            dummy=s;
            dummy=dummy.replace('C','(');
            dummy=dummy.replace('A','(');
            dummy=dummy.replace('B',')');
            if(balance(dummy)){
                out.println("YES");
            }

            dummy=s;
            dummy=dummy.replace('C','(');
            dummy=dummy.replace('A',')');
            dummy=dummy.replace('B','(');
            if(balance(dummy)){
                out.println("YES");
            }
            else
                out.println("NO");
        }
    }
    boolean balance(String s){
        Stack<Character> stack=new Stack<>();
        for (char x:
             s.toCharArray()) {
            if(x=='(')
                stack.push(x);

            else if(s.isEmpty())
                return false;

            else if(stack.peek()=='('&&x==')')
                stack.pop();
            else
                return false;

        }
        if(s.isEmpty())
            return true;
        else
            return false;
    }
}
