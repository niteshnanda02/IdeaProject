package com.company.BackTracking;

public class LongestPathRouteWithHurdles {
    static int maxPath=Integer.MIN_VALUE;
    static int[] x={0,1,0,-1},y={1,0,-1,0};
    public static void main(String[] args) {
        int[][] mat={
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };
        int n=mat.length,m=mat[0].length;
        findLongestPath(mat, 0, 0, 1, 7,n,m,0);
        System.out.println(maxPath);
    }

    private static void findLongestPath(int[][] mat, int sr, int sc, int dr, int dc, int n, int m, int cnt) {
        if(sr==dr&&sc==dc){
            maxPath=Math.max(cnt,maxPath);
            return;
        }
        for (int i = 0; i <4 ; i++) {
            int nr=sr+x[i],nc=sc+y[i];
            if(isSafe(nr,nc,n,m,mat)){
                mat[nr][nc]=2;
                findLongestPath(mat,nr,nc,dr,dc,n,m, cnt+1);
                mat[nr][nc]=1;
            }
        }
    }

    private static boolean isSafe(int nr, int nc, int n, int m, int[][] mat) {
        if(nr<0||nr>=n||nc<0||nc>=m||mat[nr][nc]!=1)
            return false;
        return true;
    }
}
