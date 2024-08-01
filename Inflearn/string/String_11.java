/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-31
* @DESCRIBE     알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 *              문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 *              단 반복횟수가 1인 경우 생략합니다.
* @VERSION      1.0
*/

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));

    }

    public static String solution(String input){

        int cnt = 1;
        String answer = "";
        for (int i = 0; i < input.length(); i++ ){
            if (i + 1 == input.length()){
                answer += input.charAt(i);
                if (cnt > 1)
                    answer += cnt;
                break;
            }
            if (input.charAt(i) == input.charAt(i+1)){
                cnt++;
            } else {
                answer += input.charAt(i);
                if (cnt > 1)
                    answer += cnt;
                cnt = 1;
            }
        }
        return answer;
    }
}