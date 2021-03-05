
import java.util.ArrayList;
import java.util.Scanner;

public class TheBestVacation {
    public static void main(String[] args) {
        System.out.println(Math.log(32)/Math.log(2));
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int x = s.nextInt();
        ArrayList<Long> list=new ArrayList<>();
        for (long i = 0; i < n; i++) {
            long val = s.nextLong();
            for (long j = 1; j <= val; j++) {
                list.add(j);
            }
        }
        long max_sum = 0, curr_sum = 0;
        long N = list.size();
        int windowStart = 0;
        for (int window_end = 0; window_end < N; window_end++) {
            curr_sum += list.get(window_end);
            if (window_end >= x - 1) {
                max_sum = Math.max(max_sum, curr_sum);
                if (window_end < N - 1) {
                    windowStart++;
                    curr_sum -= list.get(window_end - (x - 1));
                }
            }
        }
        int j = 0;
        for (int i = windowStart; j < N && i < N; i++, j++) {
            curr_sum -= list.get(i);
            curr_sum += list.get(j);
            max_sum = Math.max(curr_sum, max_sum);

        }
        System.out.println(max_sum);
    }
}
