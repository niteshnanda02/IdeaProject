package com.company.greedy;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        int[] curr = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int target = 121;
        System.out.println(coin(curr, 0, target, 0));
    }

    private static int coin(int[] curr, int i, int target, int coins) {
        if (target == 0) {
            return coins;
        }

        if (curr[i] <= target) {
            return coin(curr, i + 1, target - curr[i], coins + 1);
        } else {
            return coin(curr, i + 1, target, coins);
        }
    }
}
