/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-09
 * @DESCRIBE     멘토링
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arrStd = new int[m][n];


        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                arrStd[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(arrStd,m,n));

    }

    private static int solution(int[][] arrStd,int m,int n) {
        int answer = 0;


        for (int i = 1; i <= n; i++){        // 멘토
            for (int j = 1; j <= n; j++) {   // 멘티
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (arrStd[k][s] == i) pi = s;
                        if (arrStd[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }
}