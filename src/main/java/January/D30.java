package January;

public class D30 {
    public static void main(String[] args) {
        // 프로그래머스 숨어있는 숫자의 덧셈 (1) [+1]
        // 문자열 my_string이 매개변수로 주어집니다.
        // my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

        D30 D = new D30();
        System.out.print(D.solution("aAb1B2cC34oOp"));
    }

    public int solution(String my_string) {
        int answer = 0;

        my_string = my_string.replaceAll("[^0-9]", "");
        System.out.println(my_string);

        System.out.println(answer);

        for (int i = 0; i < my_string.length(); i++) {
            answer = answer + my_string.charAt(i) - 48;
            System.out.println(my_string.charAt(i));
            System.out.println(answer);
        }

        return answer;
    }
}