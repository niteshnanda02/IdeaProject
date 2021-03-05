package com.company.Questions;

import java.util.Arrays;

public class gameOfLife {
    static class Solution {
        int[] x={0,1,1,1,0,-1,-1,-1};
        int[] y={1,1,0,-1,-1,-1,0,1};
        public void gameOfLife(int[][] board) {
            int n=board.length,m=board[0].length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    int zero=0,one=0;

                    for(int k=0;k<8;k++){
                        int ni=i+x[k],nj=j+y[k];
                        if(ni>=0&&ni<n&&nj>=0&&nj<m){
                            if(board[ni][nj]==0||board[ni][nj]==2)
                                zero++;
                            else
                                one++;
                        }
                    }
                    //live cell is represented with 2
                    if(board[i][j]==1||board[i][j]==3){
                        if(one<2){
                            board[i][j]=3;
                        }else if(one==2||one==3){
                        }else if(one>3){
                            board[i][j]=3;
                        }
                    }
                    //dead cell is represented with 3
                    else{
                        if(one==3){
                            board[i][j]=2;
                        }
                    }
                }
            }

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(board[i][j]==2){
                        board[i][j]=1;
                    }
                    if(board[i][j]==3){
                        board[i][j]=0;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        new Solution().gameOfLife(board);
        for (int[] a:board
             ) {
            System.out.println(Arrays.toString(a));
        }
    }
}

