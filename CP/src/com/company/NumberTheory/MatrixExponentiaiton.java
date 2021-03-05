package com.company.NumberTheory;

import java.util.Scanner;


public class MatrixExponentiaiton {
    static int n=101;
    static int[][] ar =new int[n][n];
    static int[][] I=new int[n][n];

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            int dim = s.nextInt(), N = s.nextInt();
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < dim; j++) {
                    ar[i][j] = s.nextInt();
                }
            }
            long mod = 1000000007;
            pow(ar, dim, N, mod);
            print(ar, dim);
        }
    }

    private static void print(int[][] A, int dim) {
        for (int i = 0; i <dim ; i++) {
            for (int j = 0; j <dim ; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void pow(int[][] A, int dim, int n, long mod) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i==j)
                    I[i][j]=1;
                else
                    I[i][j]=0;
            }
        }
        /*
        this naive approach because you just multiplying the number n times which
        take O(N^3*N) we can optimize this by fast/binary exponentiation
        //Multiply A by n times and store the result in I;
        for (int i = 0; i <n ; i++) {
            //I=I*a;
            multiply(I,A,dim);
        }
        */

        //O(N^3*logN)
        while (n>0){
            if(n%2!=0){
                multiply(I,A,dim,mod);
                n--;
            }else {
                multiply(A,A,dim,mod);
                n=n/2;
            }
        }

        //then finally store the result(I) into ar array
        for (int i = 0; i <dim ; i++) {
            for (int j = 0; j <dim ; j++) {
                A[i][j]=I[i][j];
            }
        }
    }

    private static void multiply(int[][] A, int[][] B, int dim, long mod) {
        int[][] res=new int[dim+1][dim+1];

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <dim ; j++) {
                res[i][j]=0;
                for (int k = 0; k <dim ; k++) {
                    res[i][j]= (int) (((res[i][j]%mod)+((A[i][k])%mod*(B[k][j])%mod)%mod)%mod);
                }
            }
        }

        for (int i = 0; i <dim ; i++) {
            for (int j = 0; j <dim ; j++) {
                A[i][j]=res[i][j];
            }
        }
    }
}
