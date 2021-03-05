package Codeforces23Jun;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.*;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            String s = in.nextString();
            int z=0,o=0;
            boolean flag=false;
            for (int i = 1; i <s.length() ; i++) {
                if (s.charAt(i-1)=='1'&&s.charAt(i)=='0')
                    flag=true;
            }
            if (!flag)
                out.println(s);
            else {
                for (int i = 0; i <s.length() ; i++) {
                    if (s.charAt(i)=='0')
                        z++;
                    else
                        break;
                }

                for (int i = s.length()-1; i >=0 ; i--) {
                    if (s.charAt(i)=='1')
                        o++;
                    else
                        break;
                }
                for (int i = 0; i <=z ; i++) {
                    out.print("0");
                }
                for (int i = 0; i <o ; i++) {
                    out.print("1");
                }
                out.println();
            }
        }
    }
}
