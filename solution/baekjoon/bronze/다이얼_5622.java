package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class 다이얼_5622 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        Map<Integer,String> map = new HashMap<>();

        map.put(0,"");
        map.put(1,"");
        map.put(2,"ABC");
        map.put(3,"DEF");
        map.put(4,"GHI");
        map.put(5,"JKL");
        map.put(6,"MNO");
        map.put(7,"PQRS");
        map.put(8,"TUV");
        map.put(9,"WXYZ");

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            for (Integer key : map.keySet()) {
                if (map.get(key).contains(String.valueOf(str.charAt(i)))){
                    result += key+1;
                }
            }
        }


        System.out.println(result);

    }
}