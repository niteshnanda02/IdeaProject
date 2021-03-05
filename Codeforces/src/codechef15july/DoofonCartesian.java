package codechef15july;

import java.util.Arrays;
import java.util.Scanner;

public class DoofonCartesian {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                long[] a = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }
                int q = s.nextInt();
                for (int i = 0; i < q; i++) {
                    long x = s.nextLong(), y = s.nextLong();
                    long p = x + y;
                    int ind = Arrays.binarySearch(a, p);
                    if (ind > 0) {
                        System.out.println(-1);
                    } else {
                        ind = Math.abs(ind) - 1;
                        System.out.println(ind);
                    }
                }
            }
        }
    }
}