package codeForces5Feb2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int x=in.nextInt(),y=in.nextInt();
            String s=in.nextString();
            char a='\0',b = '\0';
            int acount=Math.abs(x),bcount=Math.abs(y);
            if(x>=0&&y>=0){
                a='R';
                b='U';
            }else if(x<=0&&y>=0){
                a='L';
                b='U';
            }else if(x<=0&&y<=0){
                a='L';
                b='D';
            }else if(x>=0&&y<=0){
                a='R';
                b='D';
            }
            for (int i = 0; i <s.length() ; i++) {
                char ch=s.charAt(i);
                if(ch==a)
                    acount--;
                if(ch==b)
                    bcount--;
            }
            if(acount<=0&&bcount<=0)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
