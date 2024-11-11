/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-26 
* @DESCRIBE     영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 *  *           특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
* @VERSION      1.0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(solution(str));

    }

    public static String solution(String str){
        int lt = 0;
        int rt = str.length()-1;

        char[] charArray = str.toCharArray();

        while(lt < rt){
            if (!Character.isAlphabetic(charArray[lt])){
                lt++;
            } else if(!Character.isAlphabetic(charArray[rt])){
                rt--;
            } else{
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }

        String answer = String.copyValueOf(charArray);

        return answer;
    }

}