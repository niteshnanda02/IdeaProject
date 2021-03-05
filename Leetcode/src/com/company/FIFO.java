package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FIFO {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int np = s.nextInt(), nf = s.nextInt();
        int[] arp = new int[np];
        int[] arf = new int[nf];
        for (int i = 0; i < np; i++) {
            arp[i] = s.nextInt();
        }


        System.out.println("Page fault " + check(arp, np, arf, nf));
    }

    private static int check(int[] arp, int np, int[] arf, int nf) {
        int j = 0;
        int pf = 0;
        Arrays.fill(arf, -1);
        boolean check = false;
        for (int i = 0; i < np; i++) {
            check = false;
            for (int k = 0; k < nf; k++)
                if (arf[k] == arp[i]) {
                    check = true;
                }
            if (check == false) {
                arf[j] = arp[i];
                j++;
                if (j >= nf) {
                    j = 0;
                }
                pf++;
            }
        }
        return pf;
    }
}
