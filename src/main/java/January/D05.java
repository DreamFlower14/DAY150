package January;

public class D05 {
    public static void main(String[] args) {
        // 프로그래머스 배열 자르기 [+1]
        // 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
        // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.

        int[] num = {1, 2, 3, 4, 5};
        D05 D = new D05();
        System.out.print(D.solution(num,1,3));
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[num1];
            num1++;
            System.out.println(answer[i]);
        }
        return answer;
    }
}