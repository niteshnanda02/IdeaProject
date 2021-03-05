package codechefJulyLongChallenge2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChefAndString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String l = bufferedReader.readLine();
        if (l != null) {
            int t = Integer.parseInt(l);
            while (t-- > 0) {
                int n = Integer.parseInt(bufferedReader.readLine());
                long[] a = new long[n];
                String line = bufferedReader.readLine();
                String[] s = line.trim().split("\\s+");
                for (int i = 0; i < n; i++) {
                    a[i] = Long.parseLong(s[i]);
                }
                long ans = 0;
                for (int i = 1; i < n; i++) {
                    long v = Math.abs(a[i] - a[i - 1]);
                    v--;
                    if (v > 0)
                        ans += v;
                }
                System.out.println(ans);

            }

        }
    }
}
