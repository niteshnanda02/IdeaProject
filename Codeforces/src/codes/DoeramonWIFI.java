package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class DoeramonWIFI {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String input=in.nextString();
        String output=in.nextString();
        if (!output.contains("?")){
            int inc=0,outc=0;
            for (int i = 0; i <input.length() ; i++) {
                if (input.charAt(i)=='+'){
                    inc++;
                }
                if (input.charAt(i)=='-'){
                    inc--;
                }
                if (output.charAt(i)=='+'){
                    outc++;
                }
                if (output.charAt(i)=='-'){
                    outc--;
                }
            }
            double ans=1;
            if (inc==outc){
                String a=String.format("%.12f",ans);
                out.println(a);
            }else {
                ans=0;
                String a=String.format("%.12f",ans);
                out.println(a);
            }

        }
        else {
            int ques=0;
            int inc=0,outc=0;
            for (int i = 0; i <input.length() ; i++) {
                if (input.charAt(i) == '+') {
                    inc++;
                }
                if (input.charAt(i) == '-') {
                    inc--;
                }
                if (output.charAt(i)=='+'){
                    outc++;
                }
                if (output.charAt(i)=='-'){
                    outc--;
                }
                if (output.charAt(i)=='?'){
                    ques++;
                }
            }
            int diff=Math.abs(inc-outc);
            int c=ques;
            int i=0;
            if (diff>c){
                double ans=0;
                String a=String.format("%.12f",ans);
                out.println(a);

            }else {
                for (i = c; i >= 0; i -= 2) {
                    if (diff == i) {
                        break;
                    }
                    c--;
                }
                double v1 = factorial(ques);
                double v2 = factorial(c);
                double v3 = factorial(ques - c);
                double ans = v1 / (v2 * v3);
                double div = Math.pow(2, ques);
                ans = ans / div;
                String a=String.format("%.12f",ans);
                out.println(a);
            }
        }
    }
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
}
