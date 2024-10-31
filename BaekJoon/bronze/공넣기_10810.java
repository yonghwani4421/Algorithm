package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 공넣기_10810 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strCast = bf.readLine().split(" ");

        // 바구니 갯수
        int basketCount = Integer.parseInt(strCast[0]);
        // 공 넣는 방법의 갯수
        int methodCount = Integer.parseInt(strCast[1]);

        // 바구니
        int[] basket = new int[basketCount];

        // 값 0으로 초기화
        for (int i = 0; i < basketCount; i++) {
            basket[i] = 0;
        }

        // 시작 끝 범위
        int start, end;
        // 값
        int value;

        for (int i = 0; i < methodCount; i++) {

            String[] str = bf.readLine().split(" ");

            start = Integer.parseInt(str[0]);
            end = Integer.parseInt(str[1]);
            value = Integer.parseInt(str[2]);

            for (int j = start-1; j < end; j++) {
                basket[j] = value;
            }
        }
        for (int i : basket) {
            System.out.print(i + " ");
        }

    }
}