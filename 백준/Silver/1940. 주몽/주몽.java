import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");


        // init
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if(arr[i] + arr[j] == M){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}