package baekjoon.bronze; /**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-12
 * @DESCRIBE     (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 * @VERSION      1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 곱셈_2588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int num1 = Integer.parseInt(a);

        int cnt = 1;
        int sum = 0;

        for (int i = a.length() - 1; i >= 0; i--) {

            int temp = Integer.parseInt(String.valueOf(b.charAt(i)));

            int result = num1 * temp;
            System.out.println(result);

            sum += result * cnt;
            cnt *= 10;
        }

        System.out.println(sum);

    }


}