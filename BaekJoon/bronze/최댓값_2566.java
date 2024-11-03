package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 최댓값_2566 {
    private static final int N = 9;
    private static final int M = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[][] result = new int[N][M];
        result = initRowColumn(bf, result);

        int max = 0;
        int indexN = 0;
        int indexM = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (max < result[i][j]){
                    max = result[i][j];
                    indexN = i;
                    indexM = j;
                }
            }

        }

        System.out.println(max);
        System.out.println((indexN + 1) + " " + (indexM + 1));
    }

    private static int[][] initRowColumn(BufferedReader bf, int[][] array) throws IOException {
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            for (int j = 0; j < M; j++) {
                String s = st.nextToken();
                int element = Integer.parseInt(s);
                array[i][j] = element;
            }
        }
        return array;
    }
}