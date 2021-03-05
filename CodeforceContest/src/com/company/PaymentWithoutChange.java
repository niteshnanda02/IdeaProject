import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PaymentWithoutChange {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = s.nextInt();
        while (t > 0) {
            t--;
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int S = s.nextInt();
            change(a, b, n, S);
        }
    }

    private static void change(int a, int b, int n, int s) {
        if (s == 0) {
            System.out.println("YES");
            return;
        }
        if (s < n) {
            int i;
            int val = 0;
            for (i = 1; i <= b; i++) {
                val++;
                if (val == s) {
                    System.out.println("YES");
                    return;
                }
            }
            if (val < s) {
                System.out.println("NO");
            }
        } else {
            int val = s / n;
            if (val==a){
                System.out.println("YES");
                return;
            }
            while (val > a) {
                val--;
            }
            val=val*n;
            for (int i = 1; i <= b; i++) {
                val++;
                if (val == s) {
                    System.out.println("YES");
                    return;
                }
            }
            if (val != s) {
                System.out.println("NO");
            }
        }
    }


}
