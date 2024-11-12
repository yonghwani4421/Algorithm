import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 설명
 *
 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 *
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 *
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 *
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 *
 *
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        String str = bf.readLine();

//        char maxKey = solution1(num, str);
        char maxKey = solution2(num, str);
        System.out.println(maxKey);
    }

    private static char solution2(int num, String str) {
        Map<Character,Integer> map = new HashMap<>();
        for (char x: str.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        char maxKey = 0;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {

            if(max < characterIntegerEntry.getValue()){
                max = characterIntegerEntry.getValue();
                maxKey = characterIntegerEntry.getKey();
            }
        }
        return maxKey;


    }

    private static char solution1(int num, String str) {
        Map<Character,Integer> map = new HashMap<>();

        map.put('A',0);
        map.put('B',0);
        map.put('C',0);
        map.put('D',0);
        map.put('E',0);

        for (int i = 0; i < num; i++) {
            char c = str.charAt(i);
            int val = map.get(c);
            map.put(c,++val);
        }
        char maxKey = 0;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {

            if(max < characterIntegerEntry.getValue()){
                max = characterIntegerEntry.getValue();
                maxKey = characterIntegerEntry.getKey();
            }
        }
        return maxKey;
    }

}