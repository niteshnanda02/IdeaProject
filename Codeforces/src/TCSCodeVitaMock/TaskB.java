package TCSCodeVitaMock;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        List<Integer> list=new ArrayList<>();
        List<Integer> even=new ArrayList<>(10);
        for (int i = 0; i <10 ; i++) {
            even.add(0);
        }
        List<Integer> odd=new ArrayList<>(10);
        for (int i = 0; i <10 ; i++) {
            odd.add(0);
        }
        for (int i = 0; i <n ; i++) {
            int v=in.nextInt();
            int f=v%10;
            int val=Math.max(f,Math.max(v/100,(v/10)%10))*11+Math.min(f,Math.min(v/100,(v/10)%10))*7;
            val%=100;
            list.add(val);
            int ind;
            ind=val / 10;
            if (i%2==0) {
                int va=even.get(ind);
                even.set(ind, va + 1);
            }else{
                int va=odd.get(ind);
                odd.set(ind,va+1);
        }}

        int ans=0;
        for (int i = 0; i <10 ; i++) {
            if(even.get(i)>2||odd.get(i)>2)
                ans+=2;
            else if(even.get(i)==2&&odd.get(i)==2)
                ans+=2;
            else if(even.get(i)==2||odd.get(i)==2)
                ans++;
        }
        out.print(ans);

    }
}
