import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        Integer [] arr = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }


        Arrays.sort(arr,Collections.reverseOrder());

        for (int i : arr) {
            System.out.print(i);
        }



    }
}