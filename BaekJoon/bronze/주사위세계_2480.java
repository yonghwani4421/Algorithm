package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 주사위세계_2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] diceNumber = bf.readLine().split(" ");

        int[] diceCountArray  = new int[7];
        int maxValue = 0;
        int duplicationCount = 0;
        int element = 0;


        for (String number : diceNumber) {
            int num = Integer.parseInt(number);
            diceCountArray[num]++;
            if (maxValue < num){
                maxValue = num;
            }
        }



        for (int i = 0; i < diceCountArray.length; i++) {
            if (duplicationCount < diceCountArray[i]){
                duplicationCount = diceCountArray[i];
                element = i;
            }
        }

        if (duplicationCount == 1){
            System.out.println(maxValue * 100);
        } else if (duplicationCount == 2){
            System.out.println(1000 + element * 100);
        } else if (duplicationCount == 3) {
            System.out.println(10000 + element * 1000);
        }


    }
}