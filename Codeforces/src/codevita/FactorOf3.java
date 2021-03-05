package codevita;

import java.util.Arrays;
import java.util.Scanner;

public class FactorOf3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt() % 3;
            }
            int[] ct = new int[3];
            for (int i = 0; i < n; i++) {
                ct[a[i]]++;
            }
            if (ct[0] == 0 && ct[1] != 0 && ct[2] != 0)
                System.out.println("No");
            else if (ct[0] == 0 && ct[2] == 0 && ct[1] != 0) {
                System.out.println("Yes");
            } else if (ct[0] == 0 && ct[1] == 0 && ct[2] != 0) {
                System.out.println("Yes");
            } else if (ct[0] <= (ct[1] + ct[2]+1)) {
                System.out.println("Yes");
            } else
                System.out.println("No");
        }
    }
}
