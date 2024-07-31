/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-31
* @DESCRIBE     한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
* @VERSION      1.0
*/

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String b = in.next();
        int[] solution = solution(str, b.charAt(0));

        for (int i : solution) {
            System.out.print(i + " ");
        }

    }

    public static int[] solution(String input, char b){
        int[] result = new int[input.length()];

        int p = 1000;

        for (int i = 0; i < input.length(); i++){

            if (input.charAt(i) == b){
                p = 0;
                result[i] = p;
            } else {
                p++;
                result[i] = p;
            }
        }
        p=1000;

        for (int i = input.length() - 1; i >= 0; i--){
            if (result[i] == 0){
                p = 0;
            } else {
                p++;
                result[i] = Math.min(p,result[i]);
            }
        }

       return result;

    }
}