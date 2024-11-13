package inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

public class K번째큰수_05 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(bf.readLine()," ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        solution(N, K, arr);
    }
    private static void solution(int N, int K, int[] arr) {
        int answer;
        // 중복이 없이 내림차순으로 정렬해서 넣는다.
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        if (N < K)
            System.out.println(-1);
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    Tset.add(arr[i] + arr[j] + arr[k]);
                }
            }
        }
        int cnt = 0;
        for (Integer o : Tset) {
            cnt++;
            if (cnt == K)
                System.out.println(o);
        }
    }
}