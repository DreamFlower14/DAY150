package January;

import java.util.Scanner;

/**
 * 날짜 : 2023-01-09
 * 시간 : 오후 10:16
 */
public class D09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int answer = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){    // 짝수일 때
                answer -= i;
            }else {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
