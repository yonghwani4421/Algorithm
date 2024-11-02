package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 상수_2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int maxNum = 0;
        while(st.hasMoreTokens()){
            StringBuffer sb = new StringBuffer(st.nextToken());

            int compareNum = Integer.parseInt(String.valueOf(sb.reverse()));
            if (maxNum < compareNum )
                maxNum = compareNum;
        }

        System.out.println(maxNum);
    }
}