package inflearn.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 설명
 *
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 *
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 *
 *
 * 입력
 *
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 *
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 *
 *
 *
 */

public class 모든아나그램찾기_04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String S = bf.readLine();
        String T = bf.readLine();

        // 합계 미리 세팅
        int sumT = 0;
        int sumS = 0;
        for (int i = 0; i < T.length(); i++) {
            sumT += T.charAt(i);
            sumS += S.charAt(i);
        }

        int result = 0;
        if (sumS == sumT)
            result++;

        int lt = 0;

        for (int rt = T.length(); rt <S.length(); rt++) {
            sumS -= S.charAt(lt++);
            sumS += S.charAt(rt);

            if (sumS == sumT)
                result++;
        }
        System.out.println(result);

    }
}