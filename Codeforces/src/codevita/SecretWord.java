package codevita;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecretWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String p=s.next();
        int n=s.nextInt();
        Map<Character,Character> first=new HashMap<>();
        Map<Character,Character> second=new HashMap<>();
        for (int i = 0; i <n ; i++) {
            String F=s.next();
            String S=s.next();
            for (int j = 0; j <F.length() ; j++) {
                first.put(S.charAt(j),F.charAt(j));
                second.put(F.charAt(j),S.charAt(j));
            }
        }
        for (int i = 0; i <p.length() ; i++) {
            System.out.print(first.get(p.charAt(i)));
                System.out.print(second.get(p.charAt(i)));
        }
        System.out.println();
    }
}
