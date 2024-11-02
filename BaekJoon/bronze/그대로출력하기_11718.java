package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 그대로출력하기_11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String str = null;
        while((str = bf.readLine()) != null){
            sb.append(str+"\n");
        }
        System.out.print(sb.toString());
    }
}