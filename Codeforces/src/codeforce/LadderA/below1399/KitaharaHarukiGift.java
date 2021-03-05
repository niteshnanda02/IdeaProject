package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class KitaharaHarukiGift {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        long sum = 0;
        int hund=0,two=0;
        for (int i = 0; i < n; i++) {
            int v=in.nextInt();
            sum += v;
            if (v==100)
                hund++;
            else
                two++;
        }
        if(sum%100!=0)
            out.println("NO");
        else {
            sum/=2;
            while (sum>0){
                if (two>0&&sum%200==0) {
                    sum -= 200;
                    two--;
                }
                else if (hund>0&&sum%100==0){
                    sum-=100;
                    hund--;
                }else
                    break;
            }
            if (sum==0)
                out.println("YES");
            else
                out.println("NO");
        }

    }

}
