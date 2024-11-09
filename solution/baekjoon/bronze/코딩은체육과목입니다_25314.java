package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 코딩은체육과목입니다_25314 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int saveByte = Integer.parseInt(bf.readLine());

        int count = saveByte / 4;

        String result = "";

        for (int i = 0; i < count - 1; i++) {
            result += "long ";
        }

        result += "long int";

        System.out.println(result);


    }
}