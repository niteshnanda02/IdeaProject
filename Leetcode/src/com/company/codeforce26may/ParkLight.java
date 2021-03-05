
import java.util.Scanner;

public class ParkLight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), m = s.nextInt();
            int res=n*m;
            if (res==1)
                System.out.println(1);
            else {
                int ans=res%2==0?res/2:res/2+1;
                System.out.println(ans);
            }
        }
    }
}
