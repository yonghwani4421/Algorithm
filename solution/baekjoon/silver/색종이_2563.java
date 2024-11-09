package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 색종이_2563 {

    private static final int WIDTH = 101;
    private static final int HEIGHT = 101;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 색종이 갯수
        int numberOfPaper = Integer.parseInt(bf.readLine());

        // 도화지
        boolean[][] arr = new boolean[WIDTH][HEIGHT];

        int result = 0;
        for (int i = 0; i < numberOfPaper; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]){
                        arr[j][k] = true;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }

}