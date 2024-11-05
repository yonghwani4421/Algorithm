package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 배수와약수_5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String str = "";
        StringBuilder sb = new StringBuilder();

        while((str = bf.readLine()) != null){

            String[] temp = str.split(" ");


            int firstNum = Integer.parseInt(temp[0]);
            int secondNum = Integer.parseInt(temp[1]);

            if ((firstNum < secondNum) && (secondNum % firstNum) == 0){
                // 약수
                sb.append("factor\n");
            } else if ((firstNum > secondNum) && (firstNum % secondNum) == 0) {
                sb.append("multiple\n");
            } else if (firstNum == secondNum){
                break;
            } else{
                sb.append("neither\n");
            }


        }

        System.out.println(sb.toString());

    }

}