package com.company.graph.Question;
import java.util.*;
public class StepsByKnight {
    static boolean[][] vis=new boolean[21][21];
    static int[] x={-2,-1,1,2,2,1,-1,-2};
    static int[] y={1,2,2,1,-1,-2,-2,-1};

    private static class pair{
        int x,y,dis;

        public pair(int x, int y, int dis) {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    public static void main (String[] args)
    {
        //code

        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            for(boolean[] a:vis){
                Arrays.fill(a,false);
            }

            pair knight=new pair(s.nextInt(),s.nextInt(),0);
            pair destination=new pair(s.nextInt(),s.nextInt(),0);

            System.out.println(solve(knight,destination,n));
        }
    }

    private static int solve(pair knight, pair destination, int n) {
        if(knight.x==destination.x&&knight.y==destination.y)
            return knight.dis;
        Queue<pair> queue=new LinkedList<>();
        queue.add(knight);
        vis[knight.x][knight.y]=true;
        while (!queue.isEmpty()){
            pair rv=queue.remove();
            if(rv.x== destination.x&&rv.y==destination.y)
                return rv.dis;

            for (int i = 0; i <8 ; i++) {
                int nx=rv.x+x[i];
                int ny=rv.y+y[i];
                if(isValid(nx,ny,n)&&!vis[nx][ny]){
                    vis[nx][ny]=true;
                    queue.add(new pair(nx,ny,rv.dis+1));
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    private static boolean isValid(int nx, int ny, int n) {
        if(nx<=0||nx>n||ny<=0||ny>n)
            return false;

        return true;
    }

}