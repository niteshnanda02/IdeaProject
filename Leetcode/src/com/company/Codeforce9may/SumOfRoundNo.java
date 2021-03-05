
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            ArrayList<String> list = new ArrayList<>();
            int res = 0;
            int n = s.nextInt();
            String val = String.valueOf(n);
            int c = val.length() - 1;
            while (val.length() > 0) {
                char ch = val.charAt(0);
                val = val.substring(1);
                int i = Integer.parseInt(String.valueOf(ch));
                if (i != 0) {
                    res++;
                    int ans = i * (int) Math.pow(10, c);
                    list.add(ans + " ");
                }
                c--;
            }
            System.out.println(res);
            for (String a : list) {
                System.out.print(a);
            }
            System.out.println();
        }
    }


}
