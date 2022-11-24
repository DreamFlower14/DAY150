package November;

import java.util.Scanner;

/**
 * 날짜 : 2022-11-24
 * 시간 : 오후 11:36
 */
public class D24 {
    public static void main(String[] args) {
        // code up 7의 배수 확인하기 1155
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println(num % 7 == 0 ? "multiple" : "not multiple");
    }
}
