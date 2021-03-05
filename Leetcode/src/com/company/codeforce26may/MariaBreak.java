
import java.util.Arrays;
import java.util.Scanner;

public class MariaBreak {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            int j=n;
            for (int i = n-1; i >=0 ; i--) {
                if (a[i]<=j)
                    break;
                else
                    j--;
            }
            System.out.println(j+1);
        }
    }
}
