package TCSCodeVitaMock;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String F=s.next();
        String M=s.next();
        Deque<Character> deque=new LinkedList<>();
        for (int i = 0; i <n ; i++) {
            deque.addLast(M.charAt(i));
        }
        int i=0;
        while (!deque.isEmpty()){
            char ch=F.charAt(i);
            if (!deque.contains(ch))
                break;
            if(ch==deque.peek()){
                deque.removeFirst();
                i++;
            }else {
                char cc=deque.removeFirst();
                deque.addLast(cc);
            }
        }
        System.out.println(deque.size());
    }
}
