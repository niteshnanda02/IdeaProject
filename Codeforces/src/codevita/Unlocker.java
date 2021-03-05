package codevita;

import java.util.Map;
import java.util.Scanner;

public class Unlocker {
    static void rotateAnticlockMatrix(
            int N, int mat[][], int x) {
        // Consider all squares one by one
        // Consider elements in group
        // of 4 in current square
        for (int y = x; y < N - x - 1; y++) {
            // Store current cell in
            // temp variable
            int temp = mat[x][y];

            // Move values from right to top
            mat[x][y] = mat[y][N - 1 - x];

            // Move values from bottom to right
            mat[y][N - 1 - x]
                    = mat[N - 1 - x][N - 1 - y];

            // Move values from left to bottom
            mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

            // Assign temp to left
            mat[N - 1 - y][x] = temp;
        }
    }

    static void rotateclockMatrix(
            int N, int mat[][], int x) {
        // Consider all squares one by one
        // Consider elements in group
        // of 4 in current square
        for (int y = x; y < N - x - 1; y++) {
            // Store current cell in
            // temp variable
            int temp = mat[N - 1 - y][x];
            mat[N - 1 - y][x] = mat[N - 1 - x][N - 1 - y];
            // Move values from right to top

            // Move values from bottom to right

            mat[N - 1 - x][N - 1 - y] = mat[y][N - 1 - x];

            // Move values from left to bottom
            mat[y][N - 1 - x] = mat[x][y];

            // Assign temp to left
            mat[x][y] = temp;
        }
    }
//
//    static void displayMatrix(
//            int N, int mat[][]) {
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++)
//                System.out.print(
//                        " " + mat[i][j]);
//
//            System.out.print("\n");
//        }
//        System.out.print("\n");
//    }
static int[][] res;

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        res=new int[m][n];
        for (int i = 0; i < Math.min(m,n); i++) {
            int l=s.nextInt();
            //anticlock
            if(i%2==0){
                anti(arr,l,m,n);
            }
            //clock
            else {

            }
        }
    }

    private static void anti( int[][] arr, int l, int m, int n) {
        int L=0,R=n-1,T=0,B=m-1;

    }
}
