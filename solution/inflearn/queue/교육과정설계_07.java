package inflearn.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정설계_07 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        String fullStr = bf.readLine();

        Queue<Character> queue = new LinkedList<>();
        for (char x : fullStr.toCharArray()) {
            queue.offer(x);
        }

        String result = "";
        for (int i = 0; i < fullStr.length(); i++) {
            if (str.contains(String.valueOf(queue.peek())))
                result += queue.poll();
            else
                queue.poll();
        }

        if (str.equals(result))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}