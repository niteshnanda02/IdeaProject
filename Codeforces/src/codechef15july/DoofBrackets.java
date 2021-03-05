package codechef15july;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class DoofBrackets {
    public static void main(String[] args) {
        PrintWriter out= new PrintWriter(System.out,true);
        FastReader reader=new FastReader();
            int t = reader.nextInt();
            while (t-- > 0) {
                String s = reader.next();
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


                int q = reader.nextInt();
                for (int i = 0; i < q; i++) {
                    int x = reader.nextInt();
                    x--;
                    out.println(dp[x]);
                }
            }

    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NullPointerException e){
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}