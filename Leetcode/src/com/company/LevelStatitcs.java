
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LevelStatitcs {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = s.nextInt();
        while (t > 0) {
            t--;
            int n = s.nextInt();
            ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(s.nextInt());
                list.add(s.nextInt());
                lists.add(list);

            }
            boolean val=check(n, lists);
            if (val){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }

    private static boolean check(int n, ArrayList<ArrayList<Integer>> lists) {
        if (lists.size() == 1) {
            if (lists.get(0).get(1) <= lists.get(0).get(0)) {
                return true;
            } else
                return false;
        }

        for (int i = 1; i < lists.size(); i++) {
            ArrayList<Integer> list1 = lists.get(i - 1);
            ArrayList<Integer> list2 = lists.get(i);
            if(list2.get(1)>list1.get(1)&&list2.get(0)>list1.get(0)){
                if ((list2.get(1) <= list2.get(0)) && (list1.get(1) <= list1.get(0)) && (list2.get(0) >= list1.get(0)) && (list2.get(1) >= list1.get(1))) {
                }

                else {
                    return false;
                }
            }
            else if ((list2.get(1) <= list2.get(0)) && (list1.get(1) <= list1.get(0)) && (list2.get(0) >= list1.get(0)) && (list2.get(1) >= list1.get(1))) {
            }

            else {
                return false;
            }

        }
        return true;
    }
}
