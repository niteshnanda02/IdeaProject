package com.company.codejam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = s.nextInt();
        int[] arr = new int[n];
        List<List<Integer>> list = new ArrayList<>();
        generateUtil(n, arr, 0, 0, list,3);
        System.out.println(list);
    }

    static List<Integer> addElement(int arr[], int n, List<Integer> list, int k) {
            for (int i = 0; i < n; i++)
                list.add(arr[i]);

        return list;
    }

    static void generateUtil(int x, int arr[],
                             int curr_sum, int curr_idx, List<List<Integer>> list,int k) {
        // If current sum is equal to x, then
        // we found a sequence
        if (curr_sum == x) {
            if (curr_idx == k) {
                List<Integer> list1=new ArrayList<>();
                list1=addElement(arr, curr_idx, list1, k);
                list.add(list1);
            }
            return;
        }

        // Try placing all numbers from 1 to
        // x-curr_sum at current index
        int num = 1;

        // The placed number must also be smaller
        // than previously placed numbers, i.e.,
        // arr[curr_idx-1] if there exists a
        // pevious number
        while (num <= x - curr_sum &&
                (curr_idx == 0 ||
                        num <= arr[curr_idx - 1])) {

            // Place number at curr_idx
            arr[curr_idx] = num;

            // Recur
            generateUtil(x, arr, curr_sum + num,
                    curr_idx + 1, list,k);

            // Try next number
            num++;
        }
    }
}
