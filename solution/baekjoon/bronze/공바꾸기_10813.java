package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 공바꾸기_10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strCast = bf.readLine().split(" ");

        int basketCount = Integer.parseInt(strCast[0]);
        int methodCount = Integer.parseInt(strCast[1]);

        int[] basket = new int[basketCount+1];

        int firstNum , secondNum;


        // 초기화

        for (int i = 1; i <= basketCount; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < methodCount; i++) {
            String[] str = bf.readLine().split(" ");

            firstNum = Integer.parseInt(str[0]);
            secondNum = Integer.parseInt(str[1]);

            int temp = basket[firstNum];
            basket[firstNum] = basket[secondNum];
            basket[secondNum] = temp;

        }

        for (int i = 1; i < basketCount+1; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}