package codeforces21Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a;
            a=in.nextIntArray(n);

            int[] sort=new int[n];
            for (int i = 0; i <n ; i++) {
                sort[i]=a[i];
            }
            Arrays.sort(sort);
            int min=sort[0];
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                if(sort[i]!=a[i])
                    list.add(a[i]);
            }
            boolean res=true;
            for (int i = 0; i <list.size() ; i++) {
                if(gcd(min, list.get(i))!=min){
                    res=false;
                    break;
                }
            }
            if (res)
                out.println("YES");
            else
                out.println("NO");

        }
    }
    private static int gcd(int a,int b){

        if (b==0)
            return a;

        return gcd(b,a%b);
    }
}
