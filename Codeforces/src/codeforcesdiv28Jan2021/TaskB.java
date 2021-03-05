package codeforcesdiv28Jan2021;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long[] a=in.nextLongArray(n);
            long hill=0,valley=0;
            boolean hvh=false,vhv = false,hv=false,vh=false;
            int hv1=0,hv2=0,vh1=0,vh2=0;
            if(n<5){
                out.println(0);
                continue;
            }
            for (int i = 0; i <n ; i++) {
                if(n-i>=5&&a[i]<a[i+1]&&a[i+1]>a[i+2]&&a[i+2]<a[i+3]&&a[i+3]>a[i+4]){
                    hvh=true;
                    a[i+2]= Math.max(a[i+1],a[i+2]);
                    break;
                }else if(n-i>=5&&a[i]>a[i+1]&&a[i+1]<a[i+2]&&a[i+2]>a[i+3]&&a[i+3]<a[i+4]){
                    vhv=true;
                    a[i+2]= Math.min(a[i+1],a[i+2]);
                    break;
                }else if(n-i>=4&&a[i]<a[i+1]&&a[i+1]>a[i+2]&&a[i+2]<a[i+3]){
                    hv=true;
                    hv1=i+1;
                    hv2=i+2;
                }else if(n-i>=4&&a[i]>a[i+1]&&a[i+1]<a[i+2]&&a[i+2]>a[i+3]){
                    vh=true;
                    vh1=i+1;
                    vh2=i+2;
                }
            }
            if(!hvh&&!vhv){
                if(hv){
                    long[] temp= Arrays.copyOf(a,n);
                    temp[hv1]=Math.min(a[hv1-1],a[hv1+1]);
                    int t1=count(temp);
                    temp= Arrays.copyOf(a,n);
                    temp[hv2]=Math.max(a[hv2-1],a[hv2+1]);
                    int t2=count(temp);
                    out.println(Math.min(t2,t1));
                }else if(vh){
                    long[] temp= Arrays.copyOf(a,n);
                    temp[vh1]=Math.min(a[vh1-1],a[vh1+1]);
                    int t1=count(temp);
                    temp= Arrays.copyOf(a,n);
                    temp[vh2]=Math.max(a[vh2-1],a[vh2+1]);
                    int t2=count(temp);
                    out.println(Math.min(t2,t1));

                }else {
                    out.println(Math.max(0,count(a)-1));
                }
            }
            else{
                out.println(count(a));
            }
        }
    }
    int count(long[] a){
        int h=0,v=0;
        for (int i = 1; i < a.length-1; i++) {
            if(a[i]>a[i+1]&&a[i]>a[i-1])
                h++;
            if(a[i]<a[i+1]&&a[i]<a[i-1])
                v++;
        }
        return h+v;
    }
}
