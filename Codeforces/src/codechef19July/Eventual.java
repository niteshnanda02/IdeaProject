package codechef19July;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eventual {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                String s1 = s.next();
                Map<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < n; i++) {
                    char ch = s1.charAt(i);
                    if (map.containsKey(ch)) {
                        map.remove(ch);
                    } else {
                        map.put(ch, 1);
                    }
                }
                if (map.isEmpty())
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}