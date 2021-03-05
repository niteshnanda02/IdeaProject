package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String[][] a=new String[n][5];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <5 ; j++) {
                a[i][j]=s.nextLine();

            }

        }
        int[] arival=new int[n];
        int[] depar=new int[n];
        for (int i = 0; i <n ; i++) {
            int arv=0,der=0;
            String[] arr=a[i][2].split(":");
                for (int k = 0; k <arr.length ; k++) {
                    arv+=Integer.parseInt(arr[k]);
                }
                arival[i]=arv;
            String[] dep=a[i][3].split(":");
            String[] det=a[i][4].split(":");
            for (int k = 0; k <dep.length ; k++) {
                der+=Integer.parseInt(dep[k]+det[k]);
            }
            depar[i]=der;
            }
            check(arival,depar,n);
        }

    private static void check(int[] arr, int[] dep,int n) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        // plat_needed indicates number of platforms
        // needed at a time
        int plat_needed = 1, result = 1;
        int i = 1, j = 0;

        // Similar to merge in merge sort to process
        // all events in sorted order
        while (i < n && j < n)
        {
            // If next event in sorted order is arrival,
            // increment count of platforms needed
            if (arr[i] <= dep[j])
            {
                plat_needed++;
                i++;

                // Update result if needed
                if (plat_needed > result)
                    result = plat_needed;
            }

            // Else decrement count of platforms needed
            else
            {
                plat_needed--;
                j++;
            }
        }
        System.out.println(result);
    }


}
