package com.company;

public class CorrectNanogram {
    public static void main(String[] args) {
        String[][] arr = {{"-","-","-","-","-","-","-","-"},
                {"-","-","-","2","2","1","-","1"},
                {"-","-","-","2","1","1","3","3"},
                {"-","3","1","#","#","#",".","#"},
                {"-","-","2","#","#",".",".","."},
                {"-","-","2",".",".",".","#","#"},
                {"-","1","2","#",".",".","#","#"},
                {"-","-","5","#","#","#","#","#"}};
        System.out.println(correctNonogram(5, arr));
    }

    static boolean correctNonogram(int size, String[][] nonogramField) {
        int si = (size + 1) / 2;
        for (int i = si ; i < si+2; i++) {
            //coloumm;
            int black=0;
            if (!nonogramField[si - 2][i].equals("-")){
                black = Integer.parseInt(nonogramField[si-2][i]);
            }
            if (!nonogramField[si - 1][i].equals("-")){
                black+= Integer.parseInt(nonogramField[si-1][i]);
            }
            for (int k = si ; k < nonogramField.length; k++) {
                if (nonogramField[k][i] == "#") {
                    if (black > 0) {
                        black--;
                    } else {
                        return false;
                    }
                }

            }
            if (black != 0) {
                return false;
            }
            black=0;
            //row;
            if (!nonogramField[i][si - 2].equals("-")){
                black = Integer.parseInt(nonogramField[i][si - 2]);
            }
            if (!nonogramField[i][si - 1].equals("-")){
                black+= Integer.parseInt(nonogramField[i][si - 1]);
            }
            for (int k = si ; k < nonogramField.length; k++) {
                if (nonogramField[i][k] == "#") {
                    if (black > 0) {
                        black--;
                    } else {
                        return false;
                    }
                }

            }
            if (black != 0) {
                return false;
            }

        }


        return true;
    }

}
