package com.company;

import java.util.*;

public class Main {
    static class Lib {
        int book;
        int signup;
        int ship;
        int[] bklist;

        public Lib(int book, int signup, int ship) {
            this.book = book;
            this.signup = signup;
            this.ship = ship;
            bklist = new int[book];
        }

        public void add(Scanner s) {
            for (int i = 0; i < bklist.length; i++) {
                bklist[i] = s.nextInt();
            }

            Arrays.sort(bklist);

        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int B = s.nextInt();
        int L = s.nextInt();
        int D = s.nextInt();
        int[] score = new int[B];
        for (int i = 0; i < B; i++) {
            score[i] = s.nextInt();
        }
        List<Lib> list = new ArrayList<>();
        for (int i = 0; i < L; i++) {
            Lib lib = new Lib(s.nextInt(), s.nextInt(), s.nextInt());
            lib.add(s);
            list.add(lib);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(i, score[i]);
        }
        Map<Integer, Integer> library = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int[] bookscore = list.get(i).bklist;
            System.out.println(Arrays.toString(bookscore));
            int sc = 0;
            for (int j = 0; j < bookscore.length; j++) {
                System.out.println(map.get(bookscore[j]));
                sc += map.get(bookscore[j]);
            }
            System.out.println("score"+sc+list.get(i).book+list.get(i).ship +list.get(i).signup);
            int sco = (sc * list.get(i).book) / (list.get(i).ship * list.get(i).signup);
            library.put(i, sco);
        }
        for (int i = 0; i <library.size() ; i++) {
            for (int j = i+1; j <library.size() ; j++) {
                if (library.get(j)<library.get(i)){
                    Lib lib=list.get(i);
                    list.get(i)=list.get(j);

                }
            }
        }
        System.out.println(library);

    }
}
