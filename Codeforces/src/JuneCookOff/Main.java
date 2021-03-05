package JuneCookOff;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int testNumber;
            testNumber = in.nextInt();
            while (testNumber-- > 0) {
                int n = in.nextInt(), b = in.nextInt(), m = in.nextInt();
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    list.add(i);
                }
                int ans = 0, prev = -1;
                for (int i = 0; i < m; i++) {
                    int c = in.nextInt();
                    int temp = c / b;
                    if (temp != prev) {
                        ans++;
                        prev = temp;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
