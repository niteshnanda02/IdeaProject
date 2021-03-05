package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class LittlePigs {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),m=in.nextInt();
        char[][] a=new char[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                a[i][j]=in.nextCharacter();
            }
        }
        int ans=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                char cc=a[i][j];
                if (cc=='P'){
                    char T,B,R,L;
                    T=(i>0)?a[i-1][j]:'\0';
                    B=(i<n-1)?a[i+1][j]:'\0';
                    R=(j<m-1)?a[i][j+1]:'\0';
                    L=(j>0)?a[i][j-1]:'\0';
                    if (T=='W'){
                        ans++;
                        a[i-1][j]='.';
                        continue;
                    }
                    if (B=='W'){
                        ans++;
                        a[i+1][j]='.';
                        continue;
                    }
                    if (R=='W'){
                        ans++;
                        a[i][j+1]='.';
                        continue;
                    }
                    if (L=='W'){
                        a[i][j-1]='.';

                        ans++;
                        continue;
                    }
                }
            }
        }
        out.println(ans);
    }
}
