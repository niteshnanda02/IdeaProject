package com.company;

import java.util.Arrays;

public class packing {
    public static void main(String[] args) {
        int[] length = {9980, 9984, 9981},
                width = {9980, 9984, 9983},
                height = {9981, 9984, 9982};
        System.out.println(boxesPacking(length,width,height));
    }

    static boolean boxesPacking(int[] length, int[] width, int[] height) {
        int n = length.length;
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
        for (int it = 0; it < n; it++) {
            for (int i = 0; i < n - 1; i++) {
                int volumeF = length[p[i]] * width[p[i]] * height[p[i]];
                int volumeS = length[p[i + 1]] * width[p[i + 1]] * height[p[i + 1]];
                if (volumeF > volumeS) {
                    int tmp = p[i];
                    p[i] = p[i + 1];
                    p[i + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(p));
        boolean isCorrectSequence = true;
        for (int i = 0; i < n - 1; i++) {
            int pi = p[i];
            int pj = p[i + 1];
            boolean canSwap = false;
            canSwap |= (length[pi] < length[pj] &&
                    width[pi] < width[pj] &&
                    height[pi] < height[pj]);
            canSwap |= (length[pi] < length[pj] &&
                    width[pi] < height[pj] &&
                    height[pi] < width[pj]);
            canSwap |= (length[pi] < width[pj] &&
                    width[pi] < length[pj] &&
                    height[pi] < height[pj]);
            canSwap |= (length[pi] < width[pj] &&
                    width[pi] < height[pj] &&
                    height[pi] < length[pj]);
            canSwap |= (length[pi] < height[pj] &&
                    width[pi] < length[pj] &&
                    height[pi] < width[pj]);
            canSwap |= (length[pi] < height[pj] &&
                    width[pi] < width[pj] &&
                    height[pi] < length[pj]);
            isCorrectSequence &= canSwap;
        }
        return isCorrectSequence;
    }
}
