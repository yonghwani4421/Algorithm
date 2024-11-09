import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *설명
 *
 * N개의 수로 이루어진 수열이 주어집니다.
 *
 * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
 *
 * 만약 N=8, M=6이고 수열이 다음과 같다면
 *
 * 1 2 1 3 1 1 1 2
 *
 * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 *
 *
 * 입력
 *
 * 첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
 *
 * 수열의 원소값은 1,000을 넘지 않는 자연수이다.
 *
 *
 * 출력
 */

// runtime over

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s = bf.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int[] arr = new int[N];

        // arr 리스트
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

//        solution1(N, M, arr);
        solution2(N, M, arr);

    }

    // 다른 풀이
    private static void solution2(int N,int M, int[] arr) {
        int sum = 0;
        int lt = 0;
        int result = 0;


        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];
            if (sum == M) result++;
            while(sum>=M){
                sum-=arr[lt++];
                if (sum==M) result++;
            }

        }

        System.out.println(result);

    }

    // 내 풀이
    private static void solution1(int N,int M, int[] arr) {
        // 연속된 부분수열의 합
        int sum = 0;
        int point1 = 0;
        int point2 = 0;
        int result = 0;
        while (N > point1){
            sum += arr[point2];
            if (sum > M){
                point1++;
                point2 = point1;
                sum = 0;
            }else if( sum == M){
                point1++;
                point2 = point1;
                result++;
                sum = 0;
            } else {
                if (point2 < N -1){
                    point2++;
                } else {
                    point1++;
                    point2 = point1;
                    sum = 0;
                }
            }
        }

        System.out.println(result);
    }

}