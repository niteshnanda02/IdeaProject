package com.company.Questions;

import java.util.HashSet;
import java.util.Scanner;

public class SquareCount {
    private static class pair{
        int x,y;

        public pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        pair[] pairs=new pair[n];
        for (int i = 0; i <n ; i++) {
            pairs[i]=new pair(s.nextInt(),s.nextInt());
        }
        System.out.println(SquareCount(pairs));
    }
    public static int SquareCount(pair[] input)
    {
        int count = 0;
        HashSet<pair> set=new HashSet<>();
        for (pair p:input
             ) {
            set.add(p);
        }

        for (int i = 0; i < input.length; i++)
        {
            for (int j = 0; j < input.length; j++)
            {
                if (i == j)
                    continue;
                //For each Point i, Point j, check if b&d exist in set.
                pair[] DiagVertex = GetRestPints(input[i], input[j]);
                if (set.contains(DiagVertex[0]) && set.contains(DiagVertex[1]))
                {
                    count++;
                }
            }
        }
        return count;

    }

    public static pair[] GetRestPints(pair a, pair c)
    {
        pair[] res = new pair[2];

        int midX = (a.x + c.y) / 2;
        int midY = (a.y + c.y) / 2;

        int Ax = a.x - midX;
        int Ay = a.y - midY;
        int bX = midX - Ay;
        int bY = midY + Ax;
        pair b = new pair(bX,bY);

        int cX =  (c.x - midX);
        int cY =  (c.y - midY);
        int dX = midX - cY;
        int dY = midY + cX;
        pair d = new pair(dX,dY);

        res[0] = b;
        res[1] = d;
        return res;
    }
}
