import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *설명
 *
 * N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 N=15이면
 *
 * 7+8=15
 *
 * 4+5+6=15
 *
 * 1+2+3+4+5=15
 *
 * 와 같이 총 3가지의 경우가 존재한다.
 *
 *
 * 입력
 *
 * 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.
 *
 *
 * 출력
 *
 * 첫 줄에 총 경우수를 출력합니다.
 *
 * 출력
 */

// runtime over

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());


        int[] arr = new int[num];

        solution2(num, arr);


//        solution1(num, arr);


    }

    private static void solution2(int num, int[] arr) {
        for (int i = 0; i < (num /2)+1; i++) {
            arr[i] = i+1;
        }
        int lt = 0, sum = 0, result = 0;
        for (int rt = 0; rt < (num /2)+1; rt++){
            sum+= arr[rt];
            if (sum == num)
                result++;

            while(sum>= num){
                sum-= arr[lt++];
                if (sum== num) result++;
            }


        }

        System.out.println(result);
    }


    private static void solution1(int num, int[] arr) {

        for (int i = 0; i < num; i++) {
            arr[i] = i+1;
        }
        int lt = 0;

        int sum = 0;
        int result = 0;
        for (int rt = 0; rt < num -1; rt++) {

            sum += arr[rt];
            if (sum == num){
                result++;
            }

            while(sum>= num){
                sum-= arr[lt++];
                if (sum== num) result++;
            }

        }

        System.out.println(result);
    }


}