package com.company.Questions;

public class fsn {
    public static void main(String[] args) {
        int[] input={80,48,82};
        int[] prefix_min=new int[input.length];
        int min= input[input.length-1];
        prefix_min[input.length-1]=min;
        for (int i = input.length-2; i >=0 ; i--) {
            min=Math.min(min, input[i]);
            prefix_min[i]=min;
        }
        int max=prefix_min[0]*input.length;
        for (int i = 1; i < prefix_min.length ; i++) {
            max=Math.max(max,prefix_min[i]*(input.length-i));
        }
        System.out.println(max);

    }
}
