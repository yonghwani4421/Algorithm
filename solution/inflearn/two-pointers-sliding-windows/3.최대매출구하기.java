import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *설명
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 *
 * 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
 *
 * 12 1511 20 2510 20 19 13 15
 *
 * 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 *
 * 여러분이 현수를 도와주세요.
 *
 *
 * 입력
 *
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 *
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 *
 *
 * 출력
 *
 *첫 줄에 최대 매출액을 출력합니다.
 */

// runtime over

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s = bf.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        int[] pointList = new int[K];

        for (int i = 0; i < K; i++) {
            pointList[i] = i;
        }

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        slidingWindows(N, K, arr);
    }

    private static void slidingWindows(int N, int K, int[] arr) {
        int answer = 0;
        int sum = 0;
        // 처음 K개의 합계를 먼저 구한다.
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        answer = sum;

        // N번 돌면서 계산
        for (int i = K; i < N; i++) {
            // Window에서 가장 뒤의 값을 더하고 제일 앞의 값을 빼준다.
            sum+=(arr[i]- arr[i- K]);
            // 최댓값 구하기
            if (answer < sum)
                answer = sum;
        }
        System.out.println(answer);
    }

    // 속도 초과 O (N X K)
    private static ArrayList<Integer> version1(int N, int K, int[] pointList, int[] arr, ArrayList<Integer> answer) {
        while(N > pointList[K -1]){

            // K일 연속 매출의 총합
            int sum = 0;
            // K일 중 첫째날 인덱스
            int point = pointList[0];
            for (int i = 0; i < pointList.length; i++) {
                // K일 총합 계산
                sum += arr[point];
                // 계산이 끝나면 다음 인덱스를 증가시켜 pointList에 넣어준다.
                point++;
                pointList[i] = point;
            }
            answer.add(sum);
        }
        return answer;
    }
}