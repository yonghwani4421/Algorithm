package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class 너의평점은_25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        Map<String,String> map = new HashMap<>();
        map.put("A+", "4.5");
        map.put("A0", "4.0");
        map.put("B+", "3.5");
        map.put("B0", "3.0");
        map.put("C+", "2.5");
        map.put("C0", "2.0");
        map.put("D+", "1.5");
        map.put("D0", "1.0");
        map.put("F", "0.0");
        map.put("P", "0.0");


        double totalSum = 0;
        double scoreSum = 0;

        for (int i = 0; i < 20; i++) {
            String str = bf.readLine();

            String[] s = str.split(" ");

            String subject = s[0];
            double score = Double.parseDouble(s[1]);
            String grade = s[2];

//            System.out.println("과목이름 = " + subject+ ", 과목 학점 = " + score + ", 과목 등급 = " + Double.parseDouble(map.get(grade)));

            // 학점 * 등급
            if (!"P".equals(grade)){
                totalSum += (score * Double.parseDouble(map.get(grade)));
                scoreSum += score;
            }

        }

//        System.out.println("totalSum = " + totalSum);
//        System.out.println("scoreSum = " + scoreSum);
//        System.out.println("result = " + totalSum / scoreSum);


        System.out.printf("%.6f", ( totalSum / scoreSum) );
    }
}