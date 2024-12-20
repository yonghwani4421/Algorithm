package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Stack {

//    정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//    명령은 총 다섯 가지이다.
//
//    push X: 정수 X를 스택에 넣는 연산이다.
//            pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//    size: 스택에 들어있는 정수의 개수를 출력한다.
//            empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//    top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

    public static class MyStack<E>{
        private ArrayList<E> list;
        private int top;

        private static int DEFAULT_EMPTY_VAL = -1;

        public MyStack() {
            list = new ArrayList<>();
            top = DEFAULT_EMPTY_VAL;
        }

        public Integer isEmpty(){

            if (top == -1){
                return 1;
            } else {
                return 0;
            }
        }

        public void push(E value){
            list.add(value);
            top++;
        }
        public Object pop(){

            if (list.isEmpty())
                return DEFAULT_EMPTY_VAL;

            E value = list.get(top);
            list.remove(top--);

            return value;
        }

        public Integer size(){
            return list.size();
        }

        public E top(){
            return list.get(top);
        }
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 갯수
        Integer s = Integer.valueOf(br.readLine());


        MyStack<Integer> stack = new MyStack<>();

        for (int i = 0; i < s; i++){
            String str = br.readLine();
            String [] arr = str.split(" ");

            if ("push".equals(arr[0])){
                stack.push(Integer.valueOf(arr[1]));
            } else if ("pop".equals(arr[0])){
                System.out.println(stack.pop());
            } else if ("size".equals(arr[0])) {
                System.out.println(stack.size());
            } else if ("empty".equals(arr[0])) {
                System.out.println(stack.isEmpty());
            } else if ("top".equals(arr[0])) {
                System.out.println(stack.top());
            }
        }
    }

}
