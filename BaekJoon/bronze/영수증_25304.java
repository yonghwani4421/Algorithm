package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 영수증_25304 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalAmount = Integer.parseInt(bf.readLine());
        int totalCount = Integer.parseInt(bf.readLine());

        int tempTotalAmount = 0;

        int amount = 0;
        int count = 0;
        for (int i = 0; i < totalCount; i++) {
            String[] receiptContents = bf.readLine().split(" ");

            amount = Integer.parseInt(receiptContents[0]);
            count = Integer.parseInt(receiptContents[1]);

            tempTotalAmount += amount*count;

        }

        if (tempTotalAmount == totalAmount){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}