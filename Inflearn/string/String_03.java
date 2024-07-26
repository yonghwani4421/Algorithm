/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-26 
* @DESCRIBE     한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 *              문장속의 각 단어는 공백으로 구분됩니다.
* @VERSION      1.0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();


        System.out.println(solution(input));

    }

    public static String solution(String input){
        String answer = "";
        String[] s = input.split(" ");

        int max = 0;

        for (String s1 : s) {
            if (max < s1.length()){
                max = s1.length();
                answer = s1;
            }
        }

        return answer;
    }
}