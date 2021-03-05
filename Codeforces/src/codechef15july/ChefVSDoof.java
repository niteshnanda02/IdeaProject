package codechef15july;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ChefVSDoof {


    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                boolean val=false;
                for (int i = 0; i < n; i++) {
                    int c = s.nextInt();
                    if(c%2==0){
                        val=true;
                        break;
                    }
                }
                s.nextLine();

                if (!val)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}