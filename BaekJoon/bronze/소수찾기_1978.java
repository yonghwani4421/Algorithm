package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 소수찾기_1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int result = 0;

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());

            // 소수가 되는 조건
            // 자기 자신하고 1만 약수로 존재해야한다.
            // 1보다 커야한다.

            int factor = 0;
            for (int i = 1; i <= num; i++) {
                if(num % i == 0)
                    factor++;
            }

            if (factor == 2){
                result++;
            }
        }

        System.out.println(result);
    }
}