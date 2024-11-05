package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidPS {
     /*
        괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다.
        그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
        한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
        만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
        예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.

        여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.
         */



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 갯수
        Integer s = Integer.valueOf(br.readLine());

        for (int i = 0; i < s; i++){
            System.out.println(CheckValue(br.readLine()));
        }

    }

    private static String CheckValue(String value){

        // 홀수라면 || 처음 이 '('가 아니라면
        if (value.length() % 2 != 0 || value.charAt(0) != '('){
            return "NO";
        } else {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < value.length(); i++){
                if (value.charAt(i) == '('){
                    stack.push(value.charAt(i));
                } else {
                    if (stack.isEmpty())
                        return "NO";
                    stack.pop();
                }
            }

            if (stack.isEmpty()){
                return "YES";
            } else {
                return "NO";
            }
        }
    }


}
