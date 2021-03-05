package com.company;

public class Main {
    /*

        inp:-  5
        out:- 54321, 13425,
        String s=12345
        {2,3,4,5}
        3
        (3+5)%5
     */
    public static void main(String[] args) {
	// write your code here

        for (int i = 0; i <5 ; i++) {
            int val= (int) (Math.random()*5);
            System.out.println(val);
        }
    }
}
