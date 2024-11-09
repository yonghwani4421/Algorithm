package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 문자열반복_2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCaseNum = Integer.parseInt(bf.readLine());
        int iterNum = 0;
        String str = "";

        for (int i = 0; i < testCaseNum; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            iterNum = Integer.parseInt(st.nextToken());
            str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < iterNum; k++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }



}