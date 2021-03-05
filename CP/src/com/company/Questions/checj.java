package com.company.Questions;

public class checj {
    static int lds(int input1,int input2[])
    {
        int lds[] = new int[input1];
        int i, j, max = 0;

        // Initialize LDS with 1
        // for all index. The minimum
        // LDS starting with any
        // element is always 1
        for (i = 0; i < input1; i++)
            lds[i] = 1;

        // Compute LDS from every
        // index in bottom up manner
        for (i = 1; i < input1; i++)
            for (j = 0; j < i; j++)
                if (input2[i] < input2[j] &&
                        lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;

        // Select the maximum
        // of all the LDS values
        for (i = 0; i < input1; i++)
            if (max < lds[i])
                max = lds[i];

        // returns the length
        // of the LDS
        return max;
    }
    public static void main(String[] args) {
//        System.out.println(lds(new int[]{1,3,2},3));
    }
}
