package inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 설명
 *
 * 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
 *
 * 각 구간별로 구하라고 했습니다.
 *
 * 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
 *
 * 20 12 20 10 23 17 10
 *
 * 각 연속 4일간의 구간의 매출종류는
 *
 * 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
 *
 * 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
 *
 * 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
 *
 * 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
 *
 * N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
 *
 * 매출액의 종류를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 *
 * 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 *
 * 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
 *
 *
 *
 *
 */

public class 매출액의종류_03 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < K-1; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int lt = 0;
        int rt = lt + K - 1;
        int cnt = 0;
        while(rt < N){
            if (cnt == 0){
                map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            } else{
                map.put(arr[lt],map.get(arr[lt])-1);
                if (map.get(arr[lt]) == 0)
                    map.remove(arr[lt]);
                map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
                lt++;
            }
            rt++;
            cnt++;
            System.out.print(map.size() + " ");
        }
    }
}