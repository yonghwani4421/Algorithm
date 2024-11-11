import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *설명
 *
 * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 *
 * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 *
 * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 *
 * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 *
 * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
 *
 *
 * 출력
 */



public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int firstArrayNum = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine()," ");

        int[] firstArr = new int[firstArrayNum];
        for (int i = 0; i < firstArrayNum; i++) {
            firstArr[i] = Integer.parseInt(st.nextToken());
        }

        int secondArrayNum = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine()," ");

        int[] secondArr = new int[secondArrayNum];
        for (int i = 0; i < secondArrayNum; i++) {
            secondArr[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        int p1 = 0;
        int p2 = 0;


        ArrayList<Integer> list = new ArrayList<>();
        // 정렬후 2개의 포인터로 두개의 배열을 탐색하며 원하는 값을 추출
        while(p1<firstArrayNum && p2<secondArrayNum){

            if (firstArr[p1] < secondArr[p2]){
                p1++;
            } else if (firstArr[p1] > secondArr[p2]){
                p2++;
            } else{
                list.add(firstArr[p1]);
                p1++;
                p2++;
            }
        }
        for (Integer integer : list) {
            System.out.print( integer + " ");
        }
    }
}