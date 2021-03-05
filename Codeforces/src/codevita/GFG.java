package codevita;
//https://www.techiedelight.com/k-partition-problem-print-all-subsets/

import java.util.*;

public class GFG {
    static ArrayList<ArrayList<Integer>> lists;


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        ArrayList<Integer> goods = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int g = s.nextInt();
            goods.add(g);
            for (int j = 0; j < g; j++) {
                weight.add(s.nextInt());
            }
        }
        int[] total_array = new int[weight.size()];
        for (int i = 0; i < weight.size(); i++) {
            total_array[i] = weight.get(i);
        }
        lists = new ArrayList<>();
        equalWeights(total_array, k);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < lists.size(); i++) {
            ArrayList<Integer> sublist = lists.get(i);
            Collections.sort(sublist);
            ans.add(sublist);
        }
        ans.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> integers, ArrayList<Integer> t1) {
                return integers.get(0) - t1.get(0);
            }
        });
        for (int i = 0; i < ans.size(); i++) {
            ArrayList<Integer> list = ans.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void equalWeights(int[] total_array, int k) {

        int array_sum = Arrays.stream(total_array).sum();

        int[] rem_sum_left = new int[k];
        Arrays.fill(rem_sum_left, array_sum / k);
        int N = total_array.length;

        int[] check = new int[N];

        boolean res = Sum(total_array, N - 1, rem_sum_left, check, k);

        if (res) {
            for (int i = 0; i < k; i++) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 0; j < N; j++)
                    if (check[j] == i + 1)
                        list.add(total_array[j]);
                lists.add(list);
            }
        }
    }

    private static boolean basecase(int[] res_sum_left, int k) {
        boolean res = true;
        for (int i = 0; i < k; i++) {
            if (res_sum_left[i] != 0)
                res = false;
        }

        return res;
    }

    private static boolean Sum(int[] target_sum, int N, int[] rem_sum_left, int[] check, int k) {
        if (basecase(rem_sum_left, k))
            return true;

        if (N < 0)
            return false;

        boolean rs = false;

        for (int i = 0; i < k; i++) {
            if (!rs && (rem_sum_left[i] - target_sum[N]) >= 0) {
                check[N] = i + 1;

                rem_sum_left[i] = rem_sum_left[i] - target_sum[N];

                rs = Sum(target_sum, N - 1, rem_sum_left, check, k);

                rem_sum_left[i] = rem_sum_left[i] + target_sum[N];
            }
        }

        return rs;
    }


}
