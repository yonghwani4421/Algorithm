/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-02
 * @DESCRIBE     등수 구하기
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        int[] arr = new int[num];

        for (int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(in.next());
        }
        solution(arr);

    }

    private static void solution(int[] arr) {

        int[] answer = new int[arr.length];

        int cnt;
        for (int i = 0; i < arr.length; i++) {
            cnt = 1;
            for (int j = 0; j < arr.length;j++){
                if (arr[i] < arr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}