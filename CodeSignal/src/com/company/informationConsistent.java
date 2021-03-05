package com.company;

public class informationConsistent {
    public static void main(String[] args) {
        int[][] evidences = {{1, -1, 0, 1},
                {1, -1, 0, -1}};
        boolean val = ifinformationConsistent(evidences);
        System.out.println(val);

    }

    private static boolean ifinformationConsistent(int[][] evidences) {
        for (int i = 0; i < evidences[0].length; i++) {
            int ch = 0;
            for (int j = 0; j < evidences.length; j++) {
                int val = evidences[j][i];
                if (val == 0)
                    continue;
                else if ((ch | val) == 1) {
                    if (ch == 0 || ch == 1)
                        ch = 1;
                    else
                        return false;
                } else if (val == -1 && (ch | val) == -1) {
                    if (ch == 0 || ch == -1)
                        ch = -1;
                    else
                        return false;
                } else
                    return false;
            }
        }
        return true;
    }
}
