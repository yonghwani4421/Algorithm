/**
* @AUTHOR       yoonghwan
* @DATE         2024-07-26 
* @DESCRIBE     첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 *  *           두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
* @VERSION      1.0
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 0; i < num; i++ ){
            StringBuilder str = new StringBuilder(in.next());
            System.out.println(str.reverse().toString());
        }

    }

}