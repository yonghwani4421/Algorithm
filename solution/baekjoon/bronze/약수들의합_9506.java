package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class 약수들의합_9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int value;

        StringBuilder sb = new StringBuilder();

        while ((value = Integer.parseInt(bf.readLine())) != -1) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < value; i++) {
                if (value % i == 0) {
                    sum += i;
                    list.add(i);
                }
            }
            if (sum == value) {
                sb.append(value).append(" = ");
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if (i < list.size() - 1){
                        sb.append(" + ");
                    }
                }

            } else {
                sb.append(value).append(" is NOT perfect.");
            }
            sb.append("\n");
        }


        System.out.println(sb.toString());

    }
}