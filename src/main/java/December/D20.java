package December;

import java.util.Arrays;

public class D20 {
    public static void main(String[] args) {
        // 프로그래머스 최댓값 만들기 (1)
        D20 D = new D20();
        int[] num = {1, 2, 3, 4, 5};
        System.out.print(D.solution(num));

    }
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-2]*numbers[numbers.length-1];
    }

}