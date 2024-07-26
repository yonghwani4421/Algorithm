/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-26 
* @DESCRIBE     소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 *              중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
* @VERSION      1.0
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));

    }

    public static String solution(String str){
        char[] charArray = str.toCharArray();

        Set<Character> set = new HashSet<>();
        String answer = "";

        for(int i = 0; i < charArray.length; i++){
            char c = charArray[i];
            if (!set.contains(c)){
                set.add(c);
                answer += c;
            }
        }
        return answer;
    }

}