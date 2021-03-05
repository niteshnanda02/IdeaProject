//package com.company.Sorting;
//
//import java.util.*;
//
//public class SortMatrixDiagnoly {
//    public static void main(String[] args) {
//        int[][] m={{3,3,1,1},{2,2,1,2},{1,1,1,2}};
//        System.out.println(new Solution().diagonalSort(m));
//
//        SortedMap<Integer,Integer> map=new TreeMap<>();
//        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
//        Collections.sort(l, new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
//                return 0;
//            }
//        });
//    }
//}
//
//class Solution {
//    public int[][] diagonalSort(int[][] mat) {
//        int r=mat.length-1,c=mat[0].length-1;
//        for(int i=r;i>=0;i--){
//            swap(mat,i,r);
//        }
//
//        return mat;
//    }
//    private void swap(int[][] mat,int i,int r){
//        int temp=i;
//        PriorityQueue<Integer> q=new PriorityQueue<>();
//        while (temp<=r){
//            q.add(mat[temp][temp]);
//            temp++;
//        }
//        while (!q.isEmpty()){
//            mat[i][i]=q.poll();
//            i++;
//        }
//    }
//}