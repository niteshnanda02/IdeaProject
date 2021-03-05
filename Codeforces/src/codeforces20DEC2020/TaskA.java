package codeforces20DEC2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-- > 0) {
            int n=in.nextInt();
            String s=in.next();
            int count=0;
            for (int i = n-1; i >=0 ; i--) {
                char ch=s.charAt(i);
                if(ch==')')
                    count++;
                else
                    break;
            }
            int r=n-count;
            if(count>r){
                out.println("Yes");
            }else
                out.println("No");

        }
    }
}
