package com.company.BinarySearch;

public class Bound {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 4, 5};
        System.out.println(lowerBound(a, 2));
        System.out.println(upperBound(a,2));
    }

    private static int lowerBound(int[] a, int data) {
        int s = 0, e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] < data) {
                s = mid + 1;
            } else {
                e = mid;
            }
            s++;
            e--;
        }
        if (s == a.length)
            s = -1;
        return s;
    }

    private static int upperBound(int[] a, int data) {
        int s = 0, e = a.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] <= data) {
                s = mid + 1;
            } else {
                e = mid;
            }
            s++;
            e--;
        }
        if (s == a.length)
            s = -1;
        return s;
    }
}
