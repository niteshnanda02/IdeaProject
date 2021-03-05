package TCSCodeVitaMock;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Deque;
import java.util.LinkedList;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int N=in.nextInt();
        String F=in.nextString();
        String M=in.nextString();
        Deque<Character> deque=new LinkedList<>();
        for (int i = 0; i <N ; i++) {
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
        int ans=deque.size();
        out.print(ans);
    }
}
