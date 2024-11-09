package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 개수세기_10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int arrayCount = Integer.parseInt(bf.readLine());

        String[] array = bf.readLine().split(" ");


        int v = Integer.parseInt(bf.readLine());
        int result = 0;
        for (String num : array) {
            if (v == Integer.parseInt(num)){
                result++;
            }
        }

        System.out.print(result);




    }
}