package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;


public class 크로아티아알파벳_2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        String[] changeArray = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        List<String> list = Arrays.asList(changeArray);


        for (String s : list) {
            str = str.replaceAll(s,"1");
        }


        System.out.println(str.length());


    }
}