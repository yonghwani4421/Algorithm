/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-26 
* @DESCRIBE     대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
* @VERSION      1.0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();


        System.out.println(solution(input));

    }

    public static String solution(String input){
        String answer = "";


        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }

        }
        return answer;
    }
}