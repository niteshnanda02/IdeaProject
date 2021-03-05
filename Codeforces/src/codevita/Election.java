package codevita;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Election {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();

        int countA = 0, countB = 0;
        int c = 0;
        char first = '\0', last = '\0';
        char start = '\0';
        for (int i = 0; i < n; i++) {

            char ch = str.charAt(i);
            if (ch == '-') {
                c++;
            } else if (start == '\0' && ch == 'A') {
                countA++;
                if (c > 0) {
                    countA += c;
                }
                start='A';
                last = 'A';
                c = 0;
                first = 'A';
            } else if ((start == 'A' || start == '\0') && ch == 'B') {
                start='B';
                countB++;
                last = 'B';
                c = 0;
                first = 'B';
            } else if (ch == 'A') {
                if (first == 'A') {
                    countA += c;
                } else {
                    c = c / 2;
                    countA += c;
                    countB += c;
                }
                first='A';
                last = 'A';
                c = 0;
                countA++;
            } else if (ch == 'B') {
                if (first == 'B') {
                    countB += c;
                } else {
                    c = c / 2;
                    countA += c;
                    countB += c;
                }
                first='B';
                c = 0;
                last = 'B';
                countB++;
            }
        }
        if (c > 0 && last == 'B') {
            countB += c;
        }

        if (countA == countB) {
            System.out.println("Coalition government");
        } else if (countA > countB) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
