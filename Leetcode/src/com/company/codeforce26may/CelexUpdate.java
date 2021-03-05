
import java.util.Scanner;

public class CelexUpdate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long cr = s.nextLong(), cc = s.nextLong(), er = s.nextLong(), ec = s.nextLong();
            if (cr == er || cc == ec)
                System.out.println(1);
            else
                System.out.println(calc(cr, cc, er, ec));
        }
    }

    private static long calc(long cr, long cc, long er, long ec) {

        if (cr == er && cc == ec)
            return 1;
        if (cr > er || cc > ec)
            return 0;
        long count = 0;

        count += calc(cr, cc + 1, er, ec);

        count += calc(cr + 1, cc, er, ec);

        return count;
    }
}
