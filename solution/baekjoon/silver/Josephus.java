package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        String[] arr = str.split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        LinkedList<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= n; i++){
            queue.add(i);
        }

        int cnt = 1;
        Integer temp = 0;
        sb.append("<");
        while(queue.size() >= 1){
            if (cnt == k){
                temp = queue.pollFirst();
                sb.append(temp);
                if (queue.size() >= 1){
                    sb.append(", ");
                } else {
                    sb.append(">");
                }

                cnt = 0;
            } else {
                queue.addLast(queue.pollFirst());
            }
            cnt++;
        }
        System.out.println(sb);

    }


}
