package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dragons {
    class  Drag{
        int x;
        int y;

        public Drag(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Drag{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int s=in.nextInt(),n=in.nextInt();
        ArrayList<Drag> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(new Drag(in.nextInt(),in.nextInt()));
        }
        Collections.sort(list, new Comparator<Drag>() {
            @Override
            public int compare(Drag drag, Drag t1) {
                return drag.x-t1.x;
            }
        });
        boolean flag=true;
        for (int i = 0; i <n ; i++) {
            int x=list.get(i).x;
            if (s>x){
                s+=list.get(i).y;
            }else {
                flag=false;
                break;
            }
        }
        if (!flag)
            out.println("NO");
        else
            out.println("YES");
    }
}
