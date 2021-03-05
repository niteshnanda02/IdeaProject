package DecLunch2020;

import java.util.*;

public class ThreeLetters {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();

            while (t-->0){
                String str=s.next();
                int[] a=new int[27];
                for (int i = 0; i <str.length() ; i++) {
                    a[str.charAt(i)-'a']++;

                }
                int x=0;
                for (int i = 0; i <27 ; i++) {
                    x+=Math.floor(a[i]/2.0);
                }
                System.out.println(Math.min(x,str.length()/3));
            }
        }
    }
}
