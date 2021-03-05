package codeforces17Dec2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long[] pos=new long[n+1];
            long[] time=new long[n+1];
            time[n]=2000000000;
            for (int i = 0; i <n ; i++) {
                time[i]=in.nextLong();
                pos[i]=in.nextLong();
            }

            long currTime=0,currPos=0,arrayPos=0;
            long ans=0;
            int dir=-1;
            for (int i = 0; i <n ; i++) {
                if (currTime<=time[i]){
                    currTime=time[i];
                    currTime+=Math.abs(currPos-pos[i]);
                    if (currPos>pos[i]){
                        dir=-1;
                    }else
                        dir=1;
                    currPos=pos[i];
                }


                long afterTime=time[i+1]-time[i];
                long prev = arrayPos;
                arrayPos+=  dir*afterTime;

                if(dir == -1)
                {
                    arrayPos = Math.max(arrayPos, currPos);
                }
                else {
                    arrayPos = Math.min(arrayPos, currPos);
                }
                if((pos[i]>=arrayPos && pos[i] <= prev) || (pos[i]<=arrayPos && pos[i] >= prev))
                {
                    ans++;
                }

            }
            out.println(ans);
        }
    }
}
