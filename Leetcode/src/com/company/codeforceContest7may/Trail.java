
import java.util.Scanner;

public class Trail {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int a=s.nextInt(),b=s.nextInt();
            int ans=a+b;
            System.out.println(ans);
        }
    }
}
