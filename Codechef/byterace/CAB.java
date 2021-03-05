package byterace;

import java.util.Scanner;

public class CAB {
    static String res = "";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt(), k = s.nextInt();
                res = "";
                solve(n, k, "",25);
                if (res == "")
                    System.out.println(-1);
                else
                    System.out.println(res);
            }
        }
    }

    private static void solve(int n, int k, String r, int start) {
        if (n == 0 && k == 0) {
            res = r;
            return;
        } else if (n == 0 || k == 0) {
            return;
        }
        for (int i = start; i >=0; i--) {
            int val = (int) Math.pow(2, i);
            char ch = (char) (i + 'a');
            if (val <= k)
                solve(n - 1, k - val, r + ch, i);


        }
    }
}
