package January;

public class D25 {
    public static void main(String[] args) {
        // 프로그래머스 팩토리얼 [+5]
        // i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
        // 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
        // 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.

        D25 D = new D25();
        System.out.print(D.solution(7));
    }

    public int solution(int n) {
        int answer = 0;

        if ((pac(1) <= n) && (n < pac(2))) {
            answer = 1;
        } else if ((pac(2) <= n) && (n < pac(3))) {
            answer = 2;
        } else if ((pac(3) <= n) && (n < pac(4))) {
            answer = 3;
        } else if ((pac(4) <= n) && (n < pac(5))) {
            answer = 4;
        } else if ((pac(5) <= n) && (n < pac(6))) {
            answer = 5;
        } else if ((pac(6) <= n) && (n < pac(7))) {
            answer = 6;
        } else if ((pac(7) <= n) && (n < pac(8))) {
            answer = 7;
        } else if ((pac(8) <= n) && (n < pac(9))) {
            answer = 8;
        } else if ((pac(9) <= n) && (n < pac(10))) {
            answer = 9;
        } else {
            answer = 10;
        }

        return answer;
    }

    public int pac(int n) {
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }
}