package septemberChallenge2020;

import java.util.*;

public class problemOnStick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                long[] a = new long[n];
                for (int i = 0; i < n; i++)
                    a[i] = s.nextLong();
                Arrays.sort(a);
                long last = a[n - 1];
                int c = 1;
                for (int i = n - 2; i >= 0; i--) {
                    if (last != a[i]) {
                        last = a[i];
                        c++;
                    }
                }
                System.out.println(c);
            }
        }
    }
}