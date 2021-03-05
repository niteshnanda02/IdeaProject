package com.company.graph.Question;
import java.util.*;
public class FloodFill {
    public static void main(String[] args) {
        int[][] a=new Solution().floodFill(new int[][]{{0,0,0},{0,0,0}},0,0,2);
        for (int[] b:a
             ) {
            System.out.println(Arrays.toString(b));
        }
    }
}
class Solution {
    static class p{
        int x,y;
        p(int a,int b){
            x=a;
            y=b;
        }
    }
    int[] x={0,1,0,-1};
    int[] y={1,0,-1,0};
    static boolean[][] vis=new boolean[52][52];
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image==null||image.length==0)
            return image;
        int n=image.length,m=image[0].length;
        for(boolean[] a:vis){
            Arrays.fill(a,false);
        }
        Queue<p> q=new LinkedList<>();
        int old=image[sr][sc];
        q.add(new p(sr,sc));

        image[sr][sc]=newColor;
        while(!q.isEmpty()){
            p rv=q.remove();

            for(int i=0;i<4;i++){
                int nr=rv.x+x[i],nc=rv.y+y[i];
                if(isValid(nr,nc,n,m)&&!vis[nr][nc]&&(image[nr][nc]==old)){
                    vis[nr][nc]=true;
                    q.add(new p(nr,nc));
                    image[nr][nc]=newColor;
                }
            }
        }

        return image;
    }
    boolean isValid( int nr, int nc, int n,int m){
        if(nr<0||nr>=n||nc<0||nc>=m)
            return false;

        return true;
    }
}