package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 체스_3003 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        // init
        int[] chessArray = {1,1,2,2,2,8};


        int count = 0;
        while(st.hasMoreTokens()){
            sb.append(chessArray[count++] - Integer.parseInt(st.nextToken())).append(" ");
        }


        System.out.println(sb.toString());

    }
}