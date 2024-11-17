package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 크레인인형뽑기_03 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine()," ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int M = Integer.parseInt(bf.readLine());

        int[] moves = new int[M];
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        for (int i = 0; i < M; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, arr, M, moves));

    }

    private static int solution(int N, int[][] arr, int M, int[] moves) {
        Stack<Integer> stack = new Stack();
        int cnt = 0;
        // moves 하나씩
        for (int i = 0; i < M; i++) {
            int move = moves[i];

            int value = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j][move-1] != 0){
                    value = arr[j][move-1];
                    arr[j][move-1] = 0;
                    break;
                }
            }

            if (stack.empty()){
                stack.push(value);
            } else {
                if (!stack.peek().equals(value)){
                    stack.push(value);
                } else {
                    stack.pop();
                    cnt += 2;
                }
            }
        }
        return cnt;
    }
}