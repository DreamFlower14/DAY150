package November;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // 프로그래머스 문자열 다루기 기본 11점 !!!!
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();

        System.out.println(num.replaceAll("[^1-9]","") == num ? "1 - 9 포함 " : "미포함");

    }
}
