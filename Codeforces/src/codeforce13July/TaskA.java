package codeforce13July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),x=in.nextInt();
            int[] a=new int[n];
            long sum=0;
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextInt();
                sum+=a[i];
            }
            if (sum%x!=0){
                out.println(n);
            }else {
                long max=0;
                long temp=sum;
                for (int i = 0; i <n ; i++) {
                    if (temp%x!=0){
                        max=Math.max(max,n-i);
                        break;
                    }
                    temp-=a[i];

                }
                temp=sum;
                for (int i = n-1; i >=0 ; i--) {
                    if (temp%x!=0){
                        max=Math.max(max,i+1);
                        break;
                    }
                    temp-=a[i];

                }
                temp=sum;
                int i=0,j=n-1;
                while (i<j){

                    temp-=a[i];
                    if (temp%x!=0){
                        max= Math.max(max,j-i);
                    }
                    temp-=a[j];
                    if (temp%x!=0){
                        max= Math.max(max,j-i);
                    }
                    i++;
                    j--;
                }
                if (i==j){
                    if (a[i]%x!=0){
                        max=Math.max(max,1);
                    }
                }
                if (max!=0)
                out.println(max);
                else
                    out.println(-1);
            }
        }
    }
}
