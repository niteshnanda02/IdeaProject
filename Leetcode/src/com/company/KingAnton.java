
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class KingAnton {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = s.nextInt();
        while (t > 0) {
            t--;
            int n = s.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(s.nextInt());
            }
            ArrayList<Integer> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b.add(s.nextInt());
            }
            boolean val = check(a, b);
            if (val)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.get(0)!=b.get(0)){
            return false;
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == b.get(i)) {
                continue;
            } else {
                ArrayList<Integer> get = gete(a, i );
                boolean check = false;
                if (a.get(i) <= b.get(i)) {
                    check = true;
                }
                if (get.size() > 0) {
                    if (check) {
                        if (!get.contains(1)) {
                            return false;
                        }
                    } else {
                        if (!get.contains(-1)) {
                            return false;
                        }
                    }

                }
            }
        }
        return true;
    }

    private static ArrayList<Integer> gete(ArrayList<Integer> a, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(a.get(j));
        }
        return list;
    }
}
