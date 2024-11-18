package inflearn.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 공주구하기_06 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int cnt = 1;
        while(queue.size() != 1){
            if (cnt == K){
                queue.poll();
//                System.out.println("poll : " + queue.poll());
                cnt = 1;
            } else {
                int value = (int)queue.poll();
                queue.offer(value);
                cnt++;
            }
        }

        System.out.println(queue.peek());


    }
}