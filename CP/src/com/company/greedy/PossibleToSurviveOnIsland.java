package com.company.greedy;

import java.util.Arrays;

public class PossibleToSurviveOnIsland {
    public static void main(String[] args) {
        int n=611128842;

        survival(10,16,2);
    }

    private static void survival(int S, int N, int M) {

        /*If we can't buy at least a week
            supply of food during the first week
            or if daily unit is greater than given unit
            we can't survive;

         */
        if(((N*6)<(M*7)&&S>6)||(M>N)){
            System.out.println("NO");
        }else{
            int days=(M*S)/N;
            if((M*S)%N!=0)
                days++;
            System.out.println("YES "+days);
        }
    }
}
