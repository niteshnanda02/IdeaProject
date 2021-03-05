
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LittleArtem {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = s.nextInt();
        while (t > 0) {
            t--;
            int n = s.nextInt(), m = s.nextInt();
            System.out.println(check(n, m));
        }
    }

    private static String check(int n, int m) {
        char[][] arr = new char[n][m];
        int v = n * m;
        int B = (v / 2) + 1, W = v - B;
        boolean bf = false, wf = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    arr[i][j] = 'B';
                    bf = true;
                }
                else {
                    if (W == 0 && B > 0) {
                        arr[i][j] = 'B';
                        B--;
                    } else if (B == 0 && W > 0) {
                        arr[i][j] = 'W';
                        W--;
                    } else {
                        if (bf) {
                            arr[i][j] = 'W';
                            wf = true;
                            bf=false;
                            W--;
                        } else if (wf) {
                            arr[i][j] = 'B';
                            bf = true;
                            wf=false;
                            B--;
                        }

                    }
                }
            }
        }
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans += arr[i][j];
            }
            if (i != n - 1)
                ans += "\n";
        }
        return ans;
    }
}
