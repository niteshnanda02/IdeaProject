package codevita;

import java.util.Scanner;
import java.util.Vector;

public class PathGraph {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long m=s.nextLong();
        long n=s.nextLong();
        int c=0;
        if(m==n){
            System.out.println(0);
        }else {
            if(m<n){
                long t=m;
                m=n;
                n=t;
            }
            Vector<Long> apath=new Vector<>();
            Vector<Long> bpath=new Vector<>();

            long afact=getLargestDivisor(m);
            apath.add(m);
            apath.add(afact);
            while(afact!=1)
            {
                afact = getLargestDivisor(afact);
                apath.add(afact);
            }

            long bfact = getLargestDivisor(n);
            bpath.add(n);
            bpath.add(bfact);
            while(bfact!=1)
            {
                bfact = getLargestDivisor(bfact);
                bpath.add(bfact);
            }

            int N = apath.size();
            int M = bpath.size();
            int i = 0;
            int j = 0;

            int ans = -1;
            while(i<N && j<M)
            {
                if(apath.get(i)==bpath.get(j))
                {
                    ans = i+j;
                    break;
                }
                else if(apath.get(i)<bpath.get(j))
                {
                    j++;
                }
                else {
                    i++;
                }
            }

            System.out.println(ans);


        }
    }

    public static long getLargestDivisor(long n) {

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long temp = n / i;
                if (n % temp == 0) {
                    return temp;
                }
            }
        }

        return 1;
    }
}
