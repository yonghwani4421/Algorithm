package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 올바른괄호_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        Stack<Character> s = new Stack<>();

        for (char s1 : str.toCharArray()) {

            if (s.size() == 0 && s1 == ')'){
                s.push('x');
                break;
            }

            if (s1 == '('){
                s.push(s1);
            } else {
                if (s1 == ')' && s.peek() == '(')
                    s.pop();
            }
        }
        if (s.size() == 0)
            System.out.println("YES");
        else{
            System.out.println("NO");
        }

    }


}