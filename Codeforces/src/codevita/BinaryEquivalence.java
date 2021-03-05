package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryEquivalence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] ar = new String[n];
        int maxLen = 0;
        int z = 0, o = 0;
        for (int i = 0; i < n; i++) {
            int v = s.nextInt();
            ar[i] = Integer.toBinaryString(v);
            maxLen = Math.max(maxLen, ar[i].length());
            for (int j = 0; j < ar[i].length(); j++) {
                char c = ar[i].charAt(j);
                if (c == '0')
                    z++;
                else
                    o++;
            }
        }
        for (int i = 0; i < n; i++) {
            int r = maxLen - ar[i].length();
            z += r;
        }
        if (z == o && maxLen % 2 == 0) {
            for (int i = 0; i < maxLen / 2; i++) {
                System.out.print("0");
            }
            for (int i = maxLen / 2; i < maxLen; i++) {
                System.out.print("1");
            }
        } else {
            for (int i = 0; i < maxLen; i++) {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}
