/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-26 
* @DESCRIBE     앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *              문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *              단 회문을 검사할 때 대소문자를 구분하지 않습니다.
* @VERSION      1.0
*/

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String lowerCase = str.toLowerCase();
        System.out.println(solution(lowerCase));

    }

    public static String solution(String str){
        String reverseStr = new StringBuilder(str).reverse().toString();

        String answer = "";

        if (str.equals(reverseStr)){
            answer = "YES";
        } else {
            answer = "NO";
        }

        return answer;
    }

}