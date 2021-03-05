package com.company.BackTracking;

import java.util.*;

public class Boggle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            Set<String> set=new HashSet<>();
            int x=s.nextInt();
            String[] dict=new String[x];
            for (int i = 0; i <x ; i++) {
                dict[i]=s.next();
            }
            int n=s.nextInt(),m=s.nextInt();
            char[][] bog=new char[n][m];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    bog[i][j]=s.next().charAt(0);
                }
            }
            boolean[][] visited=new boolean[n][m];
            for (boolean[] a:visited
                 ) {
                Arrays.fill(a,false);
            }
            for (int i = 0; i < dict.length ; i++) {
                String S=dict[i];
                char ch=S.charAt(0);
                for (int j = 0; j <n ; j++) {
                    for (int k = 0; k <m ; k++) {
                        if(bog[j][k]==ch){
                            visited[j][k]=true;
                            solve(bog,visited,j,k,S,1,n,m,set);
                            visited[j][k]=false;
                        }
                    }
                }
            }
            if (set.size()==0){
                System.out.println(-1);
            }else {
                List<String> list = new ArrayList<>(set);

                Collections.sort(list);
                for (String S : list
                ) {
                    System.out.print(S + " ");
                }
                System.out.println();
            }
        }
    }

    private static void solve(char[][] bog, boolean[][] visited, int row, int col, String s, int index, int n, int m, Set<String> set) {
        if(row<0||row>=n||col<0||col>=m)
            return;
        if(index==s.length()){
            set.add(s);
            return;
        }
        int[][] direction= {{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1},{0,1},{-1,1}};

        for (int i = 0; i <8 ; i++) {
            int rowInd=row+direction[i][0];
            int colInd=col+direction[i][1];
            if(isSolve(bog,visited,rowInd,colInd,s,index,n,m)){
                visited[rowInd][colInd]=true;
                solve(bog,visited,rowInd,colInd,s,index+1,n,m, set);
                visited[rowInd][colInd]=false;
            }
        }
    }

    private static boolean isSolve(char[][] bog, boolean[][] visited, int rowInd, int colInd, String s, int index, int n, int m) {
        if(rowInd<0||rowInd>=n||colInd<0||colInd>=m||bog[rowInd][colInd]!=s.charAt(index)||visited[rowInd][colInd])
            return false;
        return true;
    }
}
