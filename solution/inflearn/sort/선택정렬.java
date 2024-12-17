package inflearn.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 선택정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int [] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 선택정렬
        for (int i = 0; i < N-1; i++) {
            int idx = i;
            for (int j = i+1; j < N; j++) {
                if (arr[j] < arr[idx]){
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}