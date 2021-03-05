package codechef6DecLongChallange;

import java.util.Scanner;

public class PositivePrefix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int k = s.nextInt(), n = s.nextInt();
                int[] a = new int[n + 1];
                for (int i = 1; i < n + 1; i++) {

                    if (i % 2 == 0)
                        a[i] = i;
                    else
                        a[i] = i * -1;
                }
                int val = n / 2;
                if (val < k) {
                    int b = k - val;
                    for (int i = n; i >= 0 && b > 0; i--) {
                        if (a[i] < 0) {
                            a[i] = a[i] * -1;
                            b--;
                        }

                    }
                } else {
                    int b = val - k;
                    for (int i = n; i > 0 && b > 0; i--)    {
                        if (a[i] > 0) {
                            a[i] = a[i] * -1;
                            b--;
                        }

                    }
                }

                for (int i = 1; i < n + 1; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();

            }
        }
    }
}
