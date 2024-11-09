package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class 팰린드롬인지확인하기_10988 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = new String(bf.readLine());
        StringBuffer sb = new StringBuffer(str);

        if (str.equals(String.valueOf(sb.reverse())))
            System.out.println(1);
        else
            System.out.println(0);


    }
}