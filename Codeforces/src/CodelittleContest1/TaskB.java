package CodelittleContest1;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=in.nextIntArray(n);
        int max= Arrays.stream(a).max().getAsInt();
        int[] count=new int[max+1];
        for (int i = 0; i <n ; i++) {
            count[a[i]]++;
        }
        int c=0,v=0,d=0;
        for (int i = 0; i <max+1 ; i++) {
            if (v==0&&count[i]!=0){
                if(count[i]%2!=0)
                    v=i;
            }else if (count[i]!=0){
                if(count[i]%2!=0) {
                    d = i - v;
                    v=0;
                    c+=d;
                }
            }
        }
        out.println(c);
    }
}
