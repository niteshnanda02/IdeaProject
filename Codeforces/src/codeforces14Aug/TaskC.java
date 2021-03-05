package codeforces14Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=new int[n+1];
            for (int i = 1; i <=n ; i++) {
                a[i]=in.nextInt();
            }
            int[] pre=new int[n+1];
            pre[1]=a[1];
            for (int i = 2; i <=n ; i++) {
                pre[i]=pre[i]+pre[i-1];
            }
            for (int i = 1; i <=n ; i++) {
                if(a[i]==0){

                }else {
                    if(a[i]<i){
                        for (int j = a[i]; j >=1 ; j++) {

                        }
                    }
                }
            }
        }
    }
}
