
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            boolean val=false;
            int a1 = s.nextInt(), b1 = s.nextInt(), a2 = s.nextInt(), b2 = s.nextInt();
            if (a1 == a2) {
                if ((b1 + b2) == a1) {
                    val=true;
                }
            } else if (a1 == b2) {

                if ((a2 + b1) == a1) {
                    val=true;
                }
            } else if (b1 == a2) {

                if ((a1 + b2) == b1) {
                    val=true;
                }
            } else if (b1 == b2) {

                if ((a2 + a1) == b1) {
                    val=true;
                }
            }

            if (val)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
