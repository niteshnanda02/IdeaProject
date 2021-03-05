package codeforcesDiv25Jan2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskB {
//    class pair{
//        long e,f;
//
//        public pair(long e, long f) {
//            this.e = e;
//            this.f = f;
//        }
//    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long x=in.nextLong();
            List<Long> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                list.add(in.nextLong());
            }
            int i=0;
            while (i<list.size()){
//                long elem=list.get(i).e;
//                long freq=list.get(i).f;
//                if (elem%x==0){
//                    sum+=elem*freq;
//                    list.add(new pair(elem/x,freq*x));
//                }else{
//                    break;
//                }
//                i++;
                if(list.get(i)%x==0){
                    for (int j = 0; j <x ; j++) {
                        list.add((list.get(i)/x));
                    }
                }
                i++;
            }
            i=0;
            long sum=0;
            while (i<list.size()){
                sum+=list.get(i);
                i++;

            }
            out.println(sum);
        }
    }
}
