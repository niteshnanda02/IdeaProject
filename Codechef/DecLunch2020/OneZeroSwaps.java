package DecLunch2020;

import java.util.Scanner;

public class OneZeroSwaps {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                int n = s.nextInt();
                String S = s.next(), P = s.next();
                char[] a = S.toCharArray();
                int z = 0, o = 0;
                for (int i = 0; i < n; i++) {
                    if (S.charAt(i) == '0')
                        z++;
                    else
                        o++;
                }

                for (int i = 0; i < n; i++) {
                    if (P.charAt(i) == '0')
                        z--;
                    else
                        o--;
                }

                if (z == 0 && o == 0){
                    int c1=0,c2=0;
                    boolean flag=true;
                    for (int i = 0; i <n ; i++) {
                        if(S.charAt(i)=='1')
                            c1++;
                        if(P.charAt(i)=='1')
                            c2++;
                        if(c2>c1){
                            flag=false;
                            break;
                        }
                    }
                    if (flag)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }

                else
                    System.out.println("No");

            }
        }
    }
}
