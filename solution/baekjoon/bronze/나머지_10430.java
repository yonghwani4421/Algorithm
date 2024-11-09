package baekjoon.bronze; /**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-12
 * @DESCRIBE     서로 다른 종류의 통화를 나타내는 N 크기의 coin[ ] 정수 배열과 정수 합계가 주어지면, coin[]의 다양한 조합을 사용하여 합계를 만드는 방법의 수를 찾는 것이 과제
 * @VERSION      1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 나머지_10430 {

    private static final int YEAR = 543;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] s1 = s.split(" ");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s1[2]);


        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println( (a*b)%c);
        System.out.println(((a%c) * (b%c))%c);





    }


}