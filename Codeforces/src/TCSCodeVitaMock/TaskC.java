package TCSCodeVitaMock;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int p=in.nextInt(),q=in.nextInt(),r=in.nextInt(),l=in.nextInt();
        int ans=0;
        for (int i = p; i <=q ; i++) {
            for (int j = r; j <=l ; j++) {
                int s1=i,s2=j;
                if (s1==s2){
                    ans++;
                }else {
                    while (s1 > 0 && s2 > 0 ) {
                        ans++;
                        if (s1==s2)
                            break;
                        if (s1 > s2) {
                            s1 -= s2;
                        } else {
                            s2 -= s1;
                        }
                    }
                }
            }
        }
        out.print(ans);
    }
}
