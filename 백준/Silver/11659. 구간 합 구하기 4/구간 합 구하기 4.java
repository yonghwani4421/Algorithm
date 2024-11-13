import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int arrayNum = Integer.parseInt(st.nextToken());
        int indexNum = Integer.parseInt(st.nextToken());


        int [] arr = new int[arrayNum+1];
        st = new StringTokenizer(bf.readLine()," ");
        for (int i = 1; i <= arrayNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int [] sum = new int[arrayNum+1];
        for (int i = 1; i <= arrayNum; i++) {
            sum[i] = sum[i-1] + arr[i];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indexNum; i++) {
            st = new StringTokenizer(bf.readLine()," ");

            int firstIdx = Integer.parseInt(st.nextToken());
            int secondIdx = Integer.parseInt(st.nextToken());

            int result = sum[secondIdx] - sum[firstIdx - 1];


            sb.append(result).append("\n");

        }

        System.out.println(sb.toString());


    }


}