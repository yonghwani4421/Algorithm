package inflearn.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 후위식연산_04 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();

        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= 48 && str.charAt(i) <= 57){
                int value = Integer.parseInt(String.valueOf(str.charAt(i)));
                stack.push(value);
            } else {
                String operation = String.valueOf(str.charAt(i));
                int rt = stack.pop();
                int lt = stack.pop();
                if ("+".equals(operation)){
                    stack.push(lt + rt);
                } else if ("-".equals(operation)) {
                    stack.push(lt - rt);
                } else if ("/".equals(operation)) {
                    stack.push(lt / rt);
                } else {
                    stack.push(lt * rt);
                }
            }
        }

        System.out.println(stack.pop());


    }
}