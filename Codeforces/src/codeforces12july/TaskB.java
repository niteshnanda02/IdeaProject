package codeforces12july;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            char ch='\0';
            boolean flag=false;
            for (int i = 1; i <s.length() ; i++) {
                if(s.charAt(i-1)==s.charAt(i)){
                    ch=s.charAt(i);
                }else {
                    flag=true;
                    break;
                }
            }
            if (flag)
                out.println(s);
            else {
                if(ch=='R'){
                    for (int i = 0; i <s.length() ; i++) {
                        out.print("P");
                    }
                }
                else if(ch=='P'){
                    for (int i = 0; i <s.length() ; i++) {
                        out.print("S");
                    }
                }else {
                    for (int i = 0; i <s.length() ; i++) {
                        out.print("R");
                    }
                }
                out.println();

            }
        }

    }
}
