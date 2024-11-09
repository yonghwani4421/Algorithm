/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-02
 * @DESCRIBE     자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 *              만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        System.out.println(solution(num));
    }



    public static int solution(int num){
        int answer = 0;
        int[] ch = new int[num + 1];

        for (int i = 2; i <= num; i++){
            if (ch[i] == 0){
                answer++;
                for (int j = i; j <= num; j=j+i){
                        ch[j] = 1;
                }
            }
        }
        return answer;
    }

}