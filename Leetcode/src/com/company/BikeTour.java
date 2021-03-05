
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BikeTour {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        for (int i = 1; i <=t ; i++) {
            int n=s.nextInt();
            int[] ar=new int[n];
            for (int j = 0; j <n ; j++) {
                ar[j]=s.nextInt();
            }
            System.out.println("Case #"+i+": "+check(n,ar));
        }
    }

    private static int check(int n, int[] ar) {
        int c=0;
        for (int i = 1; i <ar.length-1 ; i++) {
            if(ar[i]>ar[i-1]&&ar[i]>ar[i+1])
                c++;
        }
        return c;
    }
}
