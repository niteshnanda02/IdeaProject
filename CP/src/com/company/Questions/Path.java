package com.company.Questions;

public class Path {
    public static void main(String[] args) {
        System.out.println(new Solutions().uniquePaths(19,13));
    }
}
class Solutions {
    public int uniquePaths(int m, int n) {
        return path(1,1,m,n);
    }

    private int path(int cr ,int cc, int er, int ec) {
        if(cr>er||cc>ec)
            return 0;
        if(cr==er&&cc==ec)
            return 1;
        int count=0;
        count+=path(cr+1,cc,er,ec);

        count+=path(cr,cc+1,er,ec);

        return count;
    }
}