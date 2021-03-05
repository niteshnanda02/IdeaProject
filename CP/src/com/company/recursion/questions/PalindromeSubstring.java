package com.company.recursion.questions;
import java.util.*;
public class PalindromeSubstring {
    public static void main(String[] args) {
        new Solutio().partition("aab");
    }
}
class Solutio {
    public List<List<String>> partition(String s) {
        List<String> available=new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
        return null;
    }

}