package baekjoon.silver;


import java.io.*;
import java.util.*;

public class Main {

    public static class Queue {


        LinkedList<Integer> queue;

        public Queue() {
            queue = new LinkedList<>();
        }

        public int empty(){
            if (queue.isEmpty()){
                return 1;
            } else {
                return 0;
            }
        }

        public void push(int value){
            queue.add(value);
        }

        public int pop(){

            if (queue.isEmpty()){
                return -1;
            }
            return queue.pollFirst();
        }

        public int size(){
            return queue.size();
        }
        public int front(){
            if (queue.isEmpty()){
                return -1;
            }

            return queue.peekFirst();
        }

        public int back(){
            if (queue.isEmpty()){
                return -1;
            }
            return queue.peekLast();
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Queue queue = new Queue();

        for (int i = 0; i < N; i ++){
            String str = br.readLine();

            String[] s = str.split(" ");

            if ("push".equals(s[0])){
                queue.push(Integer.parseInt(s[1]));
            } else if ("pop".equals(s[0])) {
                sb.append(queue.pop()).append("\n");
            } else if ("size".equals(s[0])) {
                sb.append(queue.size()).append("\n");
            } else if ("empty".equals(s[0])) {
                sb.append(queue.empty()).append("\n");
            } else if ("front".equals(s[0])) {
                sb.append(queue.front()).append("\n");
            } else if ("back".equals(s[0])) {
                sb.append(queue.back()).append("\n");
            }
        }
        System.out.println(sb);


    }
}

