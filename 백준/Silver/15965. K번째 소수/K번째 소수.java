import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

/**
 *설명
 *
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
 *
 * 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
 *
 * 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
 *
 * 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
 *
 *
 * 입력
 *
 * 첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
 *
 *
 *
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(bf.readLine());

        int n = 500000;
        int[] arr = new int[500001];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) continue;
            for (int j = i+i; j <= n ; j += i) {
                arr[j] = 0;
            }
        }


        int cnt = 1;

        for (int i = 2; i <= n; i++) {
            if (arr[i] != 0){
                if(cnt == K){
                    System.out.println(i);
                    break;
                }
                cnt++;
            }
        }

    }

    private static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}