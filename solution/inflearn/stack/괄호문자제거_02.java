package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호문자제거_02 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        Stack<Character> s = new Stack<>();

        StringBuilder sb = new StringBuilder();
        boolean isExist = false;

        for (char s1 : str.toCharArray()) {
            if ('(' == s1){
                isExist = true;
            } else if (')' == s1 && isExist){
                while(true){
                    if (s.peek() == '('){
                        s.pop();
                        break;
                    } else {
                        s.pop();
                    }
                }

                if (!s.contains('(')){
                    isExist = false;
                }
            }

            if (')' != s1)
                s.push(s1);

        }

        for (Character character : s) {
            System.out.print( character );
        }


    }


}