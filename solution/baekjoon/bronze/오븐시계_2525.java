package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class 오븐시계_2525 {

    private static final int TIME = 60;
    private static final int DAYTIME = 24;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int hours, minute, period;

        String[] s = bf.readLine().split(" ");
        hours = Integer.parseInt(s[0]);
        minute = Integer.parseInt(s[1]);
        period = Integer.parseInt(bf.readLine());

        hours = (( (minute + period) / TIME ) + hours) >= DAYTIME ? ((( (minute + period) / TIME ) + hours) - DAYTIME) : (( (minute + period) / TIME ) + hours);
        minute = ( (minute + period) % TIME );

        System.out.println(hours+ " " + minute);
    }
}