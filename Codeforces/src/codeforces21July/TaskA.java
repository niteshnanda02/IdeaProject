package codeforces21July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int m=in.nextInt();
            int[] a=in.nextIntArray(n);
            int[] b=in.nextIntArray(m);
            boolean flag=false;
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    if(a[i]==b[j]){
                        flag=true;
                        out.println("YES");
                        out.println("1 "+a[i]);
                        break;
                    }
                }
                if (flag)
                    break;
            }
            if(!flag)
                out.println("NO");
        }
    }
}
