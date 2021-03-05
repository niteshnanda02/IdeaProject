package com.company.Questions;

public class r2 {
    public static int findmaximum(int[] input1,String input2,int input3){
        int ans=0;
        for (int i = 0; i <input3 ; i++) {
            char ch=input2.charAt(i);
            if (ch=='P')
                ans+=input1[i];
            else
                ans-=input1[i];
        }
        return Math.abs(ans)*100;
    }

    public static void main(String[] args) {
        System.out.println(findmaximum(new int[]{3,2},"PN",2));
    }
}
