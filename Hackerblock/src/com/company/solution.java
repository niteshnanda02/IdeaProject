package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t = 0 ; t < T ; ++t) {
            int n = scanner.nextInt();
            String[] words = new String[n];
            for (int i = 0; i < n; ++i) {
                words[i] = scanner.next();
            }
            sol(words);
        }

    }

    private static void sol(String[] words) {
        int count=0;

        /* Enter your code here.Print output to STDOUT. Your class should be named Solution. */
            HashSet<Character> h1 = new HashSet<Character>();
            HashSet<Character> h2 = new HashSet<Character>();
            h1.add('a');
            h1.add('b');
            h1.add('d');
            h1.add('e');
            h1.add('o');
            h1.add('p');
            h1.add('q');
            h1.add('0');
        h1.add('6');
        h1.add('4');
            h1.add('9');
            h1.add('A');
            h1.add('D');
            h1.add('O');
            h1.add('P');
            h1.add('Q');
            h1.add('R');
            h1.add('g');
            h2.add('8');
            h2.add('B');
            for(int l=0;l<words.length;++l)
            {
                String ch=words[l];
                for (int i = 0; i <ch.length() ; i++) {
                    if(h1.contains(ch.charAt(i)))
                    {
                        count++;
                    }
                    else if(h2.contains(ch.charAt(i)))
                    {
                        count=count+2;
                    }
                }

            }
        System.out.println(count);
    }

}
