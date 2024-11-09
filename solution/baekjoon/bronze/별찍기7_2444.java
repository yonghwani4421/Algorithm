package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 별찍기7_2444 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= N; i++) {
            // 스페이스 찍기
            for (int j = 0; j <N - i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = N - 1; i >= 0; i--) {
            // 스페이스 찍기
            for (int j = 0; j <N - i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i*2-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }
}