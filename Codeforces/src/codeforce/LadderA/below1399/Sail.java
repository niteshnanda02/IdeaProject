package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class Sail {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t=in.nextInt();
        long sx=in.nextLong(),sy=in.nextLong(),ex=in.nextLong(),ey=in.nextLong();
        String s=in.nextString();
        long dx=ex-sx,dy=ey-sy;
        if (dx==0&&dy==0){
            out.println(-1);
        }else {
            out.println(check(s,dx,dy));

        }

    }

    private long check(String s, long dx, long dy) {
        long N=0,W=0,S=0,E=0;
        for (int i = 0; i <s.length() ; i++) {
            char cc=s.charAt(i);
            if (cc=='N')
                N++;
            else if (cc=='W')
                W++;
            else if (cc=='E')
                E++;
            else if (cc=='S')
                S++;
        }
        if (dx==0){
            if (dy>0){
                if (N>=dy) {

                    return count(s,'N',dy);
                }
                else
                    return -1;
            }else {
                dy=Math.abs(dy);
                if (S>=dy)
                    return count(s,'S',dy);;
            }
        }

        if (dy==0){
            if (dx>0){
                if (E>=dx)
                    return count(s,'E',dx);
                else
                    return -1;
            }else {
                dx=Math.abs(dx);
                if (W>=dx)
                    return count(s,'W',dx);
                else
                    return -1;
            }
        }

        if (dx>0&&dy>0){
            if (E>=dx&&N>=dy)
                return Math.max(count(s,'N',dy),count(s,'E',dx));
            else
                return -1;
        }

        if(dx>0&&dy<0){
            dy=Math.abs(dy);
            if (E>=dx&&S>=dy)
                return Math.max(count(s,'S',dy),count(s,'E',dx));

            else
                return -1;
        }

        if (dx<0&&dy<0){
            dx=Math.abs(dx);
            dy=Math.abs(dy);
            if (W>=dx&&S>=dy)
                return Math.max(count(s,'S',dy),count(s,'W',dx));
            else return -1;
        }

        if (dx<0&&dy>0){
            dx=Math.abs(dx);
            if (W>=dx&&N>=dy)
                return Math.max(count(s,'N',dy),count(s,'W',dx));

            else
                return -1;
        }
        return -1;
    }

    private long count(String s, char n, long occ) {
        long j=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==n){

                occ--;
                if (occ==0) {
                    j = i+1;
                }
            }
        }
        return j;
    }

}
