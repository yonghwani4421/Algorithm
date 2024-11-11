/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-02
 * @DESCRIBE    선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 *              선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
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



    public static int solution(List<Integer> input){
        int max = 0;

        int answer = 0;
        for (int i = 0; i < input.size(); i++){
             if (i == 0){
                 answer++;
                 max = input.get(i);
             } else {
                if (max < input.get(i)){
                    answer++;
                    max = input.get(i);
                }
             }
        }
       return answer;
    }
}