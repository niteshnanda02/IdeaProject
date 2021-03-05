//package com.company;
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // write your code here
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int k = 3;
//        String s = "";
//        for (int i = 0; i < arr.length; i++) {
//            s += String.valueOf(arr[i]);
//        }
//        for (int i = 0; i < s.length(); i += k) {
//            if (s.length() - i > k){
//                System.out.print(s.substring(i, i + k) + ",");
//            else
//                System.out.println(s.substring(i));
//        }
//    }
//}
