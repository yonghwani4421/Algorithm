package baekjoon;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++){
            queue.add(i);
        }
        while(queue.size() > 1){
            queue.pollFirst();
            queue.addLast(queue.poll());

        }
        System.out.println(queue.peek());
    }
}

