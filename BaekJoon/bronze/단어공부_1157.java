package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class 단어공부_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        str = str.toUpperCase();

        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            } else {
                Integer count = map.get(str.charAt(i)) + 1;
                map.replace(str.charAt(i),count);
            }
        }

        Integer max = Collections.max(map.values());

        int count = 0;
        String result = "";
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {


            if (max.equals(characterIntegerEntry.getValue())){
                count ++;
                result = String.valueOf(characterIntegerEntry.getKey());
            }
        }

        if (count > 1)
            System.out.print("?");
        else
            System.out.print(result);

    }
}