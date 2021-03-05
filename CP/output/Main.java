import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Vector;
import java.util.Scanner;
import java.util.Stack;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Jnex solver = new Jnex();
        solver.solve(1, in, out);
        out.close();
    }

    static class Jnex {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            testNumber = in.nextInt();
            while (testNumber-- > 0) {
                int n = in.nextInt();
                Stack<Integer> stack = new Stack<>();
                for (int i = 0; i < n; i++) {
                    stack.push(in.nextInt());
                }
                int top = stack.peek();
                Stack<Integer> store = new Stack<>();
                store.add(top);
                stack.pop();
                while (!stack.isEmpty() && stack.peek() > top) {
                    top = stack.peek();
                    store.add(top);
                    stack.pop();
                }
                if (stack.isEmpty())
                    System.out.println(-1);
                else {
                    int curr = stack.peek();
                    stack.pop();
                    while (!store.isEmpty()) {
                        stack.push(store.peek());
                        store.pop();
                    }
                    stack.push(curr);

                    for (int i = 0; i < stack.size(); i++) {
                        System.out.print(stack.get(i));
                    }
                    System.out.println();
                }


            }
        }

    }
}

