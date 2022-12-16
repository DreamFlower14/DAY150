package December;

import java.util.Scanner;

/**
 * 날짜 : 2022-12-16
 * 시간 : 오후 10:29
 */
public class D16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(((i == 3) | (i == 6) | (i == 9))? "X ":i+ " ");
        }
    }
}
