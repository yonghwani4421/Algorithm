package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 문자와문자열_27866 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String words = bf.readLine();

        int index = Integer.parseInt(bf.readLine());

        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);

            if (i == (index - 1)){
                System.out.println(c);
            }
        }
    }


}