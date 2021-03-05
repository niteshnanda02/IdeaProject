package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Input:
        Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
         */
        System.out.println("Hello");
        int[] input={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        sort(input);
        System.out.println(anagram("nam","amn"));
    }

    private static void sort(int[] input) {

        int[] cnt=new int[3];
        //{0,0,0}
        //0 1  2
        for (int i = 0; i <input.length ; i++) {
            cnt[input[i]]++;
        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <cnt[i] ; j++) {
                System.out.print(i+" ");
            }
        }
    }

    private static boolean anagram(String s1,String s2){
        int[] hash=new int[27];
        for (int i = 0; i <s1.length() ; i++) {
            char ch=s1.charAt(i);
            hash[ch-'a']++;
        }
        for (int i = 0; i <s2.length() ; i++) {
            char ch=s2.charAt(i);
            hash[ch-'a']--;
        }
        for (int i = 0; i <27 ; i++) {
            if(hash[i]!=0)
                return false;
        }
        return true;
    }
}
