
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class BusRoute {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=s.nextInt();
            long d=s.nextInt();
            long[] ar=new long[n];
            for (int j = 0; j <n ; j++) {
                ar[j]=s.nextInt();
            }
            System.out.println("Case #"+i+": "+check(n,ar,d));
        }
    }

    private static long check(int n, long[] ar, long d) {
        long min=d;
        for (int i = ar.length-1; i >=0 ; i--) {
            min-=min%ar[i];
        }
        return min;
    }
}
