package January;

import java.util.Scanner;

/**
 * 날짜 : 2023-01-16
 * 시간 : 오후 11:31
 * 백준 1316
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class D16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int reversed_a = scan.nextInt();
        int a = 0;
        int reversed_b = scan.nextInt();
        int b = 0;

        while (reversed_a != 0) {
            a = a * 10 + reversed_a % 10;
            reversed_a /= 10;
        }

        while (reversed_b != 0) {
            b = b * 10 + reversed_b % 10;
            reversed_b /= 10;
        }

        if ( a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
