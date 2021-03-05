package codeforcesDiv316Feb;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            int c1=0,c2=0,c3=0;
            for (int i = 0; i <n ; i++) {
                if(a[i]%3==0)
                    c1++;
                else if(a[i]%3==1)
                    c2++;
                else
                    c3++;
            }
            int div=n/3;
            int c=0;
            while (c1!=div||c2!=div||c3!=div){
                int max=Math.max(c1,Math.max(c2,c3));
                int min=Math.min(c1,Math.min(c2,c3));
                if(max==c1){
                    if(min==c2){
                        c++;
                        c2++;
                    }else{
                        c+=2;
                        c3++;
                    }
                    c1--;
                }else if(max==c2){
                    if(min==c3){
                        c++;
                        c3++;
                    }else {
                        c+=2;
                        c1++;
                    }
                    c2--;
                }else{
                    if(min==c1){
                        c++;
                        c1++;
                    }else{
                        c+=2;
                        c2++;
                    }
                    c3--;
                }
            }
            out.println(c);
        }
    }
}
