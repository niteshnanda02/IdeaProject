package codeforces29July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            if (s.length()==2)
                out.print(0);
            else if(s.length()==3){
                if(s.charAt(0)==s.charAt(2))
                    out.print(1);
                else
                    out.print(1);
            }else {
                int l1=0,l2=1;
                int r1=s.length()-1,r2=s.length()-2;
                //right;
                while (1<r2){
                    if(s.charAt(l1)==s.charAt(r2)&&s.charAt(l2)==s.charAt(r1)){
                        break;
                    }
                    r2--;
                    r1--;
                }
                int f;
                if(r1<s.length()-1)
                    f=s.length()-r1+1;
                else
                    f=0;
                out.println(f);
                //left;
                while (l1<s.length()-2){
                    if(s.charAt(l1)==s.charAt(r2)&&s.charAt(l2)==s.charAt(r1)){
                        break;
                    }
                    l1++;
                    l2++;
                }
                out.println(l1);
                f=Math.min(f,l1);

                out.println(f);
            }
        }
    }
}
