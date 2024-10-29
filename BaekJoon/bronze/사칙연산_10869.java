package bronze; /**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-12
 * @DESCRIBE
 * @VERSION      1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 사칙연산_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] s = str.split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);


        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }


}