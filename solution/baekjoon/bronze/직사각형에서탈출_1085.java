package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class 직사각형에서탈출_1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());


        ArrayList<Integer> list = new ArrayList<>();
        list.add(w - x);
        list.add(x);
        list.add(y);
        list.add(h - y);

        System.out.println(Collections.min(list));

    }
}