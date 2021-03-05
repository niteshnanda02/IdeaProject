package TCSCodeVitaMock;

import java.util.*;


class GFG {



    public static void main(String[] args)  {
        Scanner s=new Scanner(System.in);

        int n = s.nextInt();
        int input[] = new int[n];
        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
            if (input[i] > max)
                max = input[i];
        }
        int max_length = Integer.toBinaryString(max).length();
        ArrayList<Integer> binaryList = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            String booleanString = convert(input[i], max_length);
            int[] count = countZeroOne(booleanString);
            binaryList.add(count[0] - count[1]);
        }
        int onearray[] = new int[binaryList.size()];
        for (int i = 0; i < binaryList.size(); i++) {
            onearray[i] = binaryList.get(i).intValue();
        }
        int ans = subSum(onearray, binaryList.size(), 0);

        System.out.println(convert(ans, max_length));


    }
    public static String convert(int num, int len) {
        if (len > 0) {
            return String.format("%" + len + "s",
                    Integer.toBinaryString(num)).replaceAll(" ", "0");
        }
        return null;
    }
    static int subSum(int arr[], int n, int sum) {
        int curr = 0;
        int resul = 0;

        HashMap<Integer, Integer> oldSum = new HashMap<>();


        for (int i = 0; i < n; i++) {


            curr += arr[i];

            if (curr == sum)
                resul++;


            if (oldSum.containsKey(curr - sum))
                resul += oldSum.get(curr - sum);

            Integer count = oldSum.get(curr);
            if (count != null)
                oldSum.put(curr, count+1);
            else
                oldSum.put(curr, 1);
        }

        return resul;
    }

    public static int[] countZeroOne(String binaryString) {
        int rs[] = new int[2];
        int one = 0, zero = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1')
                one++;
            else
                zero++;
        }
        rs[0] = zero;
        rs[1] = one;
        return rs;
    }


}