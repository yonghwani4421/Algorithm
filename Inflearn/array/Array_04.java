/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-02
 * @DESCRIBE    1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *              2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * @VERSION      1.0
 */
import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        solution(num);
    }



    public static void solution(int num){

        int num1 = 0;
        int num2 = 0;

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < num; i++){
            if (i == 0){
                num1 = 1;
                list.add(1);

            } else if (i == 1){
                num2 = 1;
                list.add(1);
            } else{
               int temp = (num1 + num2);
               list.add(temp);
               num1 = num2;
               num2 = temp;
            }
        }


        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

    }
}