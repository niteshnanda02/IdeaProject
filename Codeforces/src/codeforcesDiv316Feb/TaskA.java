package codeforcesDiv316Feb;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            double[] a=new double[n];
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextDouble();
            }
            int c=0;
            for (int i = 0; i <n-1 ; i++) {
                double max=Math.max(a[i],a[i+1]),min=Math.min(a[i],a[i+1]);
                while ((max/min)>2.0){
                    min*=2;
                    c++;
                }
            }
            out.println(c);
        }
    }
}
