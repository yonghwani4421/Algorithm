package inflearn.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 응급실_08 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine()," ");

        Queue<HashMap<Integer,Integer>> queue = new LinkedList<>();
        Queue<Integer> sortQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int val = Integer.parseInt(st.nextToken());
            sortQueue.offer(val);
            map.put(val,i);
            queue.offer(map);
        }

        int cnt=0;
        boolean isRight = false;
        while(!sortQueue.isEmpty()){

            HashMap<Integer,Integer> map = queue.peek();

            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
                if (integerIntegerEntry.getKey().equals(sortQueue.peek())){
                    sortQueue.poll();
                    queue.poll();
                    cnt++;
                    if (integerIntegerEntry.getValue() == M){
                        isRight = true;
                        break;
                    }
                } else {
                    queue.offer(queue.poll());
                }
            }
            if (isRight){
                break;
            }
        }
        System.out.println(cnt);
    }
}