package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class 대지_9063 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(bf.readLine());

        ArrayList<Integer> listX = new ArrayList<>();
        ArrayList<Integer> listY = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] s = bf.readLine().split(" ");

            listX.add(Integer.valueOf(s[0]));
            listY.add(Integer.valueOf(s[1]));


        }

        int w = Math.abs(Collections.min(listX) - Collections.max(listX));
        int h = Math.abs(Collections.min(listY) - Collections.max(listY));

        System.out.println(w*h);


    }
}