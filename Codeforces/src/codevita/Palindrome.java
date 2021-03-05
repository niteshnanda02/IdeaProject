package codevita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        boolean temp = false;
        for (int i = 0; i < inp.length() && !temp; i++) {
            if (!palindrome(0, i, inp))
                continue;
            for (int j = i + 1; j < inp.length() && !temp; j++) {
                boolean first = palindrome(i + 1, j, inp);
                boolean second = palindrome(j + 1, inp.length() - 1, inp);
                if (first && second) {
                    temp = true;
                    System.out.println(inp.substring(0, i + 1));
                    System.out.println(inp.substring(i + 1, (i + 1) + (j - i)));
                    System.out.println(inp.substring(j + 1, (j + 1) + (inp.length() - j - 1)));
                }
            }
        }
        if (!temp) {
            System.out.println("Impossible");
        }
    }

    private static boolean palindrome(int start, int end, String inp) {
        while (start < end) {
            if (inp.charAt(start) != inp.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
