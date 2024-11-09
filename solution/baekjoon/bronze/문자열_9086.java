package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 문자열_9086 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int wordsNum = Integer.parseInt(bf.readLine());

        String temp = "";
        String[] result = new String[wordsNum];
        for (int i = 0; i < wordsNum; i++) {
            temp = bf.readLine();
            result[i] = String.valueOf(temp.charAt(0)) + String.valueOf(temp.charAt(temp.length() - 1));
        }

        for (String s : result) {
            System.out.println(s);
        }

    }



}