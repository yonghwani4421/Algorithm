/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-08
 * @DESCRIBE     임시반장 정하기
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        int[][] arr = new int[num+1][6];


        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= 5; j++) {
               arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr,num));

    }

    private static int solution(int[][] arr,int num) {


        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= num; i++) {
            int cnt = 0;
            for (int j = 1; j <= num; j++) {
                for (int k = 1; k <= 5; k++){
                    if (arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt>max){
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }
}