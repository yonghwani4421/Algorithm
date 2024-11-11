/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-08
 * @DESCRIBE     봉우리
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        int[][] arr = new int[num+2][num+2];

        for (int i = 0; i <= num+1; i++){
            for (int j = 0; j <= num+1; j++) {
                if (i == 0 || j == 0 || i == num+1 || j == num+1){
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = in.nextInt();
                }
            }
        }

        System.out.println(solution(arr,num));

    }

    private static int solution(int[][] arr,int num) {
        int cnt = 0;
        for (int i = 0; i <= num+1; i++){
            for (int j = 0; j <= num+1; j++) {
                if (i != 0 && j != 0 && i != num+1 && j != num+1 ){
                    if ((arr[i-1][j] < arr[i][j]) && (arr[i+1][j] < arr[i][j]) && (arr[i][j-1] < arr[i][j]) && (arr[i][j+1] < arr[i][j])){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}