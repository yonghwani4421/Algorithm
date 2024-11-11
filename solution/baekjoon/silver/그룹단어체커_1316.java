package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 그룹단어체커_1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(bf.readLine());
        }

        String temp = "";

        int result = 0;
        for (String s : list) {

            for (int i = 0; i < s.length(); i++) {
                if (temp.isEmpty()){
                    temp += s.charAt(i);
                } else {
                    if (temp.charAt(temp.length() - 1) != s.charAt(i)){
                        temp += s.charAt(i);
                    }
                }
            }

            for (int i = 0; i < temp.length(); i++) {
                char c = temp.charAt(i);
                temp = temp.replace(c, (char) 0);
                if (temp.contains(String.valueOf(c))){
                    count--;
                    break;
                }
            }

            temp = "";

        }

        System.out.println(count);





    }
}