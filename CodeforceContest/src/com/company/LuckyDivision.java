
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=s.nextInt();
        check(n);
    }

    private static void check(int n) {
        String c=String.valueOf(n);
        if (n%4==0||n%7==0||n%47==0||n%74==0||n%477==0||n%747==0||n%774==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }

    }
}
