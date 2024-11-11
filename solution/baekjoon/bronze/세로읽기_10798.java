package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 세로읽기_10798 {
    private static final int N = 5;
    private static final int M = 15;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char[][] result = new char[N][M];
        result = initRowColumn(bf, result);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (result[j][i] != 0)
                    sb.append(result[j][i]);
            }
        }

        System.out.println(sb.toString());
    }

    private static char[][] initRowColumn(BufferedReader bf, char[][] array) throws IOException {
        for (int i = 0; i < N; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                array[i][j] = str.charAt(j);
            }
        }
        return array;
    }
}