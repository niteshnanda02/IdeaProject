package codeforce7june;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            boolean f1=false,f2=false;
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
                if (b[i]==0)
                    f1=true;
                if (b[i]==1)
                    f2=true;
            }

            boolean f=true;
            for (int i = 1; i <n ; i++) {
                if (a[i-1]>a[i]){
                    f=false;
                    break;
                }
            }
            if ((f1&&f2)||f)
                out.println("Yes");
            else
                out.println("No");

        }
    }


}
