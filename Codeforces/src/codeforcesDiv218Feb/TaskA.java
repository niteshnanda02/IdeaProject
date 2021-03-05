package codeforcesDiv218Feb;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            boolean temp=true;
            int prev=a[0];
            for (int i = 1; i <n ; i++) {

                if(prev>=a[i]){
                    if(prev==0){
                        temp=false;
                        break;
                    }else{
                        a[i]++;
                    }
                }

                prev=a[i];
                if(prev==0){
                    temp=false;
                    break;
                }
            }

            if(temp)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
