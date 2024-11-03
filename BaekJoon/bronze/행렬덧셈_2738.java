package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 행렬덧셈_2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s1 = bf.readLine().split(" ");
        int N = Integer.parseInt(s1[0]);
        int M = Integer.parseInt(s1[1]);
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        printAddRowColumn(N, M, initRowColumn(bf, N, M), initRowColumn(bf, N, M));

    }

    private static void printAddRowColumn(int N, int M, int[][] A, int[][] B) {
        int[][] result = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] initRowColumn(BufferedReader bf, int N, int M) throws IOException {
        int[][] array = new int[N][M];
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