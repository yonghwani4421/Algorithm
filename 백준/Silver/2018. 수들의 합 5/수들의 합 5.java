import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int [] arr = new int[N+1];
        for (int i = 1; i <= N; i++) {
           arr[i] = i;
        }
        int sum = 0;
        int answer = 0;
        for (int lt = 1; lt <= N; lt++) {
            for (int rt = lt; rt <= N; rt++) {
                sum += arr[rt];
                if (sum == N){
                    answer++;
                    sum = 0;
                    break;
                } else if (sum > N) {
                    sum = 0;
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}