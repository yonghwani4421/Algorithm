/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-26 
* @DESCRIBE     한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *              대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
* @VERSION      1.0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        String input2 = in.next();

        System.out.println(solution(input1,input2));

    }

    public static int solution(String input1, String input2){
        int cnt = 0;

        for (int i = 0; i < input1.length(); i++){
            char c = input1.charAt(i);
            String value = String.valueOf(c);

            if (input2.toLowerCase().equals(value.toLowerCase())){
                cnt++;
            }

        }


        return cnt;
    }
}