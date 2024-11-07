package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 삼각형과세변_5073 {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        while((str = bf.readLine()) != null ){
            String[] s = str.split(" ");

            int side1 = Integer.parseInt(s[0]);
            int side2 = Integer.parseInt(s[1]);
            int side3 = Integer.parseInt(s[2]);

            if (side1 == 0) {
                return;
            }


            if (!(side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2)){
                System.out.println("Invalid");
            } else if (side1 == side2 && side2 == side3){
                System.out.println("Equilateral ");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene ");
            }


        }


    }
}