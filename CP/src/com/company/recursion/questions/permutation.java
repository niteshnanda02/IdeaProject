package com.company.recursion.questions;

public class permutation {
    public static void main(String[] args) {
        printAllPurmation("12345","");
    }

    private static void printAllPurmation(String ip, String op) {
        if (ip.length()==0){
            System.out.println(op);
            return;
        }
        for (int i = 0; i <ip.length() ; i++) {
            char cc=ip.charAt(i);
            String ros=ip.substring(0,i)+ip.substring(i+1);
            printAllPurmation(ros,op+cc);
        }

    }
}
