package codechef15july;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Stack;

public class Doof {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        if (t != -1) {
            while (t-- > 0) {
                String s = in.nextString();
                int n = s.length();
                Stack<Integer> stack = new Stack<>();
                int[] dp = new int[n];
                for (int i = n - 1; i >= 0; i--) {
                    char ch = s.charAt(i);
                    if (ch == ')') {
                        stack.push(i);
                        if (i != n - 1 && dp[i + 1] != -1)
                            dp[i] = dp[i + 1];
                        else
                            dp[i] = -1;
                    } else {
                        if (stack.isEmpty())
                            dp[i] = -1;
                        else {
                            int val = stack.peek() + 1;
                            dp[i] = val;
                            stack.pop();
                        }
                    }
                }

                int q = in.nextInt();
                for (int i = 0; i < q; i++) {
                    int x = in.nextInt();
                    x--;
                    out.println(dp[x]);
                }
            }
        }
    }

}