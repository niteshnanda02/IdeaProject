package codeforces11Oct2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            int a = 0, b = 0, c = 0;
            boolean temp = true;
            if (n % 3 == 0) {
                a = n / 3;
            } else if (n % 5 == 0) {
                b = n / 5;
            } else if (n % 7 == 0) {
                c = n / 7;
            } else {
                int f=n-3,s=n-5,th=n-7;
                if(f>0&&f%5==0){
                    a=1;
                    b=f/5;
                }else if(f>0&&f%7==0){
                    a=1;
                    c=f/7;
                }else if(s>0&&s%3==0){
                    b=1;
                    a=s/3;
                }else if(s>0&&s%7==0){
                    b=1;
                    c=s/7;
                }else if(th>0&&th%3==0){
                    c=1;
                    a=th/3;
                }else if(th>0&&th%5==0){
                    c=1;
                    b=th/5;
                }else {
                    temp=false;
                }
            }
            if (temp)
                out.println(a + " " + b + " " + c);
            else
                out.println(-1);
        }
    }
}
