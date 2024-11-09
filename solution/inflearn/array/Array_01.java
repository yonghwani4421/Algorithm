/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-02
 * @DESCRIBE     N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.(첫 번째 수는 무조건 출력한다)
 * @VERSION      1.0
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++){
            list.add(in.nextInt());
        }

        System.out.println(solution(list));
    }



    public static String solution(List<Integer> input){
        int curCnt = 0;
        int prevCnt = 0;
        String answer = "";
        for (int i = 0; i < input.size(); i++){
            curCnt = input.get(i);
            if (i > 0){
                prevCnt = input.get(i-1);
                if (prevCnt < curCnt){
                    answer += input.get(i) + " ";
                }
            } else {
                answer += input.get(i) + " ";
            }
        }

       return answer;

    }

}