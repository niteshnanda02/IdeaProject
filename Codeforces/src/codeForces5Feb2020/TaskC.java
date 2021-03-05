package codeForces5Feb2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class TaskC {
    static class pair{
        int i,c;

        public pair(int i, int c) {
            this.i = i;
            this.c = c;
        }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),m=in.nextInt();
            int[] a=in.nextIntArray(n),b=in.nextIntArray(n),c=in.nextIntArray(m);
            Map<Integer,pair> map=new HashMap<>();
            for (int i = 0; i <m ; i++) {
                if(map.containsKey(c[i])){
                    pair p=map.get(c[i]);
                    p.c++;
                    map.put(c[i],p);
                }else{
                    map.put(c[i],new pair(i,1));
                }
            }
            int[] ans=new int[m];
            boolean temp=true;
            boolean rem=true;
            for (int i = 0; i <n ; i++) {
                if(a[i]!=b[i]){
                    rem=false;
                    if(map.containsKey(b[i])){
                        pair p=map.get(b[i]);
                        ans[p.i]=i+1;
                        p.c--;
                        if(p.c==0)
                            map.remove(b[i]);
                        else
                            map.put(b[i],p);
                    }else {
                        temp=false;
                        break;
                    }
                }
            }
            if(rem){
                int index=-1;
                for (int i = 0; i <n ; i++) {
                    if(map.containsKey(a[i])){
                        index=i+1;
                        break;
                    }
                }
                if(index==-1)
                    out.println("NO");
                else{
                    for (int i = 0; i <m ; i++) {
                        if(ans[i]==0)
                            ans[i]=index;
                    }
                    out.println("YES");
                    for (int i = 0; i <m ; i++) {
                        out.print(ans[i]+" ");
                    }out.println();
                }

            }else{
                if(temp){
                    int index=0;
                    for (int i = 0; i <m ; i++) {
                        if(ans[i]!=0){
                            index=i+1;
                            break;
                        }
                    }
                    for (int i = 0; i <m ; i++) {
                        if(ans[i]==0)
                            ans[i]=index;
                    }
                    out.println("YES");
                    for (int i = 0; i <m ; i++) {
                        out.print(ans[i]+" ");
                    }out.println();
                }else {
                    out.println("NO");
                }
            }

        }
    }
}
