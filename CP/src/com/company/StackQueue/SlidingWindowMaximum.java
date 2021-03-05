package com.company.StackQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int k=s.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=s.nextInt();
            }
            a=solve(a,n,k);
            for (int i:a
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static int[] solve(int[] a, int n, int k) {
        Deque<Integer> deque=new LinkedList<>();
        int[] ans=new int[n-k+1];

        int i=0;
        for(;i<k;i++){
            while (!deque.isEmpty()&&a[deque.peekLast()]<=a[i])
                deque.removeLast();
            deque.addLast(i);
        }

        for(;i<n;i++){
            ans[i-k]=a[deque.peekFirst()];
            while (!deque.isEmpty()&&deque.peekFirst()<=i-k)
                deque.removeFirst();


            while (!deque.isEmpty()&&a[deque.peekLast()]<=a[i])
                deque.removeLast();
            deque.addLast(i);
        }
        ans[i-k]=a[deque.peekFirst()];
        return ans;

    }
}
