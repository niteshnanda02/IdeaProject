package com.company.BackTracking;
import java.util.*;
public class hamiltonPath {
    static int[][] arr;
    static int[] path;
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt(),m=s.nextInt();
            arr=new int[n+1][n+1];
            path=new int[n+1];
            while(m-->0){
                int a=s.nextInt(),b=s.nextInt();
                arr[a][b]=1;
                arr[b][a]=1;

            }
            Arrays.fill(path,-1);
            path[1]=1;
            boolean temp=hamilton(n,2);
            int c=0;
            if(temp)
                c=1;
            System.out.println(c);
        }
    }

    static boolean hamilton(int n,int pos){
        if(pos==n+1){
            return visited(pos);

        }

        for(int v=2;v<=n;v++){
            if(isSafe(v,n,pos)){
                path[pos]=v;
                if(hamilton(n,pos+1)){
                    return true;
                }
                path[pos]=-1;
            }
        }
        return false;
    }

    private static boolean visited(int pos) {
        for (int i = 1; i <pos ; i++) {
            if(path[i]==-1)
                return false;
        }
        return true;
    }

    static boolean isSafe(int v,int n,int pos){

        //if v is not adjacent to the current vertex;
        if(arr[path[pos-1]][v]==0)
            return false;

        //check if we already take that vertex v
        for(int i=1;i<n+1;i++){
            if(path[i]==v)
                return false;
        }

        return true;

    }
}
