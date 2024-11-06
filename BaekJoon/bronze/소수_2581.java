package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 소수_2581 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int minNum = Integer.parseInt(bf.readLine());
        int maxNum = Integer.parseInt(bf.readLine());

        int minResult = maxNum;

        int sum = 0;

        for (int i = minNum; i <= maxNum; i++) {


            if (isPrime(i)){
                if (minResult > i){
                    minResult = i;
                }

                sum += i;

            }
        }

        if (sum != 0){
            System.out.println(sum);
            System.out.println(minResult);
        } else {
            System.out.println(-1);
        }
    }

    private static boolean isPrime(int i) {
        if (i <= 1){
            return false;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }



}