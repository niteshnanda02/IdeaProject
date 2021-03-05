package codeforce28May;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt(), m = in.nextInt(), x = in.nextInt(), y = in.nextInt();
            int ans = 0;
            int tem=0,w=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    char c=in.nextCharacter();
                    if (c == '.') {
                        tem++;
                        w++;
                    }else
                        tem=0;
                    if(tem==2){
                        ans++;
                        tem=0;
                    }
                }
                tem=0;
            }
            if(x*2<y){
                out.println(w*x);
            }else
                out.println((w-ans*2)*x+ans*y);


        }
    }
}
