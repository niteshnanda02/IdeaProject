package codechef19July;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class orThodox {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                long[] a = new long[n];
                for (int i = 0; i < n; i++) {
                    a[i] = s.nextInt();
                }
                long a1 = subarrayBitwiseORs(a);
                long a2 = (n * (n + 1)) / 2;
                if (a1 != a2)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
        }
    }
    public static long subarrayBitwiseORs(long[] A) {
        Set<Long> res = new HashSet<>(), cur = new HashSet<>(), cur2;
        for (long i: A) {
            cur2 = new HashSet<>();
            cur2.add(i);
            for (long j: cur) cur2.add(i|j);
            res.addAll(cur = cur2);
        }
        return res.size();
    }
}
