package codeforces6Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskC {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),k=in.nextInt();
            String s=in.nextString();
            StringBuilder builder=new StringBuilder(s);
            for (int i = 0; i <k ; i++) {
                if(builder.charAt(i)=='?'){
                    for (int j = i+k; j <n ; j+=k) {
                        if(builder.charAt(j)!='?'){
                            builder.setCharAt(i,builder.charAt(j));
                            break;
                        }
                    }
                }
            }
            boolean temp=false;
            for (int i = 0; i <k ; i++) {
                if(builder.charAt(i)!='?'){
                    for (int j = i+k; j <n ; j+=k) {
                        if(builder.charAt(j)=='?')
                            builder.setCharAt(j,builder.charAt(i));
                        else if(builder.charAt(i)!=builder.charAt(j)){
                            temp=true;
                            break;
                        }
                    }
                }
                if(temp)
                    break;
            }
            if(temp){
                out.println("NO");
                continue;
            }
            int o=0,z=0;
            for (int i = 0; i <k ; i++) {
                if(builder.charAt(i)=='0')
                    z++;
                else if(builder.charAt(i)=='1')
                    o++;
            }

            if(o<=k/2&&z<=k/2)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
