package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt(),z=0,o=0;
            int[] a = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                a[i] = in.nextInt();
                if(a[i]==0)
                    z++;
                else
                    o++;
            }
            if(z>=o){
                out.println(z);
                for (int i = 0; i <z ; i++) {
                    out.print(0+" ");
                }
            }else if(z<o){
                if(o%2!=0)
                    o--;
                out.println(o);
                for (int i = 0; i <o ; i++) {
                    out.print(1+" ");
                }
            }
            out.println();

        }
    }
}
