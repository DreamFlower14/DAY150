package October;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * 날짜 : 2022-10-18
 * 시간 : 오후 12:09
 */
public class D12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solution(2,10));
    }

    double a = pow(1,5);

    public static int solution(int n, int t) {
            int b = (int) pow(2,t);
            int answer = b * n;
            return answer;
    }
}
