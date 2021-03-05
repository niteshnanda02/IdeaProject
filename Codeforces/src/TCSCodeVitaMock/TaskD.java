package TCSCodeVitaMock;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String l=in.readLine();
        String[] a=l.split(" ");
        int[] inp=new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            inp[i]=Integer.parseInt(a[i]);
        }

        Arrays.sort(inp);
        out.print(Arrays.toString(inp));
        int n=inp.length;
        long one=inp[n-1],two=inp[n-2];
        for (int i = n-3; i >=0 ; i--) {
            if(one<two){
                one+=inp[i];
            }else
                two+=inp[i];
        }
        out.print(one+" "+two);
        long ans=Math.max(one,two);
        out.print(ans);
    }
}
