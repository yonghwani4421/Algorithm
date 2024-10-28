package level1; /**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-12
 * @DESCRIBE
 * 당신은 동영상 재생기를 만들고 있습니다. 당신의 동영상 재생기는 10초 전으로 이동, 10초 후로 이동, 오프닝 건너뛰기 3가지 기능을 지원합니다. 각 기능이 수행하는 작업은 다음과 같습니다.
 *
 * 10초 전으로 이동: 사용자가 "prev" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 전으로 이동합니다. 현재 위치가 10초 미만인 경우 영상의 처음 위치로 이동합니다. 영상의 처음 위치는 0분 0초입니다.
 * 10초 후로 이동: 사용자가 "next" 명령을 입력할 경우 동영상의 재생 위치를 현재 위치에서 10초 후로 이동합니다. 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다. 영상의 마지막 위치는 동영상의 길이와 같습니다.
 * 오프닝 건너뛰기: 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.
 * 동영상의 길이를 나타내는 문자열 video_len, 기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos, 오프닝 시작 시각을 나타내는 문자열 op_start, 오프닝이 끝나는 시각을 나타내는 문자열 op_end, 사용자의 입력을 나타내는 1차원 문자열 배열 commands가 매개변수로 주어집니다. 이때 사용자의 입력이 모두 끝난 후 동영상의 위치를 "mm:ss" 형식으로 return 하도록 solution 함수를 완성해 주세요.
 *
 * @VERSION      1.0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Video {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String video_len = br.readLine();
        String pos = br.readLine();
        String op_start = br.readLine();
        String op_end = br.readLine();

        String[] commands = new String[100];

        String line;

        int cnt = 0;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            commands[cnt++] = line;
        }


        System.out.println(solution(video_len,pos,op_start,op_end,commands));
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";



        // 3가지 기능

        // 1. 10초 전으로 이동 => prev
        // 2. 10초 후로 이동 => next
        // 3. 오프닝 건너 뛰기 => 현재 재생 위치가 오프닝 구간(op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동합니다.

        for (String command : commands) {
            if (command == null){
                break;
            }
            if (convertToSeconds(pos) >= convertToSeconds(op_start) && convertToSeconds(pos) <= convertToSeconds(op_end)){
                pos = op_end;
            }

            pos = prevOrNext(pos, command);

            int l = convertToSeconds(video_len) - convertToSeconds(pos);

            // 동영상의 남은 시간이 10초 미만일 경우 영상의 마지막 위치로 이동합니다.
            if (convertToSeconds(pos) > convertToSeconds(video_len) || l < 10){
                pos = video_len;
            }

        }

        // 먼저 오프닝 구간인지 확인 (오프닝 구간)
        if (convertToSeconds(pos) >= convertToSeconds(op_start) && convertToSeconds(pos) <= convertToSeconds(op_end)){
            pos = op_end;
        }

        return pos;
    }


    public static int convertToSeconds(String time) {
        // 분과 초로 분리
        String[] parts = time.split(":");
        int minutes = 0;
        int seconds = 0;

        if (!"00".equals(parts[0])){
            minutes = Integer.parseInt(parts[0]);
        }
        if (!"00".equals(parts[1])) {
            seconds = Integer.parseInt(parts[1]);
        }
        // 분을 초로 변환하고 밀리세컨드로 계산
        return (minutes * 60) + seconds;
    }

    public static String prevOrNext(String time, String command) {
        String[] parts = time.split(":");
        int minutes = 0;
        int seconds = 0;

        if (!"00".equals(parts[0])){
            minutes = Integer.parseInt(parts[0]);
        }
        if (!"00".equals(parts[1])) {
            seconds = Integer.parseInt(parts[1]);
        }

        if ("prev".equals(command)){
            seconds = seconds - 10;

            // 만약 음수면 분빼주자
            if (seconds < 0){
                minutes--;
                if (minutes < 0){
                    minutes = 0;
                    seconds = 0;
                } else {
                    seconds = seconds+60;
                }
            }



        } else if ("next".equals(command)){
            seconds = seconds + 10;

            // 만약 60 넘어가면
            if (seconds > 60){
                minutes++;
                seconds = Math.abs(seconds-60);
            }
        }

        // 검사

        String s;
        String m;
        if (seconds < 10){
            s = "0" + String.valueOf(seconds);
        } else {
            s = String.valueOf(seconds);
        }
        if (minutes < 10){
            m = "0" + String.valueOf(minutes);
        } else {
            m = String.valueOf(minutes);
        }

        return m + ":" + s;

    }
}