package codeforcesdiv28Jan2021;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int max = 9;
            int i = 0;
            while(i<1)
            {
                out.print(max);
                if(max == 0)
                {
                    max = 9;
                }
                else {
                    max--;
                }
                i++;
            }

            while(i<n)
            {
                out.print(max);
                max = (max+1)%10;
                i++;
            }

            out.println();

        }
    }
}
