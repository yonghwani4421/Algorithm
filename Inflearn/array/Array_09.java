/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-08
 * @DESCRIBE     격자판
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());

        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr,num));

    }

    private static int solution(int[][] arr,int num) {

        int max = 0;
        int tempJ = 0;
        int tempI = 0;
        int tempR = 0;
        int tempL = 0;

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++) {
                if ( i == j ){
                    tempL += arr[i][j];
                } else if (((i + j) == (num -1))){
                    tempR += arr[i][j];
                }
                tempJ += arr[i][j];
                tempI += arr[j][i];
            }
            if (max < tempJ){
                max = tempJ;
            }
            if (max < tempI){
                max = tempI;
            }
            tempJ = 0;
            tempI = 0;
        }


        return Math.max(Math.max(tempL, tempR),max);
    }
}
