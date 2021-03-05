
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class DisplayNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int t = s.nextInt();
        while (t > 0) {
            t--;
            int n = s.nextInt();
            System.out.println(check(n));
        }
    }

    private static String check(int n) {
        String ans = "";
        if(n%2!=0){
            ans+="7";
            n-=3;
        }
        for (int i = 0; i < n; i += 2) {
            ans += "1";
        }

        return ans;

    }

}
