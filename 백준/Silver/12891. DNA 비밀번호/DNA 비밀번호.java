import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String str = bf.readLine();

        st = new StringTokenizer(bf.readLine()," ");
        int [] password = new int[4];

        for (int i = 0; i < password.length; i++) {
            password[i] = Integer.parseInt(st.nextToken());
        }

        int[] current = new int[4];
        int answer = 0;
        for (int i = 0; i <P; i++) {
            plusArr(str, current, i);
        }
        if (!(password[0]-current[0] > 0 || password[1]-current[1] > 0 || password[2]-current[2] > 0 || password[3]-current[3] > 0)){
            answer++;
        }


        int rt = P;
        int lt = 0;
        while(rt < S){
            // 빼기
            subArr(str, current, lt);
            // 더하기
            plusArr(str, current, rt);

            if (!(password[0]-current[0] > 0 || password[1]-current[1] > 0 || password[2]-current[2] > 0 || password[3]-current[3] > 0)){
                answer++;
            }

            rt++;
            lt++;

        }
        System.out.println(answer);

    }

    private static void subArr(String str, int[] current, int lt) {
        if (str.charAt(lt) == 'A'){
            current[0]--;
        } else if (str.charAt(lt) == 'C'){
            current[1]--;
        } else if (str.charAt(lt) == 'G'){
            current[2]--;
        } else if (str.charAt(lt) == 'T'){
            current[3]--;
        }
    }

    private static void plusArr(String str, int[] current, int i) {
        if (str.charAt(i) == 'A'){
            current[0]++;
        } else if (str.charAt(i) == 'C'){
            current[1]++;
        } else if (str.charAt(i) == 'G'){
            current[2]++;
        } else if (str.charAt(i) == 'T'){
            current[3]++;
        }
    }
}