package codeforces24Oct;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[][] a=new int[n][n];
            for (int[] d:a
                 ) {
                Arrays.fill(d,1);
            }
            int orig=n-1,te=n;
            boolean temp=true;
            while (temp){
                if(ifPrime(te)&&!ifPrime(te-orig)){
                    orig=te-orig;
                    temp=false;
                }else {
                    te++;
                }
            }
            for (int i = 0; i <n ; i++) {
                a[i][i]=orig;
            }

            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    out.print(a[i][j]+" ");
                }
                out.println();
            }
        }
    }
    static boolean ifPrime(int n){
        if(n<2)
            return false;
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
