package codechef28NOV2020;

import java.util.*;

public class Gasoline {
    static class pair {

        long f,c;

        public pair(long f, long c) {
            this.f = f;
            this.c = c;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> queue=new LinkedList<>();
        
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int n=s.nextInt();
                long[] f=new long[n];
                long[] c=new long[n];
                for (int i = 0; i <n ; i++) {
                    f[i]=s.nextInt();
                }
                for (int i = 0; i <n ; i++) {
                    c[i]=s.nextInt();
                }
                pair[] pairs=new pair[n];
                for (int i = 0; i <n ; i++) {
                    pair p=new pair(f[i],c[i]);
                    pairs[i]=p;
                }
                Arrays.sort(pairs, new Comparator<pair>() {
                    @Override
                    public int compare(pair pair, pair t1) {
                        if(pair.c==t1.c){
                            return Long.compare(pair.f,t1.f);
                        }
                        return Long.compare(pair.c,t1.c);
                    }
                });
                long sum=0;
                long dis=n;
                for (int i = 0; i <n ; i++) {
                    long temp=Math.min(pairs[i].f,dis);
                    dis=dis-temp;
                    sum+=pairs[i].c*temp;
                    if (dis==0)
                        break;
                }
                System.out.println(sum);
            }
        }
    }
}
