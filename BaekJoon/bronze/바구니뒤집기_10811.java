package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 바구니뒤집기_10811 {

//    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] strCast = bf.readLine().split(" ");
//
//        int basketCount = Integer.parseInt(strCast[0]);
//        int methodCount = Integer.parseInt(strCast[1]);
//
//        int[] basket = new int[basketCount+1];
//
//        int start , end;
//
//
//        // 초기화
//
//        for (int i = 1; i <= basketCount; i++) {
//            basket[i] = i;
//        }
//
//        for (int i = 0; i < methodCount; i++) {
//            String[] str = bf.readLine().split(" ");
//
//            start = Integer.parseInt(str[0]);
//            end = Integer.parseInt(str[1]);
//
//            ArrayList<Integer> list = new ArrayList<>();
//
//            for (int j = start; j <= end; j++) {
//                list.add(basket[j]);
//            }
//
//            Collections.reverse(list);
//
//            for (Integer data : list) {
//                basket[start++] = data;
//            }
//        }
//
//        for (int i = 1; i < basketCount+1; i++) {
//            System.out.print(basket[i] + " ");
//        }
//    }


    // 2번 풀이
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] strCast = bf.readLine().split(" ");

        int basketCount = Integer.parseInt(strCast[0]);
        int methodCount = Integer.parseInt(strCast[1]);

        int[] basket = new int[basketCount+1];

        int start , end;


        // 초기화

        for (int i = 1; i <= basketCount; i++) {
            basket[i] = i;
        }

        for (int i = 0; i < methodCount; i++) {
            String[] str = bf.readLine().split(" ");

            start = Integer.parseInt(str[0]);
            end = Integer.parseInt(str[1]);

           while(start < end){
               int temp = basket[start];
               basket[start++] = basket[end];
               basket[end--] = temp;
           }

        }

        for (int i = 1; i < basketCount+1; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}