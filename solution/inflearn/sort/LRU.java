package inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class LRU {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));



        StringTokenizer st = new StringTokenizer(bf.readLine());

        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        int [] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> cache = new LinkedList<>();

        // 초기화
        for (int i = 0; i < S; i++) {
            cache.add(0);
        }

        // 계산
        for (int i = 0; i < N; i++) {
            if (!cache.contains(arr[i])){
                cache.addFirst(arr[i]);
                cache.pollLast();
            } else {
                cache.remove(arr[i]);
                cache.addFirst(arr[i]);
            }

        }

        for (Integer integer : cache) {
            System.out.print(integer + " ");
        }
    }
}