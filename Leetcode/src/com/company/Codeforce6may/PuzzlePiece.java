
import java.util.Scanner;

public class PuzzlePiece {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt(),m=s.nextInt();
            if(n==2&&m==2)
            {
                System.out.println("YES");
                continue;
            }

            if(n!=1&&m!=1)
            {
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
        }
    }
}
