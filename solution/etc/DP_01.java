/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-12
 * @DESCRIBE     서로 다른 종류의 통화를 나타내는 N 크기의 coin[ ] 정수 배열과 정수 합계가 주어지면, coin[]의 다양한 조합을 사용하여 합계를 만드는 방법의 수를 찾는 것이 과제
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum = Integer.parseInt(in.nextLine());
        String[] s = in.nextLine().split(" ");

        int[] coins = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            coins[i] = Integer.parseInt(s[i]);
        }

        System.out.println(solution(sum,coins));
    }

    private static int solution(int sum, int[] coins) {
        int answer = 0;

        int [] result = new int[sum  + 1];
        result[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= sum ; i++) {
                result[i] += result[i - coin];
            }
        }

        answer = result[sum];

        return answer;
    }
}