package hackercup;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        for (int l = 1; l <=testNumber ; l++) {

            int n=in.nextInt();
            String I=in.nextString();
            String O=in.nextString();
            char[][] a=new char[n][n];
            for (char[] b:a
                 ) {
                Arrays.fill(b,'N');
            }
            for (int i = 0; i <n ; i++) {
                int j=i;
                a[i][j]='Y';
                int Il=i-1,Ol=j;
                int Ir=i+1,Or=j;
                int L=Il,R=Ir;
                while (Il>=0){
                    char up=I.charAt(Il);
                    char low=O.charAt(Ol);
                    if(low=='N'||up=='N')
                        break;
                    else{
                        a[i][L]='Y';
                        Il--;
                        Ol--;
                        L--;
                    }
                }
                while (Ir<n){
                    char up=I.charAt(Ir);
                    char low=O.charAt(Or);
                    if(low=='N'||up=='N')
                        break;
                    else{
                        a[i][R]='Y';
                        Ir++;
                        Or++;
                        R++;
                    }
                }
            }
            out.println("Case #"+l+":");
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    out.print(a[i][j]);
                }
                out.println();
            }
        }
    }
}
