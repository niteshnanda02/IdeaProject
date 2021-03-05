package codes;

import java.util.Scanner;

public class MonicaGaming {
    static final int N=1001;
    static long[] dp =new long[N];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextLong()) {
            long n = s.nextLong();
            dp[0]=1;
            dp[1]=2;
            int i=1;
            while (dp[i]<=n){
                i++;
                dp[i]=dp[i-1]+dp[i-2];
            }
            System.out.println(i-1);
        }
    }
}
