/**
 * @AUTHOR       yoonghwan
 * @DATE         2024-08-02
 * @DESCRIBE     A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * @VERSION      1.0
 */
import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int i = 0; i < num; i++){
            listA.add(in.nextInt());
        }
        for (int i = 0; i < num; i++){
            listB.add(in.nextInt());
        }


        solution(listA,listB);
    }



    public static void solution(List<Integer> listA,List<Integer> listB){


        for (int i = 0; i < listA.size(); i++) {
            int a = listA.get(i);
            int b = listB.get(i);


            switch (a) {
                case 1:
                    switch (b) {
                        case 1:
                            System.out.println("D");
                            break;
                        case 2:
                            System.out.println("B");
                            break;
                        case 3:
                            System.out.println("A");
                            break;
                    }
                    break;
                case 2:
                    switch (b) {
                        case 1:
                            System.out.println("A");
                            break;
                        case 2:
                            System.out.println("D");
                            break;
                        case 3:
                            System.out.println("B");
                            break;
                    }
                    break;
                case 3:
                    switch (b) {
                        case 1:
                            System.out.println("B");
                            break;
                        case 2:
                            System.out.println("A");
                            break;
                        case 3:
                            System.out.println("D");
                            break;
                    }
                    break;
            }
        }

    }
}