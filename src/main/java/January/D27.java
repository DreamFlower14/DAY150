package January;

import java.util.Arrays;

public class D27 {
    public static void main(String[] args) {
        // 프로그래머스 문자열 정렬하기 (1)
        // 문자열 my_string이 매개변수로 주어질 때,
        // my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

        D27 D = new D27();
        System.out.print(D.solution("abcde0"));
    }

    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", "");
        System.out.println(my_string);

        int[] answer = new int[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i) - 48;
            System.out.println("answer" + i + "번째 값 : " + answer[i]);
        }

        Arrays.sort(answer);

        return answer;
    }
}