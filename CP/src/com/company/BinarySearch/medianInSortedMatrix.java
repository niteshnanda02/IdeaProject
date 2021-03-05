package com.company.BinarySearch;

import java.util.Arrays;

public class medianInSortedMatrix {
    static int median(int matrix[][], int r, int c) {
        // code here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            min=Math.min(matrix[i][0],min);
            max=Math.max(matrix[i][c-1],max);
        }

        //no. of desired elements before median is
        int desired=(r*c+1)/2;
        while(min<max){

            int placed=0,get=0;
            int mid=min+(max-min)/2;
            for(int i=0;i<r;i++){

                get= Arrays.binarySearch(matrix[i],mid);

                //if element is not present in the array then it give us the
                //index=(-insertion point-1)

                if(get<0)
                    get=Math.abs(get)-1;

                    //else if element is present in the array the it provide us the random index of
                    // that same element;
                else{
                    while(get<matrix[i].length&&matrix[i][get]==mid)
                        get++;
                }
                placed+=get;
            }
            if(placed<desired)
                min=mid+1;
            else
                max=mid;
        }

        return min;
    }

    public static void main(String[] args) {
        int R = 3, C = 3;
        int[][] M = {{1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}};
        System.out.println(median(M,R,C));
    }
}
