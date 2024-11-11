/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-31
* @DESCRIBE     문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *              만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 *              추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
* @VERSION      1.0
*/

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution(str));

    }

    public static int solution(String input){
        String str = input.replaceAll("[^0-9]", "");
        return Integer.valueOf(str);
    }
}