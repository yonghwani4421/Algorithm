package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 소인수분해_11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        int cnt = 2;

        while(num != 1){
            if (num % cnt == 0){
                num = num / cnt;
                System.out.println(cnt);
            } else {
                cnt++;
            }
        }
    }
}