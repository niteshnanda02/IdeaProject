
import java.util.Scanner;

public class BoardAndMoves {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            long n=s.nextLong();
            System.out.println(check(n));
        }
    }

    private static long check(long n) {
        long rem=n/2;
        long ans=0;
        for (long i = 1; i <=rem ; i++) {
            ans+=8*Math.pow(i,2);
        }
        return ans;
    }
}
