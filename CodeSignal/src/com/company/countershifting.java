package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class countershifting {
    public static void main(String[] args) {
        int[][] arr = {{238},
                {239},
                {240},
                {241},
                {242},
                {243},
                {244},
        {245}};
        int[][] ans = shift(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] shift(int[][] matrix) {
        ArrayList<ArrayList<Integer>> lists = getList(matrix);

        for (int i = 0; i < lists.size(); i++) {
            if (i % 2 == 0)
                Collections.rotate(lists.get(i), 1);
            else
                Collections.rotate(lists.get(i), -1);
        }
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
        matrix = save(matrix, lists);

        return matrix;
    }

    private static int[][] save(int[][] arr, ArrayList<ArrayList<Integer>> lists) {
        int L = 0, T = 0;
        int R = arr[T].length - 1, B = arr.length - 1;
        while (L <= R && T <= B) {
            for (int j = 0; j < lists.size(); j++) {
                ArrayList<Integer> list = lists.get(j);
                int c = 0;
                for (int i = L; i <= R; i++) {
                    arr[T][i] = list.get(c);
                    c++;
                }
                T++;
                for (int i = T; i <= B; i++) {
                    arr[i][R] = list.get(c);
                    c++;
                }
                R--;
                if (T <= B) {
                    for (int i = R; i >= L; i--) {
                        arr[B][i] = list.get(c);
                        c++;
                    }
                    B--;
                }
                if (L <= R) {
                    for (int i = B; i >= T; i--) {
                        arr[i][L] = list.get(c);
                        c++;
                    }
                    L++;
                }
            }
        }
        return arr;
        }

        private static ArrayList<ArrayList<Integer>> getList ( int[][] arr){
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            int L = 0, T = 0;
            int R = arr[T].length - 1, B = arr.length - 1;
            while (L <= R && T <= B) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = L; i <= R; i++) {
                    list.add(arr[T][i]);
                }
                T++;
                for (int i = T; i <= B; i++) {
                    list.add(arr[i][R]);
                }
                R--;
                if (T <= B) {
                    for (int i = R; i >= L; i--) {
                        list.add(arr[B][i]);
                    }
                    B--;
                }
                if (L <= R) {
                    for (int i = B; i >= T; i--) {
                        list.add(arr[i][L]);
                    }
                    L++;
                }
                lists.add(list);
            }
            return lists;
        }

        public static void rotateleft (ArrayList < Integer > list) {
            for (int i = 0; i < list.size(); i++) {
                Collections.rotate(list, 0);
            }
        }


    }
