package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 과제안내신분_5597 {

    private static final int STUDENT_NUM = 30;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] assignment = new int[STUDENT_NUM + 1];


        String temp;
        int number;
        while ((temp = bf.readLine()) != null){
            number = Integer.parseInt(temp);
            assignment[number] = number;
        }


        for (int i = 1; i < STUDENT_NUM + 1; i++) {
            if (assignment[i] == 0){
                System.out.println(i);
            }
        }
    }
}