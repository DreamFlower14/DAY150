package February;

public class D13 {
    public static void main(String[] args) {
        // 프로그래머스 자릿수 더하기
        // 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

        D13 D = new D13();
        System.out.print(D.solution(930211));
    }

    public int solution(int n) {
        int answer = 0;

        while( n > 0 ){
            answer += n % 10;
            System.out.println(answer);
            n /= 10;
        }

        return answer;
    }
}