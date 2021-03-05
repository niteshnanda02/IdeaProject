//package com.company;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class CombinationSum {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        int k = s.nextInt(), n = s.nextInt();
//        int[] arr;
//        arr.l
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//        for (int i = 1; i <= 9; i++) {
//            ArrayList<Integer> list1 = new ArrayList<>();
//            list1.add(i);
//            ArrayList<Integer> list2 = new ArrayList<>();
//            list2.add(i);
//            int sum = i;
//            int c = 1;
//            for (int j = i + 1; j <= 9; j++) {
//                if (!list2.contains(j)) {
//
//                    sum += j;
//                    int val = n - sum;
//                    c++;
//                    if (val <= (k - c) * 9) {
//                        list1.add(j);
//                        list2.add(j);
//                        if (sum == n && list1.size() == k) {
//                            list.add(list1);
//                            list1 = new ArrayList<>();
//                            list1.add(i);
//                            j = i;
//                            sum = i;
//                            c=1;
//                        } else if (list1.size() == k) {
//                            c--;
//                            sum -= j;
//                            list1.remove(list1.size() - 1);
//                            list2.remove(list2.size() - 1);
//
//                        }else {
//                            sum-=j;
//                            c--;
//                        }
//                    } else {
//                        sum -= j;
//                        c--;
//                    }
//
//                }
//            }
//
//        }
//        for (
//                int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.get(i).size(); j++) {
//                System.out.print(list.get(i).get(j) + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}
