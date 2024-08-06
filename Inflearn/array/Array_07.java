/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-02
 * @DESCRIBE     점수 계산
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        int cnt = 1;
        int answer = 0;
        for (int i = 0; i < num; i++){

            if (Integer.parseInt(in.next()) > 0){
                answer += cnt;
                cnt++;
            } else {
                cnt = 1;
            }

        }
        System.out.println(answer);
    }
}