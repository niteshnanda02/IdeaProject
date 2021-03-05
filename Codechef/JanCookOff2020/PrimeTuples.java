package JanCookOff2020;

import java.util.*;

public class PrimeTuples {
    static int maxn =1000001;
    private static boolean[] is_prime=new boolean[maxn];
    private static int[] dp=new int[maxn];

    static void createPrime(){
        Arrays.fill(is_prime,true);
        is_prime[0]=false;is_prime[1]=false;
        for (int i = 2; i*i <=maxn ; i++) {
            if (is_prime[i]==true){
                for (int j = i*i; j <=maxn ; j+=i) {
                    is_prime[j]=false;
                }
            }
        }

    }
    static void solve(){
        dp[0]=0;
        dp[1]=0;
        for (int i = 2; i < maxn; i++) {
            if (is_prime[i]&&is_prime[i-2])
                dp[i]=dp[i-1]+1;
            else
                dp[i]=dp[i-1];
        }
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        createPrime();
        solve();
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int n=s.nextInt();


                System.out.println(dp[n]);
            }
        }
    }
}
